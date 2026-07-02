package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class CountParagraph {
    public static void main(String[] args) {
        CountParagraph countParagraph = new CountParagraph();
        countParagraph.countWords();
        countParagraph.countLines();
    }

    private void countLines() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/countWords.txt"));
            String line;
            int count=0;
            while((line=bufferedReader.readLine())!=null){
                count++;
            }
            bufferedReader.close();
            System.out.println("Number of Lines : "+ count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void countWords() {
        String sampleText="";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/countWords.txt"));
            String line;
            int wordsCount = 0;
            while((line = bufferedReader.readLine()) !=null){
                String[] words = line.split(" ");
                wordsCount += words.length;

            }
            bufferedReader.close();
            System.out.println("Count of words : "+ wordsCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
