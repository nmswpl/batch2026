package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis analysis = new ParagraphAnalysis();
        analysis.getAndPrintCounts();
    }

    private void getAndPrintCounts() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line;
            String text = "";
            int[] resultArray = new int[3];
            while((line = reader.readLine()) != null){
                text += line;
            }
            resultArray[0] = getStatementsCount(text);
            resultArray[1] = getWordsCount(text);
            resultArray[2] = getLettersCount(text);
            System.out.println("The Total Statements Count are :: " + resultArray[0]);
            System.out.println("The Total Words Count are :: " + resultArray[1]);
            System.out.println("The Total Letters Count are :: " + resultArray[2]);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getLettersCount(String text) {
        int letterCount;
        letterCount = text.length();
        return letterCount;
    }

    private int getWordsCount(String text) {
        String[] splits = text.split(" ");
        return splits.length;
    }

    private int getStatementsCount(String text) {
        String[] splits = text.split("\\.");
        return splits.length;
    }
}
