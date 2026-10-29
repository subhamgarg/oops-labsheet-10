import java.util.*;

/** Q07: Customer encapsulation; store in Vector<Customer>. */
public class Q07_CustomerVector {
    static class Customer {
        private int id;
        private String name;
        private String email;
        Customer(int id, String name, String email) {
            setId(id); setName(name); setEmail(email);
        }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        void display() { System.out.printf("%d: %s <%s>%n", id, name, email); }
    }
    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();
        customers.add(new Customer(1, "Asha", "asha@example.com"));
        customers.add(new Customer(2, "Ravi", "ravi@example.com"));
        customers.get(1).setEmail("ravi.new@example.com");
        for (Customer customer : customers) customer.display();
    }
}
