package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class CountWordsInIndia {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Desktop/India.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/IndiaOutput.txt"));
        String line = "";
        String[] words = {};
        int count = 0;
        Set<String> set = new HashSet<>();
        while ((line = br.readLine()) != null){
            words = line.split(" ");
            for (String ch : words){
                set.add(ch);
                if (ch.length() > 5){
                    count++;
                }
            }


        }
        System.out.println("unique words : "+set.size());



        bw.write("Total no of words greater than 5 letters : "+count);
        bw.write("\nUnique words : "+ set.size());
        bw.close();
        System.out.println("Count :" +count);

        System.out.println(words.length);
    }
}
