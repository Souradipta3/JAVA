import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character/substring to count: ");
        String sub = scanner.nextLine();

        int count = str.split(sub, -1).length - 1;
        System.out.println("The substring '" + sub + "' occurs " + count + " times.");
    }
}
