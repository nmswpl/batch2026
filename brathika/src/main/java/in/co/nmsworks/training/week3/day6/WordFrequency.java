package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        WordFrequency wordFrequency = new WordFrequency();
        List<String> words = wordFrequency.readFromFile();
        Map<String, Integer> frequencyOfWord = wordFrequency.findWordFrequency(words);
        wordFrequency.printFrequencyOfWord(frequencyOfWord);

    }

    private void printFrequencyOfWord(Map<String, Integer> frequencyOfWord) {
        List<Map.Entry<String , Integer>> wordList = new ArrayList<>(frequencyOfWord.entrySet());
        Collections.sort(wordList, ( a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<String, Integer> entry : wordList) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private Map<String, Integer> findWordFrequency(List<String> words) {
        Map<String, Integer> frequencyOfWord = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            frequencyOfWord.put(word,frequencyOfWord.getOrDefault(word,0) + 1);
        }
        return frequencyOfWord;
    }

    private List<String> readFromFile() {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String text = "";
            while ((text = reader.readLine()) != null) {
                String[] array = text.split(" | ,");
                for (String s : array) {
                    s = s.replace(".","");
                    s = s.replace(",","");
                    words.add(s);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }
}
