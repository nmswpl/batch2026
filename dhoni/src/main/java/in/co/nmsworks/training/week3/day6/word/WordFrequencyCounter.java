package in.co.nmsworks.training.week3.day6.word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter runner = new WordFrequencyCounter();
        Set<String> excludedWords = runner.getExcludedWords();
        List<String> listOfWords = runner.getWords();
        HashMap<String,Integer> map = runner.getFrequency(excludedWords,listOfWords);
        PriorityQueue<WordPair> queue = new PriorityQueue<>(
                (a,b) -> Integer.compare(b.getCount(), a.getCount()));

        for(Map.Entry<String,Integer> word : map.entrySet()){
            queue.add(new WordPair(word.getKey(),word.getValue()));
        }
        runner.printWordCount(queue);
    }

    private void printWordCount(PriorityQueue<WordPair> frequencyCount) {

        while (!frequencyCount.isEmpty()) {
            WordPair word = frequencyCount.poll();
            System.out.println(word.getWord() + " : " + word.getCount());
        }
    }

    private HashMap<String, Integer> getFrequency(Set<String> excludedWords, List<String> listOfWords) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String word : listOfWords){
            if(!excludedWords.contains(word.toLowerCase())){
                map.put(word, map.getOrDefault(word,0) + 1);
            }
        }
        return map;
    }


    private List<String> getWords() {
        List<String> list = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/nms-training/Desktop/files/Word_Frequency.txt")))
        {
            String paragraph = "";

            while ((paragraph = bufferedReader.readLine()) != null){

                String lines = paragraph.replace(".", " ");
                lines = lines.replace(",", " ");
                //System.out.println(lines);

                String[] words = lines.split(" ");
                //System.out.println(Arrays.toString(words));

                for(String word : words){
                    if(!word.isEmpty()) list.add(word.trim());
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    private Set<String> getExcludedWords(){

        String[] words = new String[] {
                "a", "an", "the", "and", "but", "or", "of", "to", "in", "for",
                "on", "by", "with", "at", "from", "as", "is", "am", "are", "was",
                "were", "be", "been", "has", "have", "had", "this", "that", "it",
                "they", "we", "he", "she", "you", "i", "not", "will", "would"
        };

        return new HashSet<>(Arrays.asList(words));
    }


}
