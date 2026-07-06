package in.co.nmsworks.training.week4.day1;

import java.io.*;

public class ParagraphAnalyser {

    public static void main(String[] args) throws Exception {
               int[] arr = new int[3];

        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            String line;
            String[] words = new String[0];
            String[] statements = new String[0];
            String ch = "";

            int totalWordsCount = 0;
            int totalStatementsCount = 0;

            while ((line = br.readLine()) != null) {

                statements = line.split("\\.");
                totalStatementsCount += statements.length;

                words = line.replace(",", " ").replace(".", " ").split(" ");
                for (String w : words) {
                    if (!w.trim().isEmpty()) {
                        totalWordsCount++;
                    }
                }

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isLetter(c)) {
                        ch += c;
                    }
                }
            }

            arr[0] = totalStatementsCount;
            arr[1] = totalWordsCount;
            arr[2] = ch.length();

            System.out.println("Statements: " + arr[0]);
            System.out.println("Words: " + arr[1]);
            System.out.println("Letters: " + arr[2]);
        }
    }
}

