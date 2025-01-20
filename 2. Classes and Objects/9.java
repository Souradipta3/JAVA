// Assignment 9: Figure Class with Constructor Overloading
class Figure {
    public Figure(double side) { // Cube
        double surfaceArea = 6 * side * side;
        System.out.println("Cube Surface Area: " + surfaceArea);
    }

    public Figure(double radius, boolean isSphere) { // Sphere
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }

    public Figure(double radius, double height) { // Cylinder
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Cylinder Surface Area: " + surfaceArea);
    }

    public static void main(String[] args) {
        new Figure(3); // Cube
        new Figure(4, true); // Sphere
        new Figure(3, 5); // Cylinder
    }
}
