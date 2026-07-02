package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileCopy fileCopyObj = new FileCopy();
        fileCopyObj.copyFile("/home/nms-training/Downloads/SampleText.txt",
                "/home/nms-training/Downloads/CopiedSampleText.txt");

        fileCopyObj.copyFileUsingBufferedIO("/home/nms-training/Downloads/SampleText.txt",
                "/home/nms-training/Downloads/SecondCopiedSampleText.txt");
    }

    private void copyFileUsingBufferedIO(String source, String destination) {

        BufferedReader readerObj = null;
        BufferedWriter writerObj = null;
        String textFromFile ;
        String passage = "";
        String[] sentences ;
        try {
           readerObj  = new BufferedReader(new FileReader(source));
           writerObj = new BufferedWriter(new FileWriter(destination));

           System.out.println("text from file ");
           while((textFromFile = readerObj.readLine()) != null){
               passage += textFromFile;
               System.out.println("\n"+textFromFile);
           }

           sentences = passage.split("\\.");
            System.out.println("Sentences : ");
           for(String sentence : sentences){
//               System.out.println(sentence.toUpperCase() + "\n");
               writerObj.write(sentence.toUpperCase() +"\n");
           }




        } catch (Exception e) {
           e.printStackTrace();
        }
        finally {
            try{
                if(readerObj != null){
                    readerObj.close();
                }
                if(writerObj != null){
                    writerObj.close();
                }

            }catch(Exception e){

            }
        }

    }

    private void copyFile(String mainFilePath, String copyFilePath) {
        String text = "";
        String[] textArray ;
        try {
            FileReader fileReaderObj = new FileReader(mainFilePath);
            int asciiChar ;
            char ch;
            while ((asciiChar = fileReaderObj.read()) != -1){
                ch = (char) asciiChar;
                System.out.print(ch);
                text += ch ;
            }
            fileReaderObj.close();

            textArray = text.split("\\.");
            System.out.println("length : " + textArray.length);

            FileWriter fileWriterObj = new FileWriter(copyFilePath);
            for (String sentence : textArray) {
                System.out.println("text : " + sentence);
                fileWriterObj.write(sentence.toUpperCase()+"\n");
            }

              fileWriterObj.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
