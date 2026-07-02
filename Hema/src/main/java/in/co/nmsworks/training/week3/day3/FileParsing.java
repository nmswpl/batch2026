package in.co.nmsworks.training.week3.day3;

import javax.swing.*;
import java.io.*;

public class FileParsing {

    private String content = "";

    public static void main(String[] args) throws IOException {
        FileParsing fileParsing = new FileParsing();

        fileParsing.writeToFile();
        fileParsing.readFromFile();

        String text = fileParsing.sampleTextRead();
        System.out.println("Content = "+text);
        fileParsing.sampleTextWrite( text );

        fileParsing.BufferedRead();
        fileParsing.BufferedWrite();

    }

    private void BufferedWrite() throws IOException {

        String line = "";
        String content = "";
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader( new FileReader("/home/nms-training/Downloads/SampleText.txt") );


            while ( (line = bufferedReader.readLine()) != null )
            {
                content += line+"\n";
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedReader != null )
            {
                bufferedReader.close();
            }
        }

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter( new FileWriter("/home/nms-training/Desktop/output.txt") );

            bufferedWriter.write( content );


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if( bufferedWriter != null ){
                bufferedWriter.close();
            }

        }
    }

    private void BufferedRead() throws IOException {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader( new FileReader("/home/nms-training/Downloads/SampleText.txt") );
            String line = "";

            while ( (line = bufferedReader.readLine()) != null )
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedReader != null )
            {
                bufferedReader.close();
            }
        }
    }


    private String sampleTextRead() {

        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");

            int ch;

            while( ( ch = fileReader.read() ) != -1 ){
                content = content + (char)ch ;
            }
            System.out.println("Read text => \n "+ content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    private static void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;

            while ( ( ch = fileReader.read() ) != -1 ){
                System.out.print((char) ch);

            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sampleTextWrite( String text ) {

        try {
            String[] textArray = text.split(".");
            for (String s : textArray) {
                System.out.print("Sentence = "+s);
            }
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt");

            for (String string : textArray) {
                fileWriter.write( string.toUpperCase() );
                fileWriter.write("\n");
                fileWriter.flush();
            }

            fileWriter.close();
            System.out.println("output.txt file write successful! ");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeToFile() {
        String text = "My name is Hema B R. I am coming from Theni.\n";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/output.txt",true);
            writer.write(text);

            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
