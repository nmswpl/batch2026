package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    private Map<String, Integer> wordToFrequencyMap = new HashMap<>();
    public static void main(String[] args) {
        WordFrequencyCounter runner = new WordFrequencyCounter();
        try {
            List<String> wordSet = runner.getWords();
            runner.countFrequency(wordSet);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void countFrequency(List<String> list) {
        Integer count = 0;
        for (String s : list) {
            wordToFrequencyMap.put(s,wordToFrequencyMap.getOrDefault(s,0) + 1);
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordToFrequencyMap.entrySet());

        Collections.sort(entries, (e1, e2) -> e2.getValue() - e1.getValue());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

    private List<String> getWords() throws FileNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line = "";
            String text = "";
            while((line = reader.readLine()) != null){
                text += line.toLowerCase();
            }
            List<String> excludedWords = Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would");
            text = text.replaceAll("[.;,]"," ");
            text = text.replaceAll("  "," ");
            List<String> extractedWords = new ArrayList<>();
            for (String s : text.split(" ")) {
                if (!excludedWords.contains(s)) {
                    extractedWords.add(s);
                }
            }
            return extractedWords;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
