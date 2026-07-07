package in.co.nmsworks.training.week3.weekendpractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class wordFrequencyCounter {

    public static void main(String[] args) {
        fileReader();
    }

    private static void fileReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line = "";
            Map<String,Integer> frequencyMap=new LinkedHashMap<>();
//             = new String[0];
            while ((line = bufferedReader.readLine()) != null) {
//                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] arr = line.split("\\s+");
                String []excludeWords= {"a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by",
                        "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has",
                        "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"};
                List<String> excludeList=Arrays.asList(excludeWords);
                for (String word : arr) {
                    if(word.isEmpty()||excludeList.contains(word))
                    {
                        continue;
                    }
                    frequencyMap.put(word,frequencyMap.getOrDefault(word,0)+1);
                }

            }
            System.out.println("Word   Frequency");
            System.out.println("===============================");
//            Collections.sort();
            for (String word : frequencyMap.keySet()) {
                System.out.println(word+" "+frequencyMap.get(word));
            }

//            Map<String,>
//                System.out.println(wordFrequencyMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
