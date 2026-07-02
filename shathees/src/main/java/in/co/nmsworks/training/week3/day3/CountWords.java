package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class CountWords {

    public static void main(String[] args) {
        try {
            CountWords countWords = new CountWords();
            int answer = countWords.getWordCount();
            System.out.println("Total words longerthan 5 letters: " + answer);
            int uniqueWords = countWords.getUnique();
            System.out.println("The number of unique words in the paragraph: " + uniqueWords);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getUnique() {
        Set<String> set = new HashSet<>();
        try
            (BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("/home/nms-training/Desktop/textFIle.txt"))){

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split("\\s+");

                    for (String word : words) {
                        set.add(word);
                    }}
        }catch (Exception e) {
            e.printStackTrace();
        }

        return set.size();
    }

    private int getWordCount() {
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/home/nms-training/Desktop/textFIle.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > 5) {
                        count++;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}