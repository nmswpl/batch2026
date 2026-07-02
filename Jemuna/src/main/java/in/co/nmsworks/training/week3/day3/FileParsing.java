package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        //fileParsing.writeToFile();
        //fileParsing.readFromFile();
        //fileParsing.sampleWriteToFile();
        //fileParsing.sampleReadToFile();
        fileParsing.bufferReader();
        fileParsing.bufferWriter();
    }

    private void bufferWriter() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/SampleBufferText.txt"));
            String sampleText = bufferReader();
            String[] newSampleText = sampleText.split("\\.");
            for (String s : newSampleText) {
                bufferedWriter.write(s.toUpperCase()+"\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String bufferReader() {
        String outputText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            String sentences;
            while((sentences = bufferedReader.readLine())!=null){
                outputText+=sentences;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputText;
    }

    private String sampleReadToFile() {
        String sampleText="";
        try {
            FileReader sampleReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while((ch = sampleReader.read()) !=-1){
                sampleText+=(char) ch;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sampleText;
    }

    private void sampleWriteToFile() {
        try {
            FileWriter sampleWriter = new FileWriter("/home/nms-training/Desktop/SampleOutput.txt");
            String sampleText = sampleReadToFile();
            String[] newSampleText = sampleText.split("\\.");
            for (String s : newSampleText) {
                sampleWriter.write(s.toUpperCase()+"\n");
                sampleWriter.flush();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFromFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/Output.txt");
            int ch;
            while ((ch = reader.read()) !=-1){
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "My name is Jemuna. I am coming from Pudukkottai. ";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Output.txt",true);
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
