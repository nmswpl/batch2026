package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
//        fileParsing.writeToFile();
//        fileParsing.readFromFile();
//        fileParsing.readFromSampleFile();
//        fileParsing.readFromFileUsingBuffer();
        fileParsing.readSampleText();
    }

    private void readSampleText() {
        try (FileReader reader = new FileReader("/home/nms-training/Desktop/SampleText.txt");FileWriter writer = new FileWriter("/home/nms-training/Desktop/TryWithResrc.txt")){

            int ch;
            while((ch = reader.read())!=-1){
                System.out.print((char)ch);
                writer.write(ch);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void readFromFileUsingBuffer() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("/home/nms-training/Desktop/SampleText.txt"));
            writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Buffer.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {

                writer.write(line.toUpperCase() );


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



    private void readFromSampleFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/SampleText.txt");
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/out.txt");

            int ch;
            while ((ch = reader.read()) != -1){
                System.out.print((char) ch);
                Character character = Character.toUpperCase((char) ch);
                if(character.equals('.')){
                    character='\n';
                }
                writer.write(character);
            }
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "My name is Priyanka. I am coming from Villupuram.";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/output.txt",true);
            writer.write(text);
//            writer.close();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
