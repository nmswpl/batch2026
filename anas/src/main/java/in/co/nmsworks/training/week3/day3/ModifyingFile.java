package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class ModifyingFile {
    public static void main(String[] args) {
        ModifyingFile mf = new ModifyingFile();
        mf.readWriteFile();
    }

    private void readWriteFile() {
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/original.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/nms-training/Downloads/modified.txt");
            bw = new BufferedWriter(fw);

            String line = "";
            String modifiedString = "";

            while ((line = br.readLine()) != null) {
                line.toLowerCase();
                modifiedString = line.replace("old", "new");
                bw.write(modifiedString);
                bw.write("\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
