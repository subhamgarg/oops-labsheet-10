import java.util.*;

/** Q09: Queue<Patient> using LinkedList; serve in FIFO order. */
public class Q09_PatientQueue {
    static class Patient {
        private final int id;
        private final String name;
        Patient(int id, String name) { this.id = id; this.name = name; }
        @Override public String toString() { return id + " - " + name; }
    }
    static class Clinic {
        private final Queue<Patient> waiting = new LinkedList<>();
        void add(Patient patient) { waiting.offer(patient); }
        void serve() {
            Patient patient = waiting.poll();
            System.out.println(patient == null ? "Nobody is waiting" : "Serving: " + patient);
        }
    }
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.add(new Patient(1, "Asha"));
        clinic.add(new Patient(2, "Ravi"));
        clinic.add(new Patient(3, "Neha"));
        clinic.serve(); clinic.serve(); clinic.serve(); clinic.serve();
    }
}
