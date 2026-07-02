package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;

public class WordsAndSentenceCounter {
    public static void main(String[] args) {
        WordsAndSentenceCounter counterObj = new WordsAndSentenceCounter();

        counterObj.count("/home/nms-training/Downloads/countWords.txt");
    }

    private void count(String path) {
        String fileContent = "" ;
        String sentence ;
        String[] sentencesList ;
        int wordsCount = 0 ;
        BufferedReader readerObj = null;

        try {
            readerObj = new BufferedReader(new FileReader(path));

            while((sentence = readerObj.readLine()) != null){
                System.out.println("sentence : " + sentence);
                fileContent += sentence;
            }
            sentencesList = fileContent.split("\\.[^0-9]");

            System.out.println("Total sentence : " + sentencesList.length);

            for (String line : sentencesList) {
                System.out.println(line + "\n");
                String[] words = line.split(" ");
                wordsCount += words.length;
            }

            System.out.println("words count : " + wordsCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{

            if(readerObj != null){
                try {
                    readerObj.close();
                }
                catch (Exception e){
                }
            }

        }
    }
}
