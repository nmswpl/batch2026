package in.co.nmsworks.training.week4.day1.paragraph;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParagraphAnalysis {
    public static void main(String[] args) {
        ParagraphAnalysis paragraphAnalysis = new ParagraphAnalysis();
        int[] count = paragraphAnalysis.getWords();

        System.out.println("Number of statements in the paragraph : " + count[0]);
        System.out.println("Total number of words : " + count[1]);
        System.out.println("Total number of letters : " + count[2]);
    }

    private int[] getWords() {
        List<String> list = new ArrayList<>();
        int[] count = new int[3];
        int paragraphCount = 0;
        int wordCount = 0;
        int letterCount = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/files/Word_Frequency.txt")))
        {
            String paragraph = "";

            while ((paragraph = bufferedReader.readLine()) != null){

                paragraphCount++;
                String lines = paragraph.replace(".", " ");
                lines = lines.replace(",", " ");
                //System.out.println(lines);

                String[] words = lines.split(" ");
                //System.out.println(Arrays.toString(words));

                for(String word : words){
                    if(!word.isEmpty()) {
                        list.add(word.trim());
                        wordCount++;
                        letterCount = letterCount + word.trim().length();
                    }
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        count[0] = paragraphCount;
        count[1] = wordCount;
        count[2] = letterCount;

        return count;
    }

}
