// Assignment 2.1: Rectangle Class with Methods to Calculate Area and Display
class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calcArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width + ", Area = " + calcArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.display();
    }
}

// Explanation: This class defines a rectangle with methods to calculate its area and display its properties.
