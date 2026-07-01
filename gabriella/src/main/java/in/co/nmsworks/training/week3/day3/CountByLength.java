package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountByLength {
    public static void main(String[] args) {
        CountByLength countByLength = new CountByLength();
        countByLength.countWords();
    }

    private void countWords() {
        String text = "";
        int noOfWords = 0;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/text.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text += line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String[] splitText = text.split(" ");
        for (String s : splitText) {
            if (s.length()>5){
                noOfWords++;
            }
        }
        List<String> uniqueText = new ArrayList<>();

        for (String s : splitText) {
            if (!uniqueText.contains(s)){
                uniqueText.add(s);
            }
        }
        System.out.println("No.of words longer than 5 characters: " + noOfWords);
        System.out.println("No.of unique words: " + uniqueText.size());

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/details.txt");
            fileWriter.write("Total words longer than 5 letters: " + noOfWords + "\n");
            fileWriter.write("No of unique words: " + uniqueText.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
