import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring to insert at the beginning: ");
        String prefix = scanner.nextLine();

        String result = prefix + str;
        System.out.println("Modified string: " + result);
    }
}
