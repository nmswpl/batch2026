package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BufferPractice2 {
    public static void main(String[] args) {
        BufferPractice2 bufferPractice2 = new BufferPractice2();
        bufferPractice2.countNoSentences();
        bufferPractice2.countNoWords();
    }


    private void countNoSentences() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
            Integer sentenceCount = 0;
            String text = "";
            while ((text = reader.readLine()) != null) {
                String[] array = text.split("\\. ");
                sentenceCount = array.length;
            }
            reader.close();
            System.out.println("No of Sentences in the String is: "+sentenceCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void countNoWords() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
            Integer wordCount = 0;
            String text = "";
            while ((text = reader.readLine()) != null) {
                String[] array = text.split(" ");
                wordCount = array.length;
            }
            reader.close();
            System.out.println("No of words in the String is: "+wordCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
