package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) throws IOException {
        CountWords countWords = new CountWords();
        countWords.fileParsing();
    }

    private void fileParsing() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
        String line = "";
        int countSentence=0;
        int wordCount =0;
        while ((line = reader.readLine())!= null){
            String[] sentence = line.split("\\.");
            for (String s : sentence) {
//                System.out.println(s);
                countSentence++;
            }
//            System.out.println("Sentence: "+sentence.length);


            String[] words = line.split(" ");
            for (String word : words) {
                wordCount++;
            }
        }
        System.out.println("No.of. sentences: " + countSentence);
        System.out.println("No.of.words: "+ wordCount);
    }
}
