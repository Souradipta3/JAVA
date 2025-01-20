// Assignment 7: Triangle Class with Array of Objects
class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public void display() {
        System.out.println("Triangle [Base=" + base + ", Height=" + height + ", Area=" + area() + "]");
    }

    public static void main(String[] args) {
        Triangle[] triangles = {
            new Triangle(5, 10),
            new Triangle(8, 12),
            new Triangle(6, 7)
        };

        Triangle largest = triangles[0];
        for (Triangle t : triangles) {
            t.display();
            if (t.area() > largest.area()) {
                largest = t;
            }
        }

        System.out.println("\nTriangle with the largest area:");
        largest.display();
    }
}
