package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing parsing = new FileParsing();
//        parsing.writeToFile();
//        parsing.readFromFile();
//            parsing.bufferedReadAndWrite();
            parsing.tryWithResource();
    }

    private void tryWithResource() {
        try(
                FileReader reader = new FileReader("/home/nms-training/Desktop/SampleText.txt");
                FileWriter writer = new FileWriter("/home/nms-training/Desktop/sampleoutput1.txt")
                ){
            int ch;
            while((ch = reader.read()) != -1) {
                writer.write(ch);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void bufferedReadAndWrite() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/sampleoutput.txt"));
        try {
            String line = "";
            String text = "";
            while((line = reader.readLine()) != null){
                text += line;
            }
            String[] lines = text.toUpperCase().split("\\. ");
            for (String s : lines) {
                writer.write(s + "\n");
            }
            System.out.println("Writing done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(reader != null || writer != null){
                writer.close();
                reader.close();
            }
        }
    }

    private void readAndWrite() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/sampleoutput.txt");
            int ch;
            while((ch = reader.read()) != -1){
                writer.write(Character.toUpperCase(ch) );
                if(ch == '.'){
                    reader.read();
                    writer.write("\n");
                }
            }
            writer.flush();
            writer.close();
            reader.close();
            System.out.println("Writing has been completed");
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
            while((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeToFile() {
        String text = "My name is Farhaan. Im from Cuddalore \n";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/output.txt",true);
            writer.write(text);
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
