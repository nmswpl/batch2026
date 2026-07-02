package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class FileModifier {
    public static void main(String[] args) {
        FileModifier fileModifierObj = new FileModifier();

        fileModifierObj.replaceWordsInFile("/home/nms-training/Downloads/original.txt","/home/nms-training/Downloads/ReplacedOriginal.txt");
    }

    private void replaceWordsInFile(String srcPath, String desPath) {

//        String fileContent = "" ;
        BufferedReader readerObj = null;
        BufferedWriter writerObj = null;
        try {
            readerObj = new BufferedReader(new FileReader(srcPath));
            writerObj = new BufferedWriter(new FileWriter(desPath));
            String sentence, updatedSentence ;
            while((sentence = readerObj.readLine()) != null){
                updatedSentence = sentence.replace("old","new");
                writerObj.write(updatedSentence+"\n");
//                fileContent += sentence + "\n";
                System.out.println("sentence : " + sentence);
            }
//            System.out.println("file content : " + fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{

            if(readerObj != null){
                try {
                    readerObj.close();
                }
                catch (Exception e){
                }
            }

            if(writerObj != null){
                try {
                    writerObj.close();
                }
                catch (Exception e){
                }
            }

        }
    }


}
