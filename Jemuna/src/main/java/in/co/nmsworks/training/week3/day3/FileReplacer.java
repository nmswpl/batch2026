package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileReplacer {
    public static void main(String[] args) {
        FileReplacer fileReplacer = new FileReplacer();
        fileReplacer.replaceOld();
    }

    private void replaceOld() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/original.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/modified.txt"));
            String line;
            String update="";
            while((line=bufferedReader.readLine())!=null){
                update += line.replace("old","new")+"\n";
            }
            bufferedWriter.write(update);
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
