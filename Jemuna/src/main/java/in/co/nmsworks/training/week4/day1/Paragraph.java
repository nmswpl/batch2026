package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Paragraph{
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph();
        paragraph.readFromFile();
    }

    private int[] readFromFile() {

        int[] countList = new int[3];
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))){
            String line;
            int noOfLines=0;
            int noOfWords=0;
            int noOfLetters = 0;
            while((line = reader.readLine())!=null){
                String[] wordsArray = line.split("\\.");
                noOfLines++;
                for (String word : wordsArray) {
                    String[] wordsPerLine = word.split(" ");
                    noOfWords++;
                    noOfLetters = word.length()+noOfLetters;
                }
                countList[0] = noOfLines;
                countList[1] = noOfWords ;
                countList[2] = noOfLetters;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of Lines : "+ countList[0]+"\nNumber of words : "+countList[1]+"\nNumber of letters : "+countList[2]);

        return countList;
    }
}

