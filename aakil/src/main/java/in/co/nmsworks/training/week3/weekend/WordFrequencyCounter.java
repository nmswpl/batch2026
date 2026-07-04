package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter freqCounter = new WordFrequencyCounter();
        List<String> words = freqCounter.getWordsList();
        words = freqCounter.removeBlackListedWords(words);
        Map<String, Integer> freqMap = freqCounter.getWordFrequency(words);
        freqCounter.printFrequencyDesc(freqMap);
    }

    private void printFrequencyDesc(Map<String, Integer> freqMap) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freqMap.entrySet());
        entries.sort((e1, e2) -> e2.getValue() - e1.getValue());
        entries.forEach(entry -> System.out.println(entry.getKey() + " > " + entry.getValue()));
    }

    private Map<String, Integer> getWordFrequency(List<String> words) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        return freqMap;
    }

    private List<String> removeBlackListedWords(List<String> words) {
        List<String> blackListedWords = Arrays.asList( "a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would");
        System.out.println(blackListedWords);
        words.removeAll(blackListedWords);
        return words;
    }

    private List<String> getWordsList() {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/in/co/nmsworks/training/week3/weekend/data/Word_Frequency.txt"))){
            String line;
            String text = "";
            while ((line = reader.readLine()) != null){
                line = line.replaceAll("[,.;]", " ");
                line = line.replaceAll(" {2}", " ");
                text += line.toLowerCase();
            }
            for (String word : text.split(" ")) {
                words.add(word);
            }
        }catch (Exception e){
            System.err.println("ERROR : " +e.getMessage());
        }
        return words;
    }
}
