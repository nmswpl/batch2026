package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        System.out.println(Arrays.toString(paragraphAnalysis.readText()));
    }

    private int[] readText() {
        int[] analysis = {0, 0, 0};
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Word_Frequency.txt"))) {
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                String[] statementSplit = line.split("\\.");
                String[] wordSplit = line.split("[,. ]");
                analysis[0] += statementSplit.length;
                analysis[1] += wordSplit.length;

                for (int i = 0; i < line.length(); i++){
                    if (line.charAt(i) != ',' || line.charAt(i) != '.' || line.charAt(i) != ' ' || line.charAt(i) != '-'){
                        analysis[2]++;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return analysis;
    }
}
