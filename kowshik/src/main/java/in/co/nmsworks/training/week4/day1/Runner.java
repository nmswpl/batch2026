package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] paragraphAnalysis = getParagraphAnalysis();
        System.out.println("Analysis : " + Arrays.toString(paragraphAnalysis));
    }

    static int[] getParagraphAnalysis() {

        int totalSentences = 0;
        int totalWords = 0;
        int totalLetters = 0;

        try (FileReader fileReader = new FileReader("/home/nms-training/Downloads/Word_Frequency.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] sentences = line.split("\\.");

                for (String sentence : sentences) {
                    if(sentence.trim().isEmpty()) {
                        continue;
                    }
                    totalSentences++;

                    String[] words = sentence.split(" ");
                    totalWords += words.length;
                    for (String word : words) {
                        totalLetters += word.length();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new int[]{totalSentences, totalWords, totalLetters};
    }
}
