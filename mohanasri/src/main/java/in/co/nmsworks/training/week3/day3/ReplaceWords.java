package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class ReplaceWords {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));
        String lines = "";
        while((lines = br.readLine()) != null){System.out.println();
            bw.write(lines.replace("old", "new"));

        }
        bw.close();

    }
}
