import java.util.*;

/** Q10: Department base class; Teacher derived class; map by department. */
public class Q10_DepartmentTeacherMap {
    static class Department {
        private final int id;
        private final String name;
        Department(int id, String name) { this.id = id; this.name = name; }
        public String getName() { return name; }
        @Override public boolean equals(Object other) {
            if (this == other) return true;
            if (!(other instanceof Department)) return false;
            return id == ((Department) other).id;
        }
        @Override public int hashCode() { return Integer.hashCode(id); }
    }
    static class Teacher extends Department {
        private final int teacherId;
        private final String teacherName;
        Teacher(int teacherId, String teacherName, Department department) {
            super(department.id, department.name);
            this.teacherId = teacherId;
            this.teacherName = teacherName;
        }
        @Override public String toString() { return teacherId + " - " + teacherName; }
    }
    static class College {
        private final ArrayList<Department> departments = new ArrayList<>();
        private final HashMap<Department, List<Teacher>> teachers = new HashMap<>();
        void addDepartment(Department department) {
            if (!departments.contains(department)) {
                departments.add(department);
                teachers.put(department, new ArrayList<>());
            }
        }
        void addTeacher(Department department, Teacher teacher) {
            if (!teachers.containsKey(department)) addDepartment(department);
            teachers.get(department).add(teacher);
        }
        void display() {
            for (Department department : departments) {
                System.out.println("Department: " + department.getName());
                for (Teacher teacher : teachers.get(department)) {
                    System.out.println("  " + teacher);
                }
            }
        }
    }
    public static void main(String[] args) {
        Department cs = new Department(1, "Computer Science");
        Department math = new Department(2, "Mathematics");
        College college = new College();
        college.addDepartment(cs); college.addDepartment(math);
        college.addTeacher(cs, new Teacher(101, "Dr. Asha", cs));
        college.addTeacher(cs, new Teacher(102, "Dr. Ravi", cs));
        college.addTeacher(math, new Teacher(201, "Dr. Neha", math));
        college.display();
    }
}
