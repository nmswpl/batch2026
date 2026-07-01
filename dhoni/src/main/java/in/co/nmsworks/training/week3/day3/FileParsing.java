package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {

        FileParsing fileParsing = new FileParsing();

        //fileParsing.writeToFile();
        //fileParsing.readFromFile();
        //fileParsing.writeToFileUpperCase();
        //fileParsing.fileBufferRead();
        //fileParsing.fileBufferWriter();

    }

    private void fileBufferWriter() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/UpperCaseText.txt"));

            String[] lines = bufferedReader.readLine().split("\\.");

            for(String line : lines){
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void fileBufferRead() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            String line = "";

            while( (line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            System.out.println("Completed read");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void writeToFileUpperCase() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            FileWriter fileWriter = new FileWriter("/home/nms-training/Downloads/SampleUpperCase.txt");

            int ch;

            while((ch = fileReader.read()) != -1){
                char letter = (char)ch;

                if(letter == '.'){
                    fileWriter.write(letter);
                    fileWriter.write("\n");
                }
                else {
                    fileWriter.write(Character.toUpperCase(letter));
                }
            }
            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;

            while((ch = fileReader.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {

        String text = "My name is dhoni, from salem";

        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt",true);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
            System.out.println("written in file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
