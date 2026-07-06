package in.co.nmsworks.training.week3.weekendpractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();

        String content = wordFrequencyCounter.readFile();

        int[] result = wordFrequencyCounter.processParagraph(content);

        System.out.println("No.of sentences = "+result[0]);
        System.out.println("No of words = "+result[1]);
        System.out.println("No of letters = "+result[2]);

        String cleanedContent = wordFrequencyCounter.cleanContent(content);

        Map<String,Integer> countMap = EachWordOccurrenceCount(cleanedContent);
        displayDescendingFrequency(countMap);
        List<String> wordList = new ArrayList<>(Arrays.asList( "a", "an", "the", "and", "but", "or", "of", "to", "in", "for", "on", "by", "with",
                "at", "from", "as", "is", "am", "are", "was", "were", "be", "been", "has", "have", "had", "this", "that", "it", "they", "we", "he",
                "she", "you", "i", "not", "will", "would"));

        excludeWords(cleanedContent, wordList);
    }

    private int[] processParagraph(String content) {

        int[] result = new int[3];

        String[] statements = content.split("\\.");
        result[0] = statements.length;

        String[] words = content.split(" ");
        result[1] = words.length;

//        String[] letters = content.split(""); // Method 1
        char[] letters = content.toCharArray();
//        result[2] = content.length();         // Method 2
        result[2] = letters.length;             // Method 3

        return result;
    }

    private static void excludeWords(String content, List<String> wordList) {

        System.out.println("\n After excluding given words : ");
        for (String word : wordList) {
            content = content.replace(" "+word+" "," ");
        }
        System.out.println(content);
    }

    private static void displayDescendingFrequency(Map<String, Integer> map) {

        Map<String,Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new ));

        System.out.println("\nFrequency in Descending Order : ");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<String,Integer> EachWordOccurrenceCount(String cleanedContent) {
        Map<String,Integer> wordCountMap = new HashMap<>();

        for (String word : cleanedContent.split(" ")) {
            if(wordCountMap.containsKey(word))
            {
                wordCountMap.put(word,wordCountMap.get(word)+1);
            }
            else {
                wordCountMap.put(word,1);
            }
        }

        System.out.println("\nOccurrence of Each Word : ");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        return wordCountMap;
    }

    private String cleanContent(String content) {
        String cleanedContent;

        cleanedContent = content.replace(",","");
        cleanedContent = cleanedContent.replace(".","");

        System.out.println("Cleaned Content = "+cleanedContent);

        return cleanedContent;
    }

    private String readFile() {
        String content = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt")))
        {
            String line;

            while ((line = bufferedReader.readLine()) != null)
            {
                content = content + line;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }
}
