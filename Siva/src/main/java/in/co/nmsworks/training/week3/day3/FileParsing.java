package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
//        fileParsing.writeToFile();
//        fileParsing.readFromFile();
//        fileParsing.readAndWrite();
//        fileParsing.readFromFile("/home/nms-training/Desktop/Output.txt");
        fileParsing.buffered("/home/nms-training/Downloads/SampleText.txt","/home/nms-training/Desktop/Output.txt");
    }

    private void buffered(String readFilePath, String writeFilePath) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(readFilePath));
            writer = new BufferedWriter(new FileWriter(writeFilePath));
            String text = "";
            while ( (text = reader.readLine()) != null) {
                writer.write(text.toUpperCase()+'\n');
                writer.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void readFromFile(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            int ch;
            System.out.print("File Content :: ");
            while ( (ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readAndWrite() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            String text = "";
            while ((ch = reader.read()) != -1) {
                text += (char)ch;
                if ((char)ch == '.') {
                    text += '\n';
                    reader.read();
                }

            }
            reader.close();
            text = text.toUpperCase();
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Output.txt");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/Output.txt");
            int ch;
            while ( (ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

    private void writeToFile() {
        String text = "My name is Sivakumar. I coming from Sivakasi.";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/Output.txt");
            writer.write(text);
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }

    }
}
