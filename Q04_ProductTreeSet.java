import java.util.*;

/** Q04: Product implements Comparable; TreeSet orders by price then ID. */
public class Q04_ProductTreeSet {
    static class Product implements Comparable<Product> {
        private final int id;
        private final String name;
        private final double price;
        Product(int id, String name, double price) {
            this.id = id; this.name = name; this.price = price;
        }
        public int getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        void display() { System.out.printf("%d - %s - Rs %.2f%n", id, name, price); }
        @Override public int compareTo(Product other) {
            int byPrice = Double.compare(price, other.price);
            return byPrice != 0 ? byPrice : Integer.compare(id, other.id);
        }
    }
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product(1, "Mouse", 500));
        products.add(new Product(2, "Keyboard", 850));
        products.add(new Product(3, "USB Cable", 200));
        products.add(new Product(4, "Notebook", 80));
        products.add(new Product(5, "Pen Drive", 850));
        System.out.println("Products sorted by price:");
        for (Product product : products) product.display();
    }
}
