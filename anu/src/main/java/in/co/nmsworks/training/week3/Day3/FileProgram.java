package in.co.nmsworks.training.week3.Day3;

import java.io.*;
import java.util.*;

public class FileProgram {
    public static void main(String[] args) {
        FileProgram fileProgram = new FileProgram();
        fileProgram.modifyContent();
        fileProgram.countTextFile();
        fileProgram.longerCountInPara();
    }

    private void longerCountInPara() {
        BufferedReader br= null;
        try{
            br=new BufferedReader(new FileReader("/home/nms-training/Downloads/countPara.txt"));
            String lines="";
            Set<String> uniqueWords = new HashSet<>();
            Integer countWord = 0,countSentence=0;
            while((lines= br.readLine()) !=null){
                String[] para = lines.split(" ");
                for (String s : para) {
                    if (s.length() > 5) {
                        System.out.print(s + " ");
                        countWord++;
                    }
                    if (!uniqueWords.contains(s)) {
                        uniqueWords.add(s);
                    }
                }
            }
            System.out.println();
            System.out.println(countWord);
            System.out.println();
            System.out.println(uniqueWords);
            System.out.println("length of unique words : " + uniqueWords.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void countTextFile() {
        BufferedReader br= null;
        try{
            br=new BufferedReader(new FileReader("/home/nms-training/Downloads/countWords.txt"));
            String lines="";
            Integer countWord = 0,countSentence=0;
            while((lines= br.readLine()) !=null){
                String[] word = lines.split(" ");
                countWord+=word.length;

                String[] sentences = lines.split("\\.");
                countSentence+=sentences.length;
            }
            System.out.println(countWord);
            System.out.println(countSentence);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void modifyContent() {
        BufferedReader br= null;
        BufferedWriter bw= null;
        try{
            br=new BufferedReader(new FileReader("/home/nms-training/Downloads/orginial.txt"));
            bw=new BufferedWriter(new FileWriter("/home/nms-training/Downloads/modified.txt"));

            String line =" " ;
            while ((line = br.readLine()) != null){
                String[] separate = line.split(",");
                if(separate[0].contains("old")){
                    separate[0] = separate[0].replace("old", "new");
                }
                bw.write(separate[0] + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
