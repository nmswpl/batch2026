package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextAnalyzer {

    public static int[] analyzeParagraph() {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        String text = contentBuilder.toString().trim();

        String[] sentences = text.split("\\.");
        int sentenceCount = sentences.length;

        String[] words = text.split(" ");
        int wordCount = words.length;

        int letterCount = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        return new int[]{sentenceCount, wordCount, letterCount};
    }

    public static void main(String[] args) {
        int[] results = analyzeParagraph();

        System.out.println("Analysis Results:");
        System.out.println("Index 0 (Statements): " + results[0]);
        System.out.println("Index 1 (Words):      " + results[1]);
        System.out.println("Index 2 (Letters):    " + results[2]);
    }
}