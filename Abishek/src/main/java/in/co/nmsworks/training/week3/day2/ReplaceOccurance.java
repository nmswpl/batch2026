package in.co.nmsworks.training.week3.day2;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.*;

public class ReplaceOccurance {

    public static void main(String[] args) {
        replaceWord();
        countNumberOfWords();
        checkLongerThanFive();
    }

    private static void checkLongerThanFive() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Documents/longerThanFive.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Documents/uniqueWords.txt"));

            String line="";
            int numOfWords = 0;
            while((line = br.readLine()) != null)
            {
                Set<String> s = new HashSet<>();
                String word[] = line.split(" ");
                for (String str : word) {
                    if(str.length() > 5)
                    numOfWords++;

                    s.add(str);
                }

                bw.write("Number Of Words greater than five: "+numOfWords+"\n");
                bw.write("Size of unique words: "+s.size());
                bw.close();
                System.out.println(s.size());
            }

            System.out.println("Number Of Words greater than five: "+numOfWords);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void countNumberOfWords() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Documents/countWords.txt"));

            String line="";
            int numOfSentence = 0;
            int numOfWords = 0;
            while((line = br.readLine()) != null)
            {
                String word[] = line.split(" ");
                for (String str : word) {
                    numOfWords++;
                }

                String split[] = line.split("\\.");
                for (String str : split) {
                   numOfSentence++;
                }
            }
            System.out.println("Number Of Words: "+numOfWords);
            System.out.println("Number Of Sentence: "+numOfSentence);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void replaceWord() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Documents/Modified.txt"));
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Documents/Original.txt"));

            String line="";
            while((line = br.readLine()) != null)
            {
                String split[] = line.split(" ");
                for (String x : split)
                {
                    String upper = x.toUpperCase();
                    if(upper.equals("OLD"))
                    {
                        x = "new";
                    }
                    bw.write(x);
                    if (x.contains("."))
                    {
                        bw.write("\n");
                    }
                    else
                    {
                        bw.write(" ");
                    }
                    bw.flush();
                }
            }

        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
