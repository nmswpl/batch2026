package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountWordsInFile {
    public static void main(String[] args) throws IOException {
        CountWordsInFile countWordsInFile = new CountWordsInFile();
        countWordsInFile.uniqueWords();
    }

    private void uniqueWords() throws IOException {
        String inputPath = "/home/nms-training/Downloads/countWords.txt";
        String outputPath = "/home/nms-training/Downloads/UniquecountWords.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));

        Set<String> uniqueWordsSet = new HashSet<>();
        int totalWordsLongerThan5 = 0;
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {
                if (word.isEmpty()){
                    continue;
                }
                if (word.length() > 5) {
                    totalWordsLongerThan5++;
                }
                uniqueWordsSet.add(word.toLowerCase());
            }
        }
        bufferedReader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        writer.write("Total words longers than 5 letters.: " + totalWordsLongerThan5);
        writer.newLine();
        writer.write("No.of unique words in the paragraph : " + uniqueWordsSet.size());
        writer.close();

        System.out.println("Processing complete! Results saved to " + outputPath);
    }
}
