package in.co.nmsworks.training.week3.day6;

import java.io.*;
import java.util.*;

public class WordFrequency {
    Map<String, Integer> wordMap = new HashMap<>();
    Set<String>ignoreWord=new HashSet<>(Arrays.asList("a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"));


    public static void main(String[] args) throws IOException {
        WordFrequency wf = new WordFrequency();
        wf.getWordFrequency();
    }

    private void getWordFrequency() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/Word_Frequency_counted.txt"))) {

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    String cleaned=word.toLowerCase();
                    if (ignoreWord.contains(cleaned)){
                        continue;
                    }
                    if (!wordMap.containsKey(cleaned)) {
                        wordMap.put(cleaned, 1);
                    }
                    else {
                        int currentWord=wordMap.get(cleaned);
                        wordMap.put(cleaned,(currentWord)+1);
                    }

                }
            }
            System.out.println(wordMap);
            List<Integer> listMap=new ArrayList<>();
            for (Map.Entry<String ,Integer>wordCount:wordMap.entrySet()){
                System.out.println(wordCount.getKey());
                System.out.println(wordCount.getValue());
                listMap.add(wordCount.getValue());
                Collections.sort(listMap);
            }
            System.out.println(listMap);

        }
    }
}
