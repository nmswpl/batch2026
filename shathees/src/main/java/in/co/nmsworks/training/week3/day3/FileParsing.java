package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        //fileParsing.writeToFile();
        //fileParsing.readFromFile();
        //fileParsing.writeToFileUpperCase();
        //fileParsing.fileBufferedWriter();
        fileParsing.readFile();
    }

    private void readFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"))
        ){
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private void fileBufferedWriter() {
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/SampleUpper.txt"));

            String[] lines = bufferedReader.readLine().split("\\.");
            for(String line : lines){
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.write("\n");
            }

            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void writeToFileUpperCase() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Downloads/SampleText.txt");
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/SampleUpper.txt");
            int ch;
            while ((ch = fileReader.read()) != -1){
                char ch1 = (char)ch;
                if (ch1 == '.'){
                    fileWriter.write(ch1);
                    fileWriter.write('\n');
                }else {
                    fileWriter.write(Character.toUpperCase(ch1));
                }


            }
            fileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            FileReader fileReader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "my name is shathees gv I am coming from ramanathapuram";
        try {
            FileWriter fileWriter = new FileWriter("/home/nms-training/Desktop/output.txt",true);
            fileWriter.write(text);
           // fileWriter.close();
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
