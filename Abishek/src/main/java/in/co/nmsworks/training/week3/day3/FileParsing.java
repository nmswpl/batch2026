package in.co.nmsworks.training.week3.day3;
import java.lang.*;
import java.io.*;
public class FileParsing {

    public static void main(String[] args) {

        FileParsing fp = new FileParsing();
//        fp.writeToFile();
//        fp.readFile();
//        fp.readSampleText();
//        fp.writeSampleText();
//        fp.readBuffer();
        fp.writeBuffer();
        fp.sampleText();}

    private void sampleText() {

        try(FileReader fr = new FileReader("/home/nms-training/Desktop/SampleText.txt"); FileWriter fw = new FileWriter("/home/nms-training/Desktop/SampleText.txt")) {
            System.out.println(fr.read());

        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeBuffer() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/SampleTextOne.txt"));
            BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            String line ="";
            while ((line = br.readLine()) != null)
            {
//                i++;
                line.toUpperCase();
                bw.write(line+"\n");
                bw.flush();
            }

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void writeSampleText() {

        try{
            FileWriter writeFile = new FileWriter("/home/nms-training/Downloads/SampleTextCopy.txt");
            FileReader newFile = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ascii;
            while ((ascii = newFile.read()) != -1) {

               writeFile.write((char) ascii);
               writeFile.flush();
            }
            newFile.close();
        }
        catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        catch (IOException e) {
           e.printStackTrace();
        }

    }

    private void readSampleText() {

        try {
            FileReader newFile = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            int ascii;
            while( (ascii = newFile.read()) != -1)
            {
                char newOne = (char) ascii;
                String letter = String.valueOf(newOne);
                System.out.print(letter.toUpperCase());
                if(newOne == '.')
                {
                    System.out.println();
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFile() {

        try {
            FileReader newFile = new FileReader("/home/nms-training/Desktop/output.txt");
            int ascii;
            while( (ascii = newFile.read()) != -1)
            {
                System.out.print((char) ascii);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {

        String txt = "My name is Abishek, from Thoothukudi";

        try
        {
            FileWriter newFile = new FileWriter("/home/nms-training/Desktop/output.txt");
            newFile.write(txt);
            newFile.append(" true");
            newFile.close();
//            newFile.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
