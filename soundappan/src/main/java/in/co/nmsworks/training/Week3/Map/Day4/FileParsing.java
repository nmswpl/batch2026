package in.co.nmsworks.training.Week3.Map.Day4;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing.writeToFile();
        FileParsing.readFromFile();
        System.out.println();
        FileParsing.readFromFileToUpper();
        FileParsing.writeToFileToUpper();
        FileParsing.BufferReader();
        FileParsing.BufferWriter();
        FileParsing.BufferReaderRes();
    }

    private static void BufferReaderRes() {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/writeBuffer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try (FileReader fr = new FileReader("/home/nms-training/Desktop/sample.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void BufferWriter() {
        BufferedWriter bw;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/writeBuffer.txt"));
            String[] lines = br.readLine().split("\\.");
            for (String line : lines) {
                bw.write(line.toUpperCase());
                bw.write("\n");
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void BufferReader() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Desktop/output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Exception Found");
        }
    }

    private static void writeToFileToUpper() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("/home/nms-training/Desktop/uppercase.txt");
            fr = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                if (c == '.') {
                    fw.write(c);
                    fw.write("\n");
                } else {
                    fw.write((c + "").toUpperCase());
                }
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void readFromFileToUpper() {
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                System.out.print(String.valueOf(c).toUpperCase());
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        try {
            FileReader fr = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writeToFile() {
        String text = "My name is Soundappan";
        try {
            FileWriter fw = new FileWriter("/home/nms-training/Desktop/output.txt", true);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
