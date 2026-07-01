package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        fileParsing.writeToFile();
        fileParsing.readFromFile();
        String txt = fileParsing.readFromSampleTxt();
        fileParsing.writeToSampleFile(txt);
        fileParsing.readAndWriteBuffer();
    }

    private void readAndWriteBuffer() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/SampleBufferOutput.txt"));
            String line = bufferedReader.readLine();
            String[] newLine = line.split("\\.");
            for (String sentence : newLine) {
                bufferedWriter.write(sentence.toUpperCase() +"\n");
                bufferedWriter.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void writeToSampleFile(String txt) {
        String[] sentences = txt.split("\\.");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/SampleOutput.txt");
            for (String sentence : sentences) {
                fileWriter.write(sentence.toUpperCase() + "\n");
                fileWriter.flush();
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private String readFromSampleTxt() {
        String txt = null;
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            txt = "";
            while ((ch = fileReader.read()) != -1) {
                txt += (char) ch;
            }
            System.out.print(txt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt;
    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/Output.txt");
            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String txt = "I am Gobika from Thajavur";
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/Output.txt",true);
            fileWriter.write(txt);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
