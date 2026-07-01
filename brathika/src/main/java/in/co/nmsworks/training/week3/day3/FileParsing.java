package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        fileParsing.writeToFile();
        fileParsing.readFromFile();
        System.out.println();
        String sampleText = fileParsing.readSampleFile();
        System.out.println("Text"+sampleText);
        fileParsing.writeSampleFile(sampleText);
        fileParsing.bufferedReaderAndWriter();
    }


    private void bufferedReaderAndWriter() {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/output.txt"));
            BufferedReader bufferedReader = new BufferedReader( new FileReader("/home/nms-training/Desktop/Sample1.txt"));

            String text = "";
            while ((text = bufferedReader.readLine()) != null) {
                bufferedWriter.write(text+"\n");

                System.out.println(text);
                bufferedWriter.flush();

            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void writeSampleFile(String sampleText) {
         try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Sample1.txt");
            String[] strarray = sampleText.split("\\. ");
             System.out.println("Sentences length: "+strarray.length);
             for (String s : strarray) {
                 writer.write(s.toUpperCase());
                 writer.write("\n");
                 writer.flush();
             }
             writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readSampleFile() {
        String text = null;
        try {
            FileReader reader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            text = "";
            while ((ch = reader.read()) != -1) {
                text += (char)ch;
                System.out.print((char) ch);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;

    }

    private void readFromFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/Output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void writeToFile() {
        String text = "My name is Brathika G S. I am coming from Trichy.";
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
