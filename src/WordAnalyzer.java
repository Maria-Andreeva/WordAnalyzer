import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyzer {
    public static void main(String[] args) {
        // Input file name
        String filename = "input.txt";

        // HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Variables for total word count and the longest word
        int totalWords = 0;
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Skip empty strings
                    if (word.isEmpty()) {
                        continue;
                    }

                    // Increment total word count
                    totalWords++;

                    // Update the longest word
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }

                    // Increment count for the current word
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print results
        System.out.println("Total number of words: " + totalWords);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Word frequencies:");

        // Sort words alphabetically for readability
        wordCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
