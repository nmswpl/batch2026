package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        //fileParsing.writeToFile();
        // fileParsing.readFromFile();
        // fileParsing.readAndWrite();
        fileParsing.bufferedReadWrite();

    }

    private void bufferedReadWrite() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String text = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/SampleText.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            try {
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    text += line;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        String newText = text.toUpperCase();

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/output.txt"));
            bufferedWriter.write(newText);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void readAndWrite() {
        String text= "";
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/SampleText.txt");
            int ch;
            while ((ch = fileReader.read()) != -1){
                if (ch == '.'){
                    text += "\n";
                    continue;
                }
                text += (char) ch;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newText = text.toUpperCase();
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt");
            fileWriter.write(newText);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");

            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeToFile() {
        String text = "My name is Gabriella. I come from Chennai";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/output.txt", true);
            writer.write(text);
            //writer.close();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
