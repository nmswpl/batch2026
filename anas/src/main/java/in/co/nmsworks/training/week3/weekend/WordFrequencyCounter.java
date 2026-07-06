package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String fileName = "/home/nms-training/Downloads/Word_Frequency.txt";

        Set<String> excludedWords = new HashSet<>(Arrays.asList(
                "a", "an", "the", "and", "but", "or", "of", "to", "in",
                "for", "on", "by", "with", "at", "from", "as", "is", "am",
                "are", "was", "were", "be", "been", "has", "have", "had",
                "this", "that", "it", "they", "we", "he", "she", "you",
                "i", "not", "will", "would"
        ));

        Map<String, Integer> wordCount = new HashMap<>();

        readFile(fileName, excludedWords, wordCount);

        displayFrequency(wordCount);
    }

    private static void readFile(String fileName,
                                 Set<String> excludedWords,
                                 Map<String, Integer> wordCount) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();

                String[] words = line.split("[^a-zA-Z]+");

                for (String word : words) {

                    if (word.isEmpty() || excludedWords.contains(word)) {
                        continue;
                    }

                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayFrequency(Map<String, Integer> wordCount) {

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCount.entrySet());

        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Word Frequency (Descending Order)\n");

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
