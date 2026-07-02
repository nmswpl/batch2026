package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {

    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
//        fileParsing.writeToFile();
//        fileParsing.readFromFile();
//        String text = fileParsing.readFromSampleText();
//        fileParsing.writeToSampleText(text);
        fileParsing.bufferedReadFromSampleText();
    }

    private String bufferedReadFromSampleText() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/Sample_output.txt"));
            String text = bufferedReader.readLine();
            System.out.println(text);
            String[] sentence = text.split("\\.");
            for (String s : sentence) {
                bufferedWriter.write(s.toUpperCase() + "\n");
                bufferedWriter.flush();
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    private String readFromSampleText() {
        String text = "";
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while((ch = fileReader.read()) != -1){
                text += (char) ch;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }



    private void writeToSampleText(String text) {
        String[] sentences = text.split("\\.");
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/SampleText.txt");
            for (String sentence : sentences) {
                System.out.println(sentence);
                fileWriter.write(sentence.toUpperCase());
                fileWriter.write("\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void readFromFile() {

        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;

            while ((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    private void writeToFile() {
        String text = "My name is Sibani. I am coming frm Tirunelveli.";
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt", true);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
