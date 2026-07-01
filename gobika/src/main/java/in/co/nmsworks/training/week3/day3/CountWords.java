package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        countWords.wordAndSentenceCount();
        countWords.countLongWords();
    }

    private void countLongWords() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        Integer countLongWords = 0;
        Set<String> uniqueSet = new HashSet<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countLongerWords.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/countLongWordsResult.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > 5){
                        countLongWords ++;
                    }
                    uniqueSet.add(word);
                }
            }
            bufferedWriter.write("Total longest words : "+ countLongWords);
            bufferedWriter.write("\nUnique words : "+ uniqueSet.size());
            bufferedWriter.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void wordAndSentenceCount() {
        BufferedReader bufferedReader = null;
        Integer noOfWords = 0;
        Integer noOfSentences = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] sentences = line.split("\\.");
                noOfSentences = sentences.length;
                for (String sentence : sentences) {
                    String[] words = sentence.split(" ");
                    noOfWords += words.length;
                }
            }

            System.out.println("Number of Words : "+ noOfWords);
            System.out.println("Number of Sentences : " + noOfSentences);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
