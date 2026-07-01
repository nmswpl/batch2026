package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class FileParser {
    public static void main(String[] args) {

        FileParser fp = new FileParser();
        fp.question1();
        fp.question2();
        fp.question3();
    }

    private void question3() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        Set<String> uniqueWords = new HashSet<>();

        try {
            fileReader = new FileReader("/home/nms-training/Desktop/question3.txt");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("/home/nms-training/Desktop/question3output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = "";
            int noOfWords = 0;
            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.length() > 5) {
                        noOfWords++;
                    }
                    uniqueWords.add(word);
                }
            }

            bufferedWriter.write("Number of words longer than length 5 : " + noOfWords);
            bufferedWriter.write("\n");

            bufferedWriter.write("Number of Unique words : " + uniqueWords.size());

            System.out.println("Number of words longer than length 5 : " + noOfWords);
            System.out.println("Number of Unique words : " + uniqueWords.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void question2() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("/home/nms-training/Desktop/input.txt");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("/home/nms-training/Desktop/countwords.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = "";
            int noOfWords = 0;
            int noOfSentences = 0;
            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(" ");
                noOfWords += words.length;

                String[] sentences = line.split("\\.");
                noOfSentences += sentences.length;
            }

            System.out.println("Words : " + noOfWords);
            System.out.println("Sentences : " + noOfSentences);

            bufferedWriter.write("Number of words : " + noOfWords);
            bufferedWriter.write("\n");

            bufferedWriter.write("Number of Sentences : " + noOfSentences);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void question1() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("/home/nms-training/Desktop/original.txt");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("/home/nms-training/Desktop/modified.txt");
            bufferedWriter= new BufferedWriter(fileWriter);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String modifiedString = line.replace("old", "new");

                bufferedWriter.write(modifiedString);
                bufferedWriter.write("\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
