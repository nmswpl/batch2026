package in.co.nmsworks.training.week3.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing=new FileParsing();
        fileParsing.writeToFile();
        fileParsing.readFromFile();

    }

    private void readFromFile() {
        try {
            FileReader reader=new FileReader("/home/nms-training/Desktop/Output.txt");
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeToFile() {
        String text="My name is Saravanapandian and I'm from Madurai";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Output.txt",true);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
