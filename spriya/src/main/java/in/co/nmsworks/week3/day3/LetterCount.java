package in.co.nmsworks.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class LetterCount {

    public void readFile() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/LetterCount.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/OutputLetters.txt"));
            Set<String> set = new HashSet<>();
            String line = " ";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(" ");
                bufferedWriter.write("===LETTERS LONGER THAN 5---");
                for (int i = 0; i < arr.length; i++) {
                    set.add(arr[i]);
                    if (arr[i].length() > 5) {
                        bufferedWriter.write(arr[i] + " ");
                        count++;
                    }
                }
                bufferedWriter.write("\n");

                bufferedWriter.write("===UNIQUE WORDS===");
                for (String s : set) {
                    bufferedWriter.write(s + "\n");
                }
            }
            System.out.println("Count Letters : " + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
