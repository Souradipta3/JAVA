// Assignment 2.3: Complex Class with Add, Subtract, and isEqual Methods
class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public boolean isEqual(Complex other) {
        return this.real == other.real && this.imag == other.imag;
    }

    public void display() {
        System.out.println("Complex Number: " + real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 2.5);
        Complex c2 = new Complex(1.5, 1.0);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);

        c1.display();
        c2.display();
        sum.display();
        diff.display();
        System.out.println("Are c1 and c2 equal? " + c1.isEqual(c2));
    }
}

// Explanation: This class provides methods to add, subtract, and compare two complex numbers.
