package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter {
    public static void main(String[] args) {
        WordFreqCounter wordFreqCounter = new WordFreqCounter();
        wordFreqCounter.readFile();
    }

    private void readFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            Map<String,Integer> fileMap = new HashMap<>();
            String line ="";
            while((line = bufferedReader.readLine())!=null){
                line = line.replaceAll(",","");
                line = line.replaceAll("\\.","");
                line = line.replaceAll(";","");
                line = line.replaceAll("-","");

                String[] arr = line.split("\\s+");
                for (String s : arr) {
                    if (!s.isEmpty()) {
                        fileMap.put(s, fileMap.getOrDefault(s, 0) + 1);
                    }

                }
            }
           /* for (Map.Entry<String, Integer> stringIntegerEntry : fileMap.entrySet()) {
                System.out.println("key :"+stringIntegerEntry.getKey());
                System.out.println("value :"+stringIntegerEntry.getValue());
            }*/

            String[]str= {"a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with", "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he", "she", "you", "i", "not", "will", "would"};
            for (String s : str) {
                fileMap.remove(s);

            }
            fileMap.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey()+" "+stringIntegerEntry.getValue()));


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
