package in.co.nmsworks.training.Week3.Map.Day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Set<String>word=wordAddvalue();
        HashMap<String,Integer>val=wordCount(word);
        printMap(val);
    }

    private static void printMap(HashMap<String, Integer> val) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(val.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("Word Frequency");
        System.out.println("--------------------");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    private static HashMap<String, Integer> wordCount(Set<String> word) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Documents/Word_Frequency.txt"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] dict = line.split(" ");
                for (String text : dict) {
                    String value=text.toLowerCase().replaceAll("[^a-z]","");
                    if (!value.isEmpty() && !word.contains(value)) {
                        map.put(value, map.getOrDefault(value, 0) + 1);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    private static Set<String> wordAddvalue() {
        String []word={"a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"};
        Set<String> set=new HashSet<>();
        for(String s:word){
            set.add(s);
        }
        return set;
    }
}
