package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    Map<String, Integer> wordCount = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.readFromFile();
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        wordFrequency.getCount(word);
        System.out.println("*********************************************************************");
        wordFrequency.reverseOrder();
        System.out.println("*********************************************************************");
        wordFrequency.removeWords();
    }

    private void removeWords() {
       Set<String> words = new HashSet<>(Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"));
        wordCount.keySet().removeAll(words);
        System.out.println("After Removing words : ");
        for (Map.Entry<String, Integer> wordcount : wordCount.entrySet()) {
            System.out.println("Word : " + wordcount.getKey() + " " + " Count : " + wordcount.getValue());

        }
    }

    private void reverseOrder() {
        List<Integer> sortedWords = new ArrayList<>((wordCount.values()));
        sortedWords.sort(Collections.reverseOrder());
        Set<String> checkWord = new HashSet<>();
        for (Integer sortedWord : sortedWords) {
            for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
                if ((word.getValue().equals(sortedWord))  && !(checkWord.contains(word.getKey()))) {
                    checkWord.add(word.getKey());
                    System.out.println("Word : " + word.getKey() + " " + " Count : " + word.getValue());
                }
            }
        }

    }

    private void getCount(String word) {
        if (wordCount.containsKey(word)) {
            System.out.println("Count of " + word + " in the given file is : " + wordCount.get(word));
        } else {
            System.out.println("Requested word " + word + " not found in file");
        }
    }

    private void readFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] words = line.replaceAll("[^a-zA-Z ]", "").split(" ");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
