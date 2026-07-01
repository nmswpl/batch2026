package in.co.nmsworks.training.week3.Day3;

import java.io.*;

public class FilePassing {
    public static void main(String[] args) {
        FilePassing filePassing = new FilePassing();
//        filePassing.writeToFile();
//        filePassing.readFromFile();
//        filePassing.sampleReadToFile();
//        filePassing.sampleWriteToFile();
        filePassing.bufferedReader();
        filePassing.bufferedWriter();
    }

    private String bufferedReader() {
        BufferedReader  br =null;
        String outText="";
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            String line =" ";
            while ((line = br.readLine())!=null){
                outText+=line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return outText;
    }

    private void bufferedWriter() {
        BufferedWriter bw =null;
        try{
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/SampleOutput.txt"));
            String sampleText=bufferedReader();
            String[] name = sampleText.split(" .");
            for (String s : name) {
                bw.write(s.toUpperCase());
                bw.flush();
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    private void sampleWriteToFile() {
        try {
            FileWriter sampleWrite = new FileWriter("/home/nms-training/Desktop/SampleOutput.txt"); //true is optional its means append al time if not given new file or remove the conetnt
            sampleWrite.write(sampleReadToFile().toUpperCase());
            sampleWrite.flush();
            sampleWrite.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String sampleReadToFile() {
        String fileWriting = " ";
        try {
            int a;
            FileReader sampleRead = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            while (( a = sampleRead.read())!=-1){
                fileWriting+=(char)a;
            }
            String[] fw = fileWriting.split(".");
            for (String s : fw) {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileWriting;
    }

    private void readFromFile() {
        try{
            int ch;
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/Output.txt");
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "My Name is Anushri Thayuman . I am coming From Cuddalore.";
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/Output.txt",true);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
