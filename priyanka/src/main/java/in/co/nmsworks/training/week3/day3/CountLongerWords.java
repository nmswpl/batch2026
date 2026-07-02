package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.*;

public class CountLongerWords {
    public static void main(String[] args) throws IOException {
        CountLongerWords countLongerWords = new CountLongerWords();
        countLongerWords.fileParsing();
    }

    private void fileParsing() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/sample.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/sampleCount.txt"));
        String line = "";
        List<String> longWords = new ArrayList<>();
        Set<String> unique = new HashSet<>();
        while((line = reader.readLine())!=null){
            String[] sentences = line.split(" ");
            for (String sentence : sentences) {
                if(sentence.length()>5){
                    longWords.add(sentence);
                }
            }
            unique = new HashSet<>(Arrays.asList(sentences));
        }

        System.out.println("Count: "+longWords.size());

        System.out.println("unique words..");

        System.out.println("Unique count:" + unique.size());
        writer.write("Count: "+longWords.size()+"\n");
        writer.write("Unique count:" + unique.size());
        reader.close();
        writer.close();
    }

}
