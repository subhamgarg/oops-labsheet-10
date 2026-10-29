import java.util.*;

/** Q03: A Book's ID defines equality to prevent duplicates in HashSet. */
public class Q03_BookHashSet {
    static class Book {
        private final int id;
        private final String title;
        private final String author;
        Book(int id, String title, String author) {
            this.id = id; this.title = title; this.author = author;
        }
        void display() { System.out.println(id + ": " + title + " by " + author); }
        @Override public boolean equals(Object other) {
            if (this == other) return true;
            if (!(other instanceof Book)) return false;
            return id == ((Book) other).id;
        }
        @Override public int hashCode() { return Integer.hashCode(id); }
    }
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        System.out.println("Added first book? " + books.add(new Book(1, "Java Basics", "A. Kumar")));
        System.out.println("Added second book? " + books.add(new Book(2, "Data Structures", "B. Singh")));
        System.out.println("Added duplicate ID? " + books.add(new Book(1, "Other Title", "C. Rao")));
        for (Book book : books) book.display();
    }
}
