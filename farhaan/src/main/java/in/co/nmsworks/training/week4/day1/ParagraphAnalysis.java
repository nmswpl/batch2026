package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis analysis = new ParagraphAnalysis();
        analysis.analyse();
    }

    private void analyse() {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line = "";
            String text = "";
            int[] arr = new int[3];
            while((line = reader.readLine()) != null){
                text += line;
            }
            arr[0] = getStatementsCount(text);
            arr[1] = getWordsCount(text);
            arr[2] = getLettersCount(text);
            for (int i =0; i< arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getLettersCount(String text) {
        int letterCount = 0;
        letterCount = text.length();
        return letterCount;
    }

    private int getWordsCount(String text) {
        String[] splits = text.split(" ");
        int wordsCount = splits.length;
        return wordsCount;

    }

    private int getStatementsCount(String text) {
        String[] splits = text.split("\\.");
        int statementsCount = splits.length;
        return statementsCount;
    }
}
