import java.util.*;

/** Q08: Stack<Task> models LIFO task completion. */
public class Q08_TaskStack {
    static class Task {
        private final int taskId;
        private final String description;
        Task(int taskId, String description) {
            this.taskId = taskId; this.description = description;
        }
        @Override public String toString() { return taskId + " - " + description; }
    }
    static class TaskManager {
        private final Stack<Task> tasks = new Stack<>();
        void push(Task task) { tasks.push(task); System.out.println("Added: " + task); }
        void pop() {
            if (tasks.empty()) System.out.println("No tasks to complete");
            else System.out.println("Completed: " + tasks.pop());
        }
        void display() { System.out.println("Remaining tasks: " + tasks); }
    }
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.push(new Task(1, "Write code"));
        manager.push(new Task(2, "Test code"));
        manager.push(new Task(3, "Prepare report"));
        manager.pop(); manager.display();
    }
}
