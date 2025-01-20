import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (str.contains("A") || str.contains("a")) {
            System.out.println("The letter 'A' or 'a' is present in the string.");
        } else {
            System.out.println("The letter 'A' or 'a' is not present in the string.");
        }
    }
}
