package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CountWordsLargerThan5 {
    public static void main(String[] args) {
        CountWordsLargerThan5 c = new CountWordsLargerThan5();
        c.readWrite();
    }

    private void readWrite() {
        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("/home/nms-training/Downloads/largerthan5.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/nms-training/Downloads/outputForLargerThan5.txt");
            bw = new BufferedWriter(fw);

            String line;
            int count = 0;
            Set<String> uniqueWordSet = new HashSet<>();

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > 5) {
                        count++;
                    }
                    uniqueWordSet.add(word);
                }
            }
            bw.write("no.of words larger than 5 : " + count);
            bw.write("no. of unique words : " + uniqueWordSet.size());
            System.out.println("no. of words with length larger than 5 : " + count);
            System.out.println("no. of unique words : " + uniqueWordSet.size());
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
