package in.co.nmsworks.training.week3.day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.readWordFrequency();
    }

    private void readWordFrequency() {
        String[] excludeWords = {"a","am","an","and","are","as","at","be","been","but","by", "for","from","had","has","have","he","i","in","is","it", "not","of","on","or","she","that","the","they","this","to", "was","we","were","will","with","would","you"};
        List<String> excludeList = Arrays.asList(excludeWords);
        try(BufferedReader br =  new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line = " " ;
            List<String> words= new ArrayList<>();

            while((line = br.readLine())!=null){
                String[] data = line.split(" ");
                for (String datum : data) {
                    if (excludeList.contains(datum.toLowerCase())){
                        continue;
                    }
                    words.add(datum);
                }
            }
            wordsToFrequency(words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void wordsToFrequency(List<String> words) {
        System.out.println(words);
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (word.equals(words.get(j))) {
                    count++;
                }
            }
            System.out.println(word + " = " + count);
        }
    }
}
