// Assignment 8: Parameterized Constructors for Square and Rectangle
class Shape {
    private double area;

    public Shape(double side) { // Square
        this.area = side * side;
    }

    public Shape(double length, double width) { // Rectangle
        this.area = length * width;
    }

    public void display() {
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Shape square = new Shape(4);
        Shape rectangle = new Shape(5, 7);

        System.out.println("Square:");
        square.display();

        System.out.println("\nRectangle:");
        rectangle.display();
    }
}
