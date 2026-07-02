package in.co.nmsworks.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {

    public void readFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/countWords.txt"));

            String line = " ";
            int words = 0;
            int noOfline = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(" ");
                words += arr.length;
                noOfline++;


            }
            System.out.println("The total number of words is : " + words);
            System.out.println("The total number of lines is : " + noOfline);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
