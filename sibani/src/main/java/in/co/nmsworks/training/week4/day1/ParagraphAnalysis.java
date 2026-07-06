package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        int[] numOfCounts = paragraphAnalysis.readFromFile();
        System.out.println("Sentence count : " + numOfCounts[0]);
        System.out.println("Words count : " + numOfCounts[1]);
        System.out.println("Character count : " + numOfCounts[2]);
    }

    private int[] readFromFile() {
        int[] numOfContents = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line = "";
            int noOfChars = 0, noOfWords = 0, noOfStatements = 0;
            numOfContents = new int[3];
            while ((line = bufferedReader.readLine()) != null) {
                String[] statements = line.split("\n");
                noOfStatements += statements.length;
                String[] words = line.split(" ");
                noOfWords += words.length;
                noOfChars += line.length();
                    numOfContents = new int[]{noOfStatements, noOfWords, noOfChars};
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numOfContents;
    }

}
