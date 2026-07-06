package in.co.nmsworks.training.week4.Day1;

import org.apache.http.impl.io.IdentityOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Paragraph {
    public static void main(String[] args) throws IOException {
        Paragraph pi = new Paragraph();

        int[] analysis = pi.read();

        System.out.println("=== Paragraph Analysis ===");
        System.out.println("Number of statements: " + analysis[0]);
        System.out.println("Total number of words: " + analysis[1]);
        System.out.println("Total number of letters: " + analysis[2]);
    }

    private int[] read() throws IOException {

        String path = "/home/nms-training/Downloads/Word_Frequency.txt";
        String line = "";
        int totalStatements=0;
        int totalLetters=0;
        int totalWords=0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }


                String[] sentences = line.split("[.!?]+");
                totalStatements += sentences.length;


                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        totalLetters += word.length();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new int[]{totalStatements, totalWords, totalLetters};


    }


}