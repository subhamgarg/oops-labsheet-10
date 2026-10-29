import java.util.*;

/** Q01: Add, remove and iterate Student objects in ArrayList. */
public class Q01_StudentArrayList {
    static class Student {
        private final int id;
        private final String name;
        Student(int id, String name) { this.id = id; this.name = name; }
        void display() { System.out.println(id + " - " + name); }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Asha"));
        students.add(new Student(2, "Ravi"));
        students.add(new Student(3, "Neha"));
        System.out.println("Before removal:");
        for (Student student : students) student.display();
        students.remove(1);
        System.out.println("After removal:");
        for (Student student : students) student.display();
    }
}
