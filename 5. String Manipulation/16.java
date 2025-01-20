import java.util.Scanner;
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // Case insensitive comparison
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Find the word with the highest frequency
        String maxWord = "";
        int maxCount = 0;
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > maxCount) {
                maxWord = word;
                maxCount = wordCount.get(word);
            }
        }

        System.out.println("The word with the highest frequency is: '" + maxWord + "' with " + maxCount + " occurrences.");
    }
}
