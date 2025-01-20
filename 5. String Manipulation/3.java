// Assignment 5.3: Convert Double Value to String
public class DoubleToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double value = scanner.nextDouble();

        String valueStr = String.valueOf(value);
        System.out.println("Double as a string: " + valueStr);
    }
}

// Explanation: This program converts a double value to its string representation.
