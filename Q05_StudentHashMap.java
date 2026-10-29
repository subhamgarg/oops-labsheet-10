import java.util.*;

/** Q05: Student record with HashMap roll-number -> Student. */
public class Q05_StudentHashMap {
    static class Student {
        private final int roll;
        private final String name;
        Student(int roll, String name) { this.roll = roll; this.name = name; }
        void display() { System.out.println("Roll: " + roll + ", Name: " + name); }
    }
    static class Registry {
        private final HashMap<Integer, Student> students = new HashMap<>();
        void add(int roll, String name) { students.put(roll, new Student(roll, name)); }
        void remove(int roll) { students.remove(roll); }
        void display() {
            new TreeMap<>(students).values().forEach(Student::display);
        }
    }
    public static void main(String[] args) {
        Registry registry = new Registry();
        registry.add(103, "Neha"); registry.add(101, "Asha"); registry.add(102, "Ravi");
        System.out.println("All students:"); registry.display();
        registry.remove(102);
        System.out.println("After removing roll 102:"); registry.display();
    }
}
