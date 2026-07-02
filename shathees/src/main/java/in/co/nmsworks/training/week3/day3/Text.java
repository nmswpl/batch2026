package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class Text {
    public static void main(String[] args) {

        try {
            getRead();
            modifyText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void modifyText() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/modified.txt"));
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                String[] lines = line.split("\\.");
                for (int i = 0; i < lines.length; i++) {
                    if (!lines[i].contains("old")){
                        bufferedWriter.write(lines[i]);
                    }else {
                        bufferedWriter.write(lines[i].replaceAll("old","new"));
                    }
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    private static void getRead() throws IOException {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/original.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
