package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BufferPractice3 {
    public static void main(String[] args) {
        BufferPractice3 bufferPractice3 = new BufferPractice3();
        bufferPractice3.countWordsGreaterThanFive();
    }

    private void countWordsGreaterThanFive() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/Words.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/nms-training/Desktop/UniqueWords"));
            Set<String> set = new HashSet<>();
            String text = "";
            Integer count = 0;
            while ((text = bufferedReader.readLine()) != null) {
                String[] array = text.split(" ");
                for (String s : array) {
                    set.add(s);
                    if (s.length() > 5) {

                        count++;
                    }
                }
            }
            bufferedReader.close();
            bufferedWriter.write("No of sentence greater than five is: "+count+"\n");
            bufferedWriter.write("No of unique words in the paragraph is: "+set.size()+"\n");
            bufferedWriter.close();
            System.out.println("No of sentence greater than five is: "+count);
            System.out.println("No of unique words in the paragraph is: "+set.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
