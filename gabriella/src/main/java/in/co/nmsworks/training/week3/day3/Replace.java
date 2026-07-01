package in.co.nmsworks.training.week3.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replace {
    public static void main(String[] args) {
        Replace runner = new Replace();
        runner.replaceOld();
    }

    private void replaceOld() {
        String text = "";
        FileReader reader = null;
        try {
            reader = new FileReader("/home/nms-training/Desktop/original.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                text += (char) ch;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String newText = text.replaceAll("old", "new");

        FileWriter writer = null;
        try {
            writer = new FileWriter("/home/nms-training/Desktop/modified.txt");
            writer.write(newText);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
