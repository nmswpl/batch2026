package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis analysis = new ParagraphAnalysis();
        analysis.analyseParagraph();
    }

    private void analyseParagraph() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            int[] array = new int[3];
            String text = "";
            int statement = 0, wordsCount = 0, letterCount = 0;
            while ((text = reader.readLine()) != null) {
                String[] statementArray = text.split("\\. ");
                statement += statementArray.length;
                String[] strarray = text.split("[,. ]");
                for (String s : strarray) {
                    wordsCount++;
                    letterCount += s.length();
                }

            }
            array[0] = statement;
            array[1] = wordsCount;
            array[2] = letterCount;
            System.out.println("Total no of statements is: "+array[0]);
            System.out.println("Total no of words is: "+array[1]);
            System.out.println("Total no of letter is: "+array[2]);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
