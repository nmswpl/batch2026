package in.co.nmsworks.training.week3practices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        WordFrequency wr = new WordFrequency();
        wr.file();
    }

    private void file() {
        String path = "/home/nms-training/Downloads/Word_Frequency.txt";


        List<String> list = Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would");
        Set<String> stopWords = new HashSet<>(list);

        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.toLowerCase().split("[\\s\u00A0\\p{Punct}]+");

                for (String word : words) {

                    if (word.isEmpty() || stopWords.contains(word)) {
                        continue;
                    }


                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCounts.entrySet());
            sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));


            System.out.println("--- Word Frequency Results (Descending Order) ---");
            for (Map.Entry<String, Integer> entry : sortedList) {
                System.out.printf("%-15s : %d%n", entry.getKey(), entry.getValue());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}