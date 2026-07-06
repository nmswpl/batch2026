package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        paragraphAnalysis.readTextFile();
    }
    private void readTextFile() {
        int totalStatements = 0;
        int totalWords = 0;
        int totalLetters = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] statements = line.split("\\.");
                totalStatements += statements.length;
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        for (char c : word.toCharArray()) {
                            if (Character.isLetter(c)) {
                                totalLetters++;
                            }
                        }
                    }
                }
            }

            int[] result = new int[]{totalStatements, totalWords, totalLetters};
            System.out.println("Statements:" + result[0]);
            System.out.println("Words:" + result[1]);
            System.out.println("Letters:" + result[2]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
