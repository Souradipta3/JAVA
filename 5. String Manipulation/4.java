// Assignment 5.4: Check Whether a String Contains Characters, Digits, or Both
public class StringContentChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean hasLetters = input.matches(".*[a-zA-Z].*");
        boolean hasDigits = input.matches(".*[0-9].*");

        if (hasLetters && hasDigits) {
            System.out.println("The string contains both letters and digits.");
        } else if (hasLetters) {
            System.out.println("The string contains only letters.");
        } else if (hasDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains neither letters nor digits.");
        }
    }
}

// Explanation: This program checks if a string contains letters, digits, or both.
