package Shapes;

public interface ShapeCalculatable {
    double calculatePerimeter();
    double calculateArea();
    default void printPerimeter() {
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    default void printArea() {
        System.out.println("Area: " + calculateArea());
    }
}
