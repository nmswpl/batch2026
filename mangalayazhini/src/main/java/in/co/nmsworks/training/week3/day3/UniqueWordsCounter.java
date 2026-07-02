package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        UniqueWordsCounter counterObj = new UniqueWordsCounter();

        counterObj.countUniqueWords("/home/nms-training/Downloads/newFile.txt");

    }

    private void countUniqueWords(String path) {
        String fileContent = "";
        String sentence;
        BufferedReader readerObj = null;
        Set<String> longerWords = new HashSet<>();
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> uniqueWordsMap = new HashMap<>();

        try {
            readerObj = new BufferedReader(new FileReader(path));

            while((sentence = readerObj.readLine()) != null){
                System.out.println("sentence : " + sentence);
                fileContent += sentence + " ";
            }

            String[] sentenceList = fileContent.split(" ");
            for (String word : sentenceList) {
                String correctedWord = word.replaceAll("[^a-zA-Z]","");
                if(!correctedWord.isEmpty()){
                    if(correctedWord.length() > 5){
//                    System.out.println("Larger word : " + word);
                        longerWords.add(correctedWord);
                    }



                    if(uniqueWordsMap.containsKey(correctedWord)){
                        Integer value = uniqueWordsMap.get(correctedWord);
                        uniqueWordsMap.put(correctedWord, value+1);
                    }
                    else{
                        uniqueWordsMap.put(correctedWord, 1);
                    }
                }

//              System.out.println("Unique word : " + word);

            }


            System.out.println("Long Words : ");
            for (String longerWord : longerWords) {
                System.out.print(longerWord + " , ");
            }



//            System.out.println("\nMap \n");
            for (String str : uniqueWordsMap.keySet()){
//                System.out.println(str +" :  " + uniqueWordsMap.get(str));
                if(uniqueWordsMap.get(str) == 1){
                    uniqueWords.add(str);
                }
            }

            System.out.println("\n\nUnique Words : ");
            for (String uniqueWord : uniqueWords) {
                System.out.print(uniqueWord + " , ");
            }


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

        }
    }


}
