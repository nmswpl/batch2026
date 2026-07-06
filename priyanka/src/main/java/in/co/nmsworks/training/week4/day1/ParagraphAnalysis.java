package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();

        paragraphAnalysis.fileParsing();
    }

    private void fileParsing() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Word_Frequency.txt"))) {
            String line = "";

            int totalSentenceCount = 0;
            int totalWordCount = 0;
            int totalLetterCount = 0;

            while ((line = reader.readLine()) != null) {
                int[] array = count(line);
                totalSentenceCount += array[0];
                totalWordCount += array[1];
                totalLetterCount += array[2];
            }
            System.out.println("sentence count: " + totalSentenceCount);
            System.out.println("word count: " + totalWordCount);
            System.out.println("letter count: " + totalLetterCount);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private int[] count(String line) {
        int sentenceCount = 0;
        int wordCount = 0;
        int letterCount = 0;

        // Count sentences
        String[] sentences = line.split("\\.");
        for (String sentence : sentences) {
            sentenceCount++;
        }
        String[] words = line.split(" ");
        wordCount = words.length;

        for (String word : words) {
            letterCount += word.length();
        }
        return new int[]{sentenceCount,wordCount,letterCount};

    }


}
