package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FindCount {
    public static void main(String[] args) {
        FindCount fc = new FindCount();
        fc.readFile();
    }

    private void readFile() {
        FileReader fr = null;
        FileWriter fw = null;
        int countWords = 0;
        int countSentence = 0;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("/home/nms-training/Downloads/countWords.txt");
            BufferedReader br = new BufferedReader(fr);
            fw = new FileWriter("/home/nms-training/Downloads/count.txt");
            bw = new BufferedWriter(fw);

            String line = "";
            String[] sentence;
            String[] words;
            countSentence = 0;
            countWords = 0;

            while ((line = br.readLine()) != null) {
                sentence = line.split("\\.");
                countSentence += sentence.length;
                words = line.split(" ");
                countWords += words.length;
            }

            System.out.println("no. of sentence : " + countSentence);
            System.out.println("no. of words : " + countWords);

            bw.write("No. of words : " + countWords);
            bw.write("\n");
            bw.write("No. of sentence : " + countSentence);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
