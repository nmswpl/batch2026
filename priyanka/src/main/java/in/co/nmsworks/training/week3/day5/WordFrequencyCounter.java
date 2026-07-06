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
            Set<String> stopWords = new HashSet<>(Arrays.asList(
                    "a", "an", "the", "and", "but", "or", "of", "to", "in",
                    "for", "on", "by", "with", "at", "from", "as", "is",
                    "am", "are", "was", "were", "be", "been", "has", "have",
                    "had", "this", "that", "it", "they", "we", "he", "she",
                    "you", "i", "not", "will", "would"
            ));
            Map<String,Integer> wordToFrequencyMap = new HashMap<>();
            while ((line = reader.readLine())!= null){
//                line = line.replace("\"","");
                String[] words = line.split(" ");
                for (String word : words) {
                    if(stopWords.contains(word)){
                        continue;
                    }
                    wordToFrequencyMap.put(word,wordToFrequencyMap.getOrDefault(word,0)+1);
                }
            }
            List<Map.Entry<String, Integer>> sortedList = sortMap(wordToFrequencyMap);

            for (Map.Entry<String, Integer> entry : sortedList) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private List<Map.Entry<String, Integer>> sortMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {

                if (list.get(j).getValue() < list.get(j + 1).getValue()) {

                    Map.Entry<String, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        return list;
    }
}
