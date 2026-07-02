package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        ReplaceWord replaceWord = new ReplaceWord();
        replaceWord.readAndWriteFile();
    }

    private void readAndWriteFile() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals("old")) {
                        word = word.replace("old", "new");
                    }
                    System.out.print(word + " ");
                    bufferedWriter.write(word + " ");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
}
