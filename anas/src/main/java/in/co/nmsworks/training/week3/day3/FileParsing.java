package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    String txt = "";
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        //fileParsing.writeToFile();
        //fileParsing.readFromFile();
//        fileParsing.readFromSampleText();
       // fileParsing.writeToSampleText();
        fileParsing.bufferedReaderWriter();
    }

    private void bufferedReaderWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fr = new  FileReader("/home/nms-training/Downloads/SampleText.txt");
            BufferedReader br = new BufferedReader(fr);
            fw = new FileWriter("/home/nms-training/Downloads/SampleText.txt", true);
            bw = new BufferedWriter(fw);


            String line = "";

            while ((line = br.readLine()) != null) {
                line = line.toUpperCase();
                System.out.println(line);
                bw.write(line);
                bw.write("\n");
            }

            bw.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeToSampleText(String txt) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("/home/nms-training/Downloads/SampleText.txt");
            writer.write(txt);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void readFromSampleText() {

        FileReader fileReader1 = null;
        try {
            fileReader1 = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ch;
            while((ch = fileReader1.read()) != -1) {
                if( ch == '.'){
                    txt += ".\n";
                } else {
                    txt += String.valueOf((char) ch).toUpperCase();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(txt);
        writeToSampleText(txt);

    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "he is a software engineer at nms.";
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
