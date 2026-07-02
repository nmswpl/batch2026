package in.co.nmsworks.training.week3.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParser = new FileParsing();

        fileParser.writeToFile("/home/nms-training/Desktop/output.txt");
        fileParser.readFromFile("/home/nms-training/Desktop/output.txt");
    }

    private void readFromFile(String path) {
        try {
            FileReader readerObj = new FileReader(path);
            int ch;
            while((ch = readerObj.read()) != -1){
               char c = (char) ch;
                System.out.print(c);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void writeToFile(String path) {
        String text = "My name is Mangala Yazhini and I am coming from Cuddalore District.";

        try {
            FileWriter writerObj = new FileWriter(path,true);
            writerObj.write(text);
            writerObj.flush();
//          writerObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
