// Assignment 5.2: Find the Length of a String Except White Spaces
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String noSpaces = input.replace(" ", "");
        System.out.println("Length of the string without spaces: " + noSpaces.length());
    }
}

// Explanation: This program calculates the length of a string after removing all spaces.
