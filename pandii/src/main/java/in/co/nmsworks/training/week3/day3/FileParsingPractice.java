package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsingPractice {
    public static void main(String[] args) {
        FileParsingPractice fileParsingPractice=new FileParsingPractice();
//        fileParsingPractice.doRead();
        fileParsingPractice.bufferedReadWrite();
    }

    private void bufferedReadWrite() {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            bufferedReader=new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter=new BufferedWriter(new FileWriter("/home/nms-training/Downloads/bufferOut.txt"));
            String line="";
//            String[] line=line.split("//.");
            while((line=bufferedReader.readLine())!=null)
            {
                bufferedWriter.write(line.toUpperCase()+'\n');
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void doRead() {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            reader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            writer = new FileWriter("/home/nms-training/Downloads/SampleOutput.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                if ((char) ch == '.') {
                    ch = '\n';
                }
                writer.write(Character.toUpperCase((char) ch));
                writer.flush();
//                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
