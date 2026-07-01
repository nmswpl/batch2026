package in.co.nmsworks.training.week3.day3;

import java.util.*;

public class MapPractise {

    public static void main(String[] args) {
        MapPractise mapPractise = new MapPractise();
        Map<String,Float> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 200f);
        fruitPrices.put("Banana", 100f);
        fruitPrices.put("Custard Apple", 120f);
        fruitPrices.put("Dragon fruit", 400f);
        fruitPrices.put("Fig", 300f);
        mapPractise.printPrice(fruitPrices,"Apple");

        Map<String,Integer> gameScores = new HashMap<>();
//        gameScores.put("Bob",12);
        gameScores.put("Arun",50);
        gameScores.put("Alex",25);
        gameScores.put("Felix",10);
        gameScores.put("John",30);
        Integer score = printScore(gameScores,"Bob");
        System.out.println("Score = "+score);

        Map<String,String> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("India","Delhi");
        countryCapitals.putIfAbsent("India","Delhi");
        System.out.println("countryCapitals = "+countryCapitals);

        Map<String,Float> fruitShop = new HashMap<>();
        fruitShop.putAll(fruitPrices);
        System.out.println("Fruit Shop copied = > "+fruitShop);

        Map<String, List<Integer>> studentMap = new HashMap<>();
        studentMap.put("Hema",new ArrayList<>(Arrays.asList(98,99)));
        studentMap.put("Alice",new ArrayList<>(Arrays.asList(67)));
        System.out.println("Student Details : \n");
        for (Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
            System.out.println(entry);
        }
        studentMap.get("Alice").add(85);
        System.out.println("Student Details : \n");
        for (Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
            System.out.println(entry);
        }

        if( studentMap.containsKey("Angel") )
        {
            studentMap.get("Angel").add(95);
        }
        else
        {
            studentMap.put("Angel",new ArrayList<>(Arrays.asList(95)));
        }
        System.out.println("Student Details : \n");
        for (Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
            System.out.println(entry);
        }

        Map<String,List<String>> studentClubMap = new HashMap<>();
        studentClubMap.put("Cultural Club",new ArrayList<>(Arrays.asList("Hema","Thanu")));

        if(!studentClubMap.containsKey("Chess Club"))
        {
            studentClubMap.put("Chess Club", new ArrayList<>());
            studentClubMap.get("Chess Club").add("Sam");
        }

        System.out.println("\nStudents Club Map : ");
        for (Map.Entry<String, List<String>> entry : studentClubMap.entrySet()) {
            System.out.println(entry);
        }

    }

    private static Integer printScore(Map<String, Integer> map, String name) {
        if( map.containsKey(name))
        {
            return map.get(name);

        }
        return 0;


    }

    private static void printPrice(Map<String,Float> map, String fruit) {
        System.out.println("Price of "+fruit+" = "+map.get(fruit));
    }
}
