import java.util.Scanner;

public class SuffixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (str1.endsWith(str2)) {
            System.out.println("The second string is a suffix of the first string.");
        } else if (str2.endsWith(str1)) {
            System.out.println("The first string is a suffix of the second string.");
        } else {
            System.out.println("Neither string is a suffix of the other.");
        }
    }
}
