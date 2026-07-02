package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPracticeQuestions {
    public static void main(String[] args) {
        MapPracticeQuestions mapPracticeQuestions= new MapPracticeQuestions();
        mapPracticeQuestions.mapPratice();
    }

    private void mapPratice() {
        Map<String,Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple",10);
        fruitPrices.put("Banana",20);
        fruitPrices.put("Mango",50);
        System.out.println("Apple cost: " + fruitPrices.get("Apple"));

        Map<String,Integer> gameScores = new HashMap<>();
        gameScores.put("bin",1);
        gameScores.put("alen",3);
        gameScores.put("lulu",4);
        System.out.println("Bob: "+ gameScores.getOrDefault("Bob",0));

        Map<String,String> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("India","Delhi");
        countryCapitals.putIfAbsent("China","Tokyo");

        for (String s : countryCapitals.keySet()) {
            System.out.println(s+"  " + countryCapitals.get(s));
        }

        Map<String,Integer> shopA = new HashMap<>();
        shopA.put("Salt",10);
        shopA.put("Sugar",20);
        shopA.put("Chilli",5);
        System.out.println("Shop A");
        for (String s : shopA.keySet()) {
            System.out.println(s + "---->" + shopA.get(s));
        }

        Map<String,Integer> shopB = new HashMap<>(shopA);
        System.out.println("Shop B");
        for (String s : shopB.keySet()) {
            System.out.println(s + "---->" + shopA.get(s));
        }

        Map<String, List<Integer>> students = new HashMap<>();
        students.put("Alice", new ArrayList<>());
        students.get("Alice").add(85);

        students.putIfAbsent("Angel",new ArrayList<>());
        students.get("Angel").add(95);
//        students.putIfAbsent("Angel",new ArrayList<>());
//        students.get("Angel").add(99);

        for (String s : students.keySet()) {
            System.out.println(s + "---->" + students.get(s));
        }

        Map<String, List<String>> clubMembers = new HashMap<>();
        clubMembers.putIfAbsent("Chess Club", new ArrayList<>());
        clubMembers.get("Chess Club").add("Sam");
        for (String s : clubMembers.keySet()) {
            System.out.println(s + " --->" + clubMembers.get(s));
        }

    }
}
