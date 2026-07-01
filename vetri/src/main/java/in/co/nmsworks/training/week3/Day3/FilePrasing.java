package in.co.nmsworks.training.week3.Day3;

import java.io.*;

public class FilePrasing {
    public static void main(String[] args) throws IOException {
        FilePrasing filePrasing = new FilePrasing();
        filePrasing.wirteToFile();
        filePrasing.readFromFile();
        filePrasing.readAndWriteToAFile();
        //filePrasing.VowelIdentifier();
        filePrasing.bufferReader();
    }

    private void bufferReader() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("/home/nms-training/Desktop/bufferWrite.txt"));
        String line="";

        try {
            while ((line=br.readLine())!=null){
                bw.write(line.toUpperCase());
                bw.write("\n");
            }
            bw.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void VowelIdentifier() {
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            FileWriter fw = new FileWriter("/home/nms-training/Desktop/vowel.txt");
            int chas;
            while ((chas = (fr.read())) != -1) {
                char cha = (char) chas;
                if (cha == 'a' || cha == 'A' || cha == 'e' || cha == 'E' || cha == 'i' || cha == 'I' || cha == 'o' || cha == 'O' || cha == 'u' || cha == 'U') {
                    fw.write(Character.toUpperCase(cha));
                } else {
                    fw.write(cha);
                }
            }
            fr.close();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readAndWriteToAFile() {
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            FileWriter fw = new FileWriter("/home/nms-training/Desktop/sample.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                char character = (char) ch;
                if (character != '.') {
                    fw.write(Character.toUpperCase(character));
                } else {
                    fw.write(".\n");
                }
            }
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readFromFile() {
        try {
            FileReader file = new FileReader("/home/nms-training/Desktop/output.txt");

            int ch;
            while ((ch = file.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void wirteToFile() {

        String text = "Im vetiselvan G and Im from Maniyambattu";

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
