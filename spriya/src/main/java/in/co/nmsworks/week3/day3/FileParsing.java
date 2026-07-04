package in.co.nmsworks.week3.day3;

import java.io.*;
import java.nio.Buffer;
import java.util.Locale;

public class FileParsing {

    public void writeToFile() {

        String txt = "My name is Priya! Coming from Namakkal";

        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Output.txt", true);
            writer.write(txt);
            writer.close();
//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {

        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/Output.txt");

            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void writeSample() {

        FileReader fileReader = null;
        FileWriter fileWriter = null;


        try {
            fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");

            fileWriter = new FileWriter("/home/nms-training/Desktop/SampleOutput.txt");
            int ch;

            while ((ch = fileReader.read()) != -1) {
                char c = (char) ch;

                fileWriter.write(c);
            }


            fileWriter.toString().toUpperCase();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void bufferedReader() {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/OutputBuffer.txt"));


            String line = "";

            while ((line = bufferedReader.readLine()) != null) {

                bufferedWriter.write(line);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void readWithTry() {
        try (FileReader reader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
             FileWriter writer = new FileWriter("/home/nms-training/Downloads/SampleoutputText.txt")) {
            int ch;

            while ((ch = reader.read()) != -1) {
                char c = (char) ch;

                writer.write(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
