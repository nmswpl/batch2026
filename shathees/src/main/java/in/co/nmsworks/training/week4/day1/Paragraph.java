package in.co.nmsworks.training.week4.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Paragraph {
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph();
       int[] res= paragraph.readFile();
        for (int re : res) {
            System.out.println(re);

        }


    }


    private int[] readFile() {
        int[] count = new int[3];
        int wordCounter = 0,leterCount=0,sentenseCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {
            //Map<String, Integer> fileMap = new HashMap<>();
            String line = "";
            wordCounter = 0;


            while ((line = bufferedReader.readLine()) != null) {
                char[] charArr =line.toCharArray();
                for (int i = 0; i < charArr.length; i++) {
                    if (Character.isLetter(charArr[i])){
                        leterCount ++;
                    }
                    if (charArr[i]=='.'){
                        sentenseCount ++;

                    }
                }


                String[] arr = line.split("\\s+");
                for (String s : arr) {
                    wordCounter++;
                }



            }
            count[0] = sentenseCount;
            count[1] = wordCounter;
            count[2] = leterCount;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}


