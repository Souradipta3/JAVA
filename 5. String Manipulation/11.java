import java.util.Scanner;

public class StringCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // Toggle case
        StringBuilder toggleCaseStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggleCaseStr.append(Character.toLowerCase(c));
            } else {
                toggleCaseStr.append(Character.toUpperCase(c));
            }
        }
        System.out.println("Toggle case: " + toggleCaseStr);
    }
}
