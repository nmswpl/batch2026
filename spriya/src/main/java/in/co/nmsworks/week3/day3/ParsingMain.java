package in.co.nmsworks.week3.day3;

import java.io.FileWriter;

public class ParsingMain {
    public static void main(String[] args) {

        FileParsing fileParsing = new FileParsing();

        fileParsing.writeToFile();
        fileParsing.readFromFile();

        fileParsing.writeSample();
        fileParsing.bufferedReader();
        fileParsing.bufferedReader();
        fileParsing.readWithTry();
    }
}
