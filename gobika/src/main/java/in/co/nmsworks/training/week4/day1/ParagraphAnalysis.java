package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        int[] result = paragraphAnalysis.analysis();
        for (int i : result) {
            System.out.println(i);
        }
    }

    private int[] analysis() {
        int[] result = new int[3];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            int statementCounts = 0;
            int wordCounts = 0;
            int letterCount = 0;
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] statements = line.split("\\.");
                for (String statement : statements) {
                    statementCounts ++;

                    String[] words = statement.split(" ");
                    wordCounts += words.length;

                    for (String word : words) {
                        letterCount += word.length();
                    }
                }

            }
            result[0] = statementCounts;
            result[1] = wordCounts;
            result[2] = letterCount;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}
