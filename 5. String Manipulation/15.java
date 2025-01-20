import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // First part of the pattern
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }

        // Second part of the pattern
        for (int i = str.length() - 1; i > 0; i--) {
            System.out.println(str.substring(0, i));
        }
    }
}
