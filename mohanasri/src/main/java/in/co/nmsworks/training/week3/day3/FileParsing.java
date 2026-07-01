package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileParsing {
    public static void main(String[] args) {
        FileParsing fileParsing = new FileParsing();
        //fileParsing.writeToFile();
        //fileParsing.readFromFile();
        fileParsing.readFromAnotherFile();
        try {
            fileParsing.bufferREaderAndWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void bufferREaderAndWriter() throws IOException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/home/nms-training/Downloads/SampleText.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }

        String line = "";
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("/home/nms-training/Downloads/SampleTextOutput2.txt"));
        while((line = br.readLine()) != null){
            bw.write(line.toUpperCase());

        }
        br.close();
        bw.close();

    }

    private void readFromAnotherFile() {
        String text = " ";
        try {
            FileReader fr = new FileReader("/home/nms-training/Downloads/SampleText.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                if (ch == '.') {
                    text += "\n";
                    continue;
                }
                text += (char) ch;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newText = text.toUpperCase();
        try{
            FileWriter fw = new FileWriter("/home/nms-training/Downloads/SampleTextOutput.txt");
            fw.write(newText);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    private void readFromFile() {
        try {
            FileReader reader = new FileReader("/home/nms-training/Desktop/output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile() {
        String text = "My name is Mohanasri, I am coming from Salem";
        try {
            FileWriter writer = new FileWriter("/home/nms-training/Desktop/output.txt", true);
            writer.write(text);
            writer.close();
//            writer.flush(text);
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}

//private void readFromAnotherFile() {
//    StringBuilder textBuilder = new StringBuilder();
//    File inputFile = new File("/home/nms-training/Downloads/SampleText.txt");
//    File outputFile = new File("/home/nms-training/Downloads/SampleTextOutput.txt");
//
//    // Try-with-resources automatically closes the reader
//    try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
//        int ch;
//        while ((ch = br.read()) != -1) {
//            if (ch == '.') {
//                textBuilder.append("\n");
//                continue;
//            }
//            textBuilder.append((char) ch);
//        }
//    } catch (FileNotFoundException e) {
//        System.err.println("Input file not found: " + e.getMessage());
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    String newText = textBuilder.toString().toUpperCase();
//
//    // Try-with-resources automatically flushes and closes the writer
//    try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
//        bw.write(newText);
//    } catch (IOException e) {
//        throw new RuntimeException("Error writing to file", e);
//    }
//}