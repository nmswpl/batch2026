package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ParagraphAnalysis {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line="";
            String[] arr = new String[0];
            int lineCount=0;
            int wordCount=0;
            int letterCount=0;
            String [] words=new String[0];
            while((line=bufferedReader.readLine())!=null)
            {
                arr=line.split("\\.");
                words=line.split("\\s+");
                for (String word : words) {
                    letterCount+=word.length();
                }
                wordCount+=words.length;
                lineCount+= arr.length;
            }
            System.out.println("Line Count "+lineCount);
            System.out.println("Word Count "+wordCount);
            System.out.println("Letter Count "+letterCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
