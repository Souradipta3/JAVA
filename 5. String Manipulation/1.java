// Assignment 5.1: Input a Sentence and Display Words in Sorted Order
import java.util.Arrays;
import java.util.Scanner;

public class WordSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        Arrays.sort(words);

        System.out.println("Words in sorted order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

// Explanation: This program takes a sentence, splits it into words, sorts them alphabetically, and displays the result.
