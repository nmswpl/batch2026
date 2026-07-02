package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class ReplaceTextByFileParsing {
    public static void main(String[] args) {
        ReplaceTextByFileParsing fileParsing = new ReplaceTextByFileParsing();
        fileParsing.readFile();

    }

    private void readFile() {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt", true));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String replaced = line.replace("old", "new");
                writer.write(replaced);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
