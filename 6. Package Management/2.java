// ---- Part 1: Square, Triangle, and Circle Classes Stored in the `shapes` Package ----
package geometry.shapes;

public class Square {
    private double side;

    // Mutator and Accessor for side
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    // Method to calculate area of the square
    public double calculateArea() {
        return side * side;
    }

    // Method to calculate perimeter of the square
    public double calculatePerimeter() {
        return 4 * side;
    }
}

public class Triangle {
    private double base;
    private double height;

    // Mutator and Accessor for base and height
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // Method to calculate area of the triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Method to calculate perimeter (assuming an equilateral triangle for simplicity)
    public double calculatePerimeter() {
        return 3 * base;
    }
}

public class Circle {
    private double radius;

    // Mutator and Accessor for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// ---- Part 2: Main Class Stored in the `mainpkg2` Package ----
package geometry.mainpkg2;

import geometry.shapes.Square;
import geometry.shapes.Triangle;
import geometry.shapes.Circle;

public class MainClass {
    public static void main(String[] args) {
        // Create objects of Square, Triangle, and Circle
        Square square = new Square();
        square.setSide(4);

        Triangle triangle = new Triangle();
        triangle.setBase(5);
        triangle.setHeight(3);

        Circle circle = new Circle();
        circle.setRadius(7);

        // Displaying Area and Perimeter for Square
        System.out.println("Square - Area: " + square.calculateArea() + ", Perimeter: " + square.calculatePerimeter());

        // Displaying Area and Perimeter for Triangle
        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());

        // Displaying Area and Perimeter for Circle
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
    }
}

