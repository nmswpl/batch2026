package in.co.nmsworks.training.week3.day3;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        ReplaceWord replaceWord = new ReplaceWord();
        replaceWord.readAndReplace();

    }

    private void readAndReplace() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Original.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/Modified.txt"));

            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                for (String word : line.split(" ")) {
                    if ( word.equals("old")){
                        String replace = word.replace("old", "new");
                        bufferedWriter.write(replace + " ");
                    }
                    else {
                        bufferedWriter.write( word+" ");
                    }
                }
                bufferedWriter.write("\n");
                bufferedWriter.flush();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
