package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FileParserExercise {
    public static void main(String[] args) {
        FileParserExercise fileParserExercise=new FileParserExercise();
        fileParserExercise.modifyFile();
        fileParserExercise.countWords("/home/nms-training/Desktop/countWords.txt");
        fileParserExercise.printWordsofGivenLength("/home/nms-training/Desktop/words.txt","/home/nms-training/Desktop/wordLength.txt",5);
    }

    private void printWordsofGivenLength(String filepath, String writeFilepath,int length) {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        try {
            bufferedReader=new BufferedReader(new FileReader(filepath));
            bufferedWriter=new BufferedWriter(new FileWriter(writeFilepath));
            String line="";
            String words[] = new String[0];
            while((line=bufferedReader.readLine())!=null)
            {
                words=line.split(" ");
            }
            int count=0;
            Set<String> uniqueWords=new HashSet<>();
            uniqueWords.addAll(Arrays.asList(words));

            for (int i = 0; i < words.length; i++) {
                if(words[i].length()>=length)
                {
//                    bufferedWriter.write(words[i]+"\n");
                    bufferedWriter.flush();
                    count++;
                }
            }
            bufferedWriter.write("words length greater than "+length+" is "+count+"\n");
            bufferedWriter.write("Unique words count "+length+" is "+uniqueWords.size());

            System.out.println("words length greater than "+length+" is "+count);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void countWords(String filepath) {
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new FileReader(filepath));
            String line="";
            String [] sentence = new String[0];
            String [] word = new String[0];
            while((line=bufferedReader.readLine())!=null)
            {
                sentence=line.split("\\.");
                word=line.split(" ");
            }

            System.out.println("Number of Sentences : "+sentence.length);
            System.out.println("Number of words : "+word.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void modifyFile() {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        try {
            bufferedReader=new BufferedReader(new FileReader("/home/nms-training/Desktop/Original.txt"));
            bufferedWriter=new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modify.txt"));
            String line="";
            while((line=bufferedReader.readLine())!=null)
            {
                line=line.replace("old","new");
                bufferedWriter.write(line);
                bufferedWriter.flush();
                System.out.println(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
