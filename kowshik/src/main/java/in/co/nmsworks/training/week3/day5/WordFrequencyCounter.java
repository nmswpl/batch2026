package in.co.nmsworks.training.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordsToCountMap = readValidWordsAndTheirCountFromFile();
        printWordsInDescendingOrderFrequency(wordsToCountMap);
    }

    private static void printWordsInDescendingOrderFrequency(Map<String, Integer> wordsToCountMap) {
        List<Map.Entry<String, Integer>> wordsToCountEntryList = new ArrayList<>(wordsToCountMap.entrySet());

        wordsToCountEntryList.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Descending : " + wordsToCountEntryList.size());
        for (Map.Entry<String, Integer> entry : wordsToCountEntryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static Map<String, Integer> readValidWordsAndTheirCountFromFile() {

        Set<String> excludedWords = new HashSet<>(
                Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at",
                        "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this",
                        "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"));

        Map<String, Integer> wordsToCountMap = new HashMap<>();

        try (FileReader fileReader = new FileReader("/home/nms-training/Downloads/Word_Frequency.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z ]","");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.trim().isEmpty()) {
                        continue;
                    }

                    if (excludedWords.contains(word.toLowerCase())) {
                        continue;
                    }

                    wordsToCountMap.put(word, wordsToCountMap.getOrDefault(word, 0)+1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return wordsToCountMap;
    }
}
