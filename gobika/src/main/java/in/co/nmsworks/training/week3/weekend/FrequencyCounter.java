package in.co.nmsworks.training.week3.weekend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        frequencyCounter.countWordFrequency();
    }

    private void countWordFrequency() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            Map<String,Integer> wordCount = new HashMap<>();
            List<String> excludedList = Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would");
            Integer count ;
            String line = "";
            while (( line = bufferedReader.readLine()) != null){
                String[] words = line.split(" ");
                for (String word : words) {
                    String wordInLowerCase = word.toLowerCase().replaceAll("[^a-zA-Z]","").trim();
                    if (!excludedList.contains(wordInLowerCase) && !wordInLowerCase.isEmpty()){
                        count = wordCount.getOrDefault(wordInLowerCase, 0);
                        wordCount.put(wordInLowerCase,count+1);
                    }
                }
            }

            List<Map.Entry<String,Integer>> wordCountList = new ArrayList<>(wordCount.entrySet());
            wordCountList.sort(Map.Entry.comparingByValue());

            for (int i = wordCountList.size()-1; i > 0 ; i--) {
                Map.Entry<String,Integer> entry = wordCountList.get(i);
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }


//            for(Map.Entry<String,Integer> word : wordCount.entrySet()){
//                System.out.println("\nWord : "+ word.getKey() + " Count : "+ word.getValue());
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
