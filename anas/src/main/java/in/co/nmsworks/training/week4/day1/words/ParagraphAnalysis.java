package in.co.nmsworks.training.week4.day1.words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis p1 = new ParagraphAnalysis();
        p1.readFile();

    }

    private void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/sample2.txt"))) {

            String line = "";
            int[] count = new int[3];

            String[] statements = null;
            String[] words = null;
            String[] letters = null;
            while ((line = br.readLine()) != null) {
                statements = line.split("\\.");
                words = line.split("[^a-zA-Z]+");
                letters = line.replaceAll("[^a-zA-Z]", "").split("");
            }

            count[0] = statements.length;
            count[1] = words.length;
            count[2] = letters.length;

            System.out.println("No. of statements : " + count[0]);
            System.out.println("No. of words : " + count[1]);
            System.out.println("No. of letters : " + count[2]);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
