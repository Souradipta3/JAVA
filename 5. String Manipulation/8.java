import java.util.Scanner;

public class CheckStartWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring to check: ");
        String prefix = scanner.nextLine();

        if (str.startsWith(prefix)) {
            System.out.println("The string starts with the specified substring.");
        } else {
            System.out.println("The string does not start with the specified substring.");
        }
    }
}
