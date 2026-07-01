package in.co.nmsworks.training.week3.Day3;

import java.io.*;
import java.util.*;

public class FileEditor {
    public static void main(String[] args) throws IOException {
        FileEditor fe = new FileEditor();
        fe.wordReplacer();
        fe.wordCounter();
        fe.countWordGreaterThanFive();
    }

    private void countWordGreaterThanFive() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/passage.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("/home/nms-training/Downloads/passageOut.txt"));
        String line = "";
        System.out.println("______________Words having more than 5 letters and Unique Words in the Paragraph_____________");

        try {
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                int wordCount = 0;
                //System.out.println(Arrays.toString(words));
                for (String word : words) {
                    if (word.length() > 5) {
                        //System.out.println(word);
                        bw.write(word);
                        bw.write("\n");
                        wordCount++;
                    }
                }

                Set<String> wordSet =new HashSet<>();
                for (String word : words) {
                    wordSet.add(word);
                }
                //System.out.println("Count of Words haveing more than 5 letters: " + wordCount);
                bw.write("Total words longers than 5 letters.: "+wordCount);
                bw.write("\n");
                bw.write("No.of unique words in the paragraph :: "+wordSet.size());

            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void wordCounter() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/countWords.txt"));
        String line = "";

        try {
            while ((line = br.readLine()) != null) {

                int wordCount = 0;
                int sentenceCount = 0;
                String[] sentence = line.split("\\.");
                //System.out.println(Arrays.toString(sentence));

                while (sentenceCount < sentence.length) {
                    sentenceCount++;
                }
                //System.out.println("Number of sentences is: " + sentenceCount);


                String[] words = line.split(" ");
                while (wordCount < words.length) {
                    wordCount++;
                }
                //System.out.println("Number of Words in the Paragraph is :" + wordCount);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void wordReplacer() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/original.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/modified.txt"));
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                if (line.contains("old")) {
                    String replacedLine = line.replace("old", "new");
                    bw.write(replacedLine);
                } else {
                    bw.write(line);
                }
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
