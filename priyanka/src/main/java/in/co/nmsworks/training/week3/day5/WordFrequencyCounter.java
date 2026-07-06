package in.co.nmsworks.training.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import static java.util.Collections.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        wordFrequencyCounter.fileParsing();
    }

    private void fileParsing() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Word_Frequency.txt"))){
            String line = "";
            while ((line = reader.readLine())!= null){
//                line = line.replace("\"","");
                String[] words = line.split(" ");

                Set<String> stopWords = new HashSet<>(Arrays.asList(
                        "a", "an", "the", "and", "but", "or", "of", "to", "in",
                        "for", "on", "by", "with", "at", "from", "as", "is",
                        "am", "are", "was", "were", "be", "been", "has", "have",
                        "had", "this", "that", "it", "they", "we", "he", "she",
                        "you", "i", "not", "will", "would"
                ));

                Map<String,Integer> wordToFrequencyMap = new HashMap<>();
                for (String word : words) {
                    if(stopWords.contains(word)){
                        continue;
                    }
                    wordToFrequencyMap.put(word,wordToFrequencyMap.getOrDefault(word,1)+1);
                }

                for (String s : wordToFrequencyMap.keySet()) {
                    System.out.println(s + "-->" + wordToFrequencyMap.get(s));
                }

//                List<Map<String,Integer>> sortedList =
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
