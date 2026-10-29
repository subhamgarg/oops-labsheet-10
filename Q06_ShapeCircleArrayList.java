import java.util.*;

/** Q06: Circle inherits Shape; ArrayList<Shape> demonstrates polymorphism. */
public class Q06_ShapeCircleArrayList {
    static abstract class Shape {
        abstract double area();
    }
    static class Circle extends Shape {
        private final double radius;
        Circle(double radius) { this.radius = radius; }
        @Override double area() { return Math.PI * radius * radius; }
    }
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2)); shapes.add(new Circle(3)); shapes.add(new Circle(5));
        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("Circle %d area: %.2f%n", i + 1, shapes.get(i).area());
        }
    }
}
