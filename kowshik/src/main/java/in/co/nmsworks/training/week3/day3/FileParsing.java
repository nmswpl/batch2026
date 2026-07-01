package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {


    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        fileParsing.writeToFile();
        fileParsing.readFromFile();

        String sampleTextDoc = fileParsing.readFromSampleTextDoc();
        fileParsing.writeToFileFromSampleText(sampleTextDoc);

        fileParsing.readFileUsingBufferedReader();
    }

    private void readFileUsingBufferedReader() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
             bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter("/home/nms-training/Desktop/practice.txt");
            bufferedWriter= new BufferedWriter(fileWriter);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                line = line.toUpperCase();
                System.out.println(line);

                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }


    private void writeToFileFromSampleText(String sampleTextDoc) {
        System.out.println("Text : " + sampleTextDoc);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt");
            fileWriter.write(sampleTextDoc);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String readFromSampleTextDoc() {
        FileReader fileReader = null;
        String txt = "";
        try {
            fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                char c = (char) ch;
                if (c == '.') {
                    txt = txt + "\n";
                } else {
                    txt = txt + String.valueOf((char) ch).toUpperCase();
                }
            }
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Output : " + txt);
        return txt;
    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch ;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String txt = "My name is Kowshik Senthil Murugan. I am coming from Tiruppur.";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt");
            fileWriter.write(txt);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
