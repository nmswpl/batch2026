package in.co.nmsworks.Week4.Day1.ParagraphAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParagraphRunner {

    public static void main(String[] args) {
        int[] val = countTheData();

        System.out.println("Number Of Statements : " + val[0]);
        System.out.println("Number Of Words : " + val[1]);
        System.out.println("Number Of Letters : " + val[2]);
    }

    private static int[] countTheData() {
        int[] array = new int[3];
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Pictures/value.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (ch == '.' || ch == '?' || ch == '!') {
                        array[0]++;
                    }
                }
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    array[1] += words.length;
                }
                String letters = line.replaceAll("[^A-Za-z]", "");
                array[2] += letters.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return array;
    }
}
