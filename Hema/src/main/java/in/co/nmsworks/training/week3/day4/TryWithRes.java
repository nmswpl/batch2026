package in.co.nmsworks.training.week3.day4;

import java.io.*;

public class TryWithRes {
    public static void main(String[] args) {

        readFromFile();
    }

    private static void readFromFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/original.txt",true)))
        {
            String line = "";
            line = bufferedReader.readLine();
            System.out.println(line);
            bufferedWriter.write("\n\nREAD TEXT => "+ line);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
