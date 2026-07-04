package in.co.nmsworks.training.week3.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        Set<String> excludedWords = new HashSet<>(Arrays.asList(
                "a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by",
                "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been",
                "has", "have", "had", "this", "that", "it", "they", "we", "he", "she",
                "you", "i", "not", "will", "would"
        ));

        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.isEmpty()) {
                        continue;
                    }

                    if (excludedWords.contains(word)) {
                        continue;
                    }

                    if (wordCounts.containsKey(word)) {
                        int currentCount = wordCounts.get(word);
                        wordCounts.put(word, currentCount + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> sortedWords = new ArrayList<>(wordCounts.keySet());

        Collections.sort(sortedWords, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int count1 = wordCounts.get(word1);
                int count2 = wordCounts.get(word2);
                return count2 - count1;
            }
        });

        System.out.println(" Word Frequency ");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
