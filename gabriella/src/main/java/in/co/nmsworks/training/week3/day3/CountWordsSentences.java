package in.co.nmsworks.training.week3.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsSentences {
    public static void main(String[] args) {
        CountWordsSentences countWords = new CountWordsSentences();
        countWords.printCount();
    }

    private void printCount() {
        String text = "";
        int noOfWords = 0;
        int noOfSentences = 0;
        FileReader reader = null;
        try {
            reader = new FileReader("/home/nms-training/Desktop/countWords.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                text += (char) ch;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] splitText = text.split(" ");
        String[] sentenceText = text.split("\\. ");
        noOfWords = splitText.length;
        noOfSentences = sentenceText.length;
        System.out.println("No.of words: " + noOfWords);
        System.out.println("No.of sentences: " + noOfSentences);



    }
}
