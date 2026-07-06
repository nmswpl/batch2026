package in.co.nmsworks.training.week3.weekend;

import in.co.nmsworks.training.week3.day3.FileHandlingProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter wf = new WordFrequencyCounter();
        String fileContent = wf.readFile("/home/nms-training/Downloads/Word_Frequency.txt");
        String[] allWords = wf.splitWords(fileContent);
        Map<String, Integer> wordToCount = wf.getWordToCount(allWords);
        List<List<String>> wordsBasedOnCount = wf.getCountToWords(wordToCount);
        System.out.println("Before Removing exclude words");
        wf.printWordsInDescendingOrderOfFrequency(wordsBasedOnCount);
        String[] excludeWords = {"a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would" };
        removeExcludeWords(excludeWords,wordToCount,wordsBasedOnCount);
        System.out.println("After removing exclude words");
        wf.printWordsInDescendingOrderOfFrequency(wordsBasedOnCount);
    }

    public static void removeExcludeWords(String[] excludeWords, Map<String, Integer> wordToCount, List<List<String>> wordsBasedOnCount) {
        for (String excludeWord : excludeWords) {
            Integer index = wordToCount.get(excludeWord);
            if (index != null)
                wordsBasedOnCount.get(index).remove(excludeWord);
        }
    }

    public void printWordsInDescendingOrderOfFrequency(List<List<String>> wordsBasedOnCount) {
        Collections.reverse(wordsBasedOnCount);
        for (List<String> wordsList : wordsBasedOnCount) {
            if (wordsList.size() != 0)
                System.out.println(wordsList);
        }
        Collections.reverse(wordsBasedOnCount);
    }

    public List<List<String>> getCountToWords(Map<String, Integer> wordToCount) {
        Integer maxFrequency = Collections.max(wordToCount.values());
        List<List<String>> wordsBasedOnCount = new ArrayList<>();
        for (int i = 0; i <= maxFrequency; i++) {
            wordsBasedOnCount.add(new ArrayList<>());
        }
        for (String word : wordToCount.keySet()) {
            List<String> currentWords = wordsBasedOnCount.get(wordToCount.get(word));
            if (currentWords == null) {
                currentWords = new ArrayList<>();
            }
            wordsBasedOnCount.get(wordToCount.get(word)).add(word);
        }
        return wordsBasedOnCount;
    }

    public Map<String, Integer> getWordToCount(String[] allWords) {
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : allWords) {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        return wordToCount;
    }

    public String[] splitWords(String fileContent) {
        fileContent = cleanContent(fileContent);
        String[] allWords = fileContent.split(" ");
        return allWords;
    }

    private String cleanContent(String fileContent) {
        fileContent = fileContent.replaceAll("\\.","");
        fileContent = fileContent.replaceAll(",","");
        return fileContent;
    }


    public String readFile(String filePath) {
        String fileContent = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String eachline = "";
            while ((eachline = reader.readLine()) != null) {
                fileContent += eachline;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent;
    }
    public Integer getNumberOfStatement(String filePath) {
        Integer noOfStatement = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String eachline = "";
            while ((eachline = reader.readLine()) != null) {
                noOfStatement += 1;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return noOfStatement;
    }
}
