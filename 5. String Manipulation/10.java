import java.util.Scanner;

public class ExtractSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Extracting characters from index 3 (4th character) to index 9 (10th character)
        String substring = str.substring(3, 10);
        System.out.println("Extracted substring: " + substring);
    }
}
