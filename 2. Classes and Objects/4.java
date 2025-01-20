// Assignment 4: Box Class with Volume Calculation
class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public void display() {
        System.out.println("Box [Width=" + width + ", Height=" + height + ", Depth=" + depth + ", Volume=" + volume() + "]");
    }

    public static Box compareVolume(Box b1, Box b2) {
        return b1.volume() > b2.volume() ? b1 : b2;
    }

    public static void main(String[] args) {
        Box box1 = new Box(3, 4, 5);
        Box box2 = new Box(6, 7, 8);
        Box box3 = new Box(2, 3, 4);

        box1.display();
        box2.display();
        box3.display();

        Box largest = compareVolume(compareVolume(box1, box2), box3);
        System.out.println("\nBox with the largest volume:");
        largest.display();
    }
}
