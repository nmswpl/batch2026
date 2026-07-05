package in.co.nmsworks.week3.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCounter {
    List<String> list = new ArrayList<>();
    Map<String, Integer> freq = new HashMap<>();


    public void readFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/nms-training/Downloads/Word_Frequency.txt"))) {


            String line = "";
            List<String> wordsList = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                String[] str = line.toLowerCase().split("\\s+");

                for (String s : str) {
                    s = s.replaceAll("[^a-z]", "").trim();
                    if (s.isEmpty()) {
                        continue;
                    }
                    if (list.contains(s)) {
                        continue;
                    }

                    freq.put(s, freq.getOrDefault(s, 0) + 1);
                }


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printCount() {
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            list2.add(entry);
        }
        list2.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        System.out.println("===COUNT OF WORDS===");
        for (Map.Entry<String, Integer> entry : list2) {
            System.out.println(entry);
        }
    }


    public void addExcludedWords() {


        list.add("a");
        list.add("an");
        list.add("the");
        list.add("and");
        list.add("but");
        list.add("or");
        list.add("of");
        list.add("to");
        list.add("in");
        list.add("for");
        list.add("on");
        list.add("by");
        list.add("with");
        list.add("at");
        list.add("from");
        list.add("as");
        list.add("is");
        list.add("am");
        list.add("are");
        list.add("was");
        list.add("were");
        list.add("be");
        list.add("been");
        list.add("has");
        list.add("have");
        list.add("had");
        list.add("this");
        list.add("that");
        list.add("it");
        list.add("they");
        list.add("we");
        list.add("he");
        list.add("she");
        list.add("you");
        list.add("i");
        list.add("not");
        list.add("will");
        list.add("would");

    }
}
