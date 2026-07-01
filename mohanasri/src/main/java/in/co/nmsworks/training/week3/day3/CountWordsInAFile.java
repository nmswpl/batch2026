package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountWordsInAFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));
       String line = "";
       String[] sentence = {};
       String[] words = {};
       while ((line = br.readLine()) != null){
           sentence = line.split("\\. ");
           words = line.split(" ");
       }
        System.out.println(sentence.length);
        System.out.println(words.length);
        }
    }

