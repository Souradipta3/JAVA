// Assignment 1.2: Calculate Sum and Average of Two Numbers (Command Line Input)
public class SumAndAverage {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double sum = num1 + num2;
            double average = sum / 2;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric values.");
        }
    }
}

// Explanation: This program calculates the sum and average of two numbers passed as command-line arguments.
