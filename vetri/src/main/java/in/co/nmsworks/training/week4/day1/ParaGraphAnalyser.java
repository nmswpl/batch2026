package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParaGraphAnalyser {

    public static void main(String[] args) {

        ParaGraphAnalyser pa = new ParaGraphAnalyser();

        int[] result = pa.paragraphAnalyser();

        System.out.println("Word Count      : " + result[0]);
        System.out.println("Sentence Count  : " + result[1]);
        System.out.println("Character Count : " + result[2]);
    }

    private int[] paragraphAnalyser() {

        int wordCount = 0;
        int sentenceCount = 0;
        int characterCount = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Count characters (excluding spaces)
                characterCount += line.replace(" ", "").length();

                // Count words
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }

                // Count sentences
                String[] sentences = line.split("[.!?]+");
                for (String sentence : sentences) {
                    if (!sentence.trim().isEmpty()) {
                        sentenceCount++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new int[]{wordCount, sentenceCount, characterCount};
    }
}