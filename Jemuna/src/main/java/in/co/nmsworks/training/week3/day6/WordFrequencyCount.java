package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCount {

    Map<String,Integer> freqMap = new HashMap<>();
    public static void main(String[] args) {
        WordFrequencyCount wordFrequencyCount = new WordFrequencyCount();
        wordFrequencyCount.readFile();
        wordFrequencyCount.countFrequency();
        wordFrequencyCount.reverseOrder();
        wordFrequencyCount.removeWords();

    }

    private void removeWords() {
        Set<String> removableWords = new HashSet<>(Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"));
        freqMap.remove(removableWords);
        System.out.println("Removing the unwanted words from the List");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey());

        }
    }

    private void reverseOrder() {
        System.out.println("Displaying the word in descending order of their frequency");
        List<Integer> sortMapList = new ArrayList<>(freqMap.values());
        Set<String> checker = new HashSet<>();
        sortMapList.sort(Collections.reverseOrder());
//        for (Integer i : sortMapList) {
//            System.out.println(i);
//        }

        for (Integer listElement : sortMapList) {
            for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                if((entry.getValue().equals(listElement) && !(checker.contains(entry.getKey())))){
                    checker.add(entry.getKey());
                    System.out.println(entry.getValue()+":"+entry.getKey());
                }

            }
        }
    }

    private void countFrequency() {
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    private void readFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line;
            System.out.println("Printing the frequency of each word");
            while((line = reader.readLine())!=null){
                String[] newStringArray = line.toLowerCase().replaceAll("[^a-zA-Z\\s]","").split(" ");
                for (String word : newStringArray) {
                    if (word.isEmpty()) {
                        continue;
                    }
                    else {
                        freqMap.put(word, freqMap.getOrDefault(word,0)+1);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();        }
    }


}
