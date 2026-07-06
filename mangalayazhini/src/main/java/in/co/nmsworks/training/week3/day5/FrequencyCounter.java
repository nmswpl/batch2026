package in.co.nmsworks.training.week3.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.*;

public class FrequencyCounter {
    public Map<String,Integer> countWordsFrequency(String path){
        Map<String, Integer> wordsCountMap = new HashMap<>();
        Map<Integer, List<String>> descCountwordsMap = new HashMap<>();
        try(BufferedReader readerObj = new BufferedReader(new FileReader(path))){
            String sentence ;
            String[] words ; 
            while((sentence = readerObj.readLine()) != null){
                sentence = sentence.replaceAll("[.,]", "");
                words = sentence.split(" ");
                // "a", "an", "the", "and", "but", "or", "of", "to", "in", "for",
                // "on", "by", "with", "at", "from", "as", "is", "am", "are", "was",
                // "were", "be", "been", "has", "have", "had", "this", "that", "it",
                // "they", "we", "he", "she", "you", "i", "not", "will", "would"
                for (String word : words) {
                    if(!("a".equals(word) || "an".equals(word) || "the".equals(word) || "and".equals(word)
                        || "but".equals(word) || "or".equals(word) || "of".equals(word) || "to".equals(word)
                            || "in".equals(word) || "for".equals(word) || "on".equals(word) || "by".equals(word)
                            || "with".equals(word) || "at".equals(word) || "from".equals(word) || "as".equals(word)
                            || "is".equals(word) || "am".equals(word) || "are".equals(word) || "was".equals(word)
                            || "were".equals(word) || "be".equals(word) || "been".equals(word) || "has".equals(word)
                            || "have".equals(word) || "had".equals(word) || "this".equals(word) || "that".equals(word)
                            || "it".equals(word) || "they".equals(word) || "we".equals(word) || "he".equals(word)
                            || "she".equals(word) || "you".equals(word) || "i".equals(word) || "not".equals(word)
                            || "will".equals(word) || "would".equals(word) )){

                        Integer wordCount = wordsCountMap.get(word);
                        if(wordCount == null){
                            wordsCountMap.put(word,1);
                        }
                        else{
                            wordsCountMap.put(word,wordCount+1);
                        }
                    }
                }

            }

//            for (String s : wordsCountMap.keySet()) {
//                System.out.println(s + " : " + wordsCountMap.get(s) );
//            }


            for (String s : wordsCountMap.keySet()) {
                List<String> strList = descCountwordsMap.get(wordsCountMap.get(s));
                if(strList == null){
                    strList = new ArrayList<>();
                    descCountwordsMap.put(wordsCountMap.get(s),strList);
                }
                strList.add(s);
            }

            List<Integer> descList = new ArrayList<>();
            descList.addAll(descCountwordsMap.keySet());
//            for (Integer i : descCountwordsMap.keySet()) {
//                System.out.println(i + " "+descCountwordsMap.get(i) );
//            }

            System.out.println("Words Frequency :");
            Collections.sort(descList);
            for (int i = descList.size()-1; i >=0 ; i--) {
                System.out.println(descList.get(i) + " : " + descCountwordsMap.get(descList.get(i)));
            }


        }catch(Exception e){
            e.printStackTrace();
        }

        return wordsCountMap;
    }
}
