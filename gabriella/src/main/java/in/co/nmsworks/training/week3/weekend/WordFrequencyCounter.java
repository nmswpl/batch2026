package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        wordFrequencyCounter.countWords();
    }

    private void countWords() {
        List<String> words = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Word_Frequency.txt"))) {

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split("[ ,.]");
                for (String string : splitLine) {
                    words.add(string.toLowerCase());
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        List<String> excludedWordsList = Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would", "");
        words.removeAll(excludedWordsList);


        Map<String, Integer> wordToFrequency = new HashMap<>();
        for (String word : words) {
            if (wordToFrequency.containsKey(word)){
                wordToFrequency.replace(word, wordToFrequency.get(word)+1);
            } else {
                wordToFrequency.put(word, 1);
            }
        }

        List<Integer> descendingFrequency = new ArrayList<>();
        for (Integer value : wordToFrequency.values()) {
            if (!descendingFrequency.contains(value)){
                descendingFrequency.add(value);
            }
        }

        Collections.sort(descendingFrequency, Collections.reverseOrder());
        for (Integer frequency : descendingFrequency) {
            System.out.println("words with frequency " + frequency);
            for (String string : wordToFrequency.keySet()) {
                if (Objects.equals(wordToFrequency.get(string), frequency)) {
                    System.out.println(string);
                }
            }
            System.out.println();


        }
    }
}
