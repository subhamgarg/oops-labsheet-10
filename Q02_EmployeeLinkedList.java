import java.util.*;

/** Q02: Employee inherits Person; LinkedList add, display, search. */
public class Q02_EmployeeLinkedList {
    static class Person {
        protected String name;
        Person(String name) { this.name = name; }
    }
    static class Employee extends Person {
        private final int empId;
        Employee(int empId, String name) { super(name); this.empId = empId; }
        void display() { System.out.printf("ID: %d, Name: %s%n", empId, name); }
    }
    static class Directory {
        private final LinkedList<Employee> employees = new LinkedList<>();
        void add(Employee employee) { employees.add(employee); }
        void display() { for (Employee e : employees) e.display(); }
        Employee searchByName(String name) {
            for (Employee e : employees) {
                if (e.name.equalsIgnoreCase(name)) return e;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.add(new Employee(101, "Riya"));
        directory.add(new Employee(102, "Aman"));
        directory.add(new Employee(103, "Sara"));
        directory.display();
        Employee found = directory.searchByName("aman");
        System.out.println("Search result:");
        if (found != null) found.display(); else System.out.println("Not found");
    }
}
