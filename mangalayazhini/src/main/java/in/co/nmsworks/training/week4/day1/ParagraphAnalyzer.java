package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;


public class ParagraphAnalyzer {
    public static void main(String[] args) {
        ParagraphAnalyzer analyzerObj = new ParagraphAnalyzer();
        int[] analyzedResult = analyzerObj.analyzePassage("/home/nms-training/Downloads/Word_Frequency.txt");

        System.out.println("Result : \n");
        for (int i : analyzedResult) {
            System.out.println(i + " ");
        }

    }



    public int[] analyzePassage(String path){
        int[] result = new int[3];
        try(BufferedReader readerObj = new BufferedReader(new FileReader(path))){
            String data ;
            String fileData = "";

            int count = 0 ;
            while((data = readerObj.readLine()) != null){
                System.out.println("data : \n" + data + "\n");
                fileData += data+"\n";
                count ++;
            }

            System.out.println("Passages : " + count);
            String[] passageArr  = fileData.split("\n\n");
            String[] wordsArr = fileData.split(" ");
            String[] charArr = fileData.split("");

            System.out.println("no of passages : " + passageArr.length);
            System.out.println("no of words : " + wordsArr.length);
            System.out.println("no of chars : " + charArr.length);


            result[0] = passageArr.length;
            result[1] = wordsArr.length;
            result[2] = charArr.length;
            System.out.println("fileData : \n" + fileData);

        }catch(Exception e){
            e.printStackTrace();
        }

        return result;

    }
}
