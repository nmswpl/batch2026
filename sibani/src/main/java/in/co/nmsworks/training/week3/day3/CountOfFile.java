package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CountOfFile {
    public static void main(String[] args) {
        CountOfFile countOfFile = new CountOfFile();
        countOfFile.countWordsAndSentences();
        countOfFile.countWords();
    }

    private void countWords() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        Set<String> uniqueWordsSet = new HashSet<>();
        Integer count = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/aboutIndia.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/countOutput.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {

                    if (word.length() > 5) {
                        count ++ ;
                    }
                    uniqueWordsSet.add(word);
                }
                bufferedWriter.write("No of words with more than 5 letters : " + count + "\n");
                bufferedWriter.write("Unique Words in the file : "  + uniqueWordsSet.size());
                bufferedWriter.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void countWordsAndSentences() {
        BufferedReader bufferedReader = null;
        Integer wordCount = 0, sentenceCount = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                String[] sentences = line.split("\\.");
                for (String sentence : sentences) {
                    sentenceCount++ ;
                }
                for (String word : words) {
                    wordCount++ ;
                }
            }
            System.out.println("No of Words : " + wordCount);
            System.out.println("No of Sentences : " + sentenceCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
