package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        Map<String,Integer> fruits = new HashMap<>();
       fruits = fruitsDetails();
       printFruit(fruits);
       gameScoreBob();
       addCountry();
       copyMapItems();
       markList();
    }

    private static void markList() {

        Map<String, List<Integer>> markList = new HashMap<>();
//        List<Integer> marks
//        markList.put("Angel",[100]);
//        markList.put("Alice",)

    }

    private static void copyMapItems() {

        Map<String, Integer> shopa = new HashMap<>();
        Map<String, Integer> shopb = new HashMap<>();

        shopa.put("Rice",100);
        shopa.put("Water",20);
        shopb.put("Milk",35);
        shopb.put("Juice",60);
        shopa.putAll(shopb);

        for(Map.Entry<String, Integer> entry: shopa.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void addCountry() {

        Map<String, String> capital = new HashMap<>();
        String name = capital.get("India");
        if(name == null)
        {
            capital.put("India","Delhi");
        }
        System.out.println(capital.get("India"));
    }

    private static void gameScoreBob() {

        Map<String,Integer> gameScores = new HashMap<>();
        gameScores.put("Abi",150);
        gameScores.put("Shek", 1000);
        gameScores.put("Raj", 0);
        System.out.println(gameScores.getOrDefault("Bob", 0));
    }

    private static void printFruit(Map<String,Integer> fruits) {

        System.out.println("Pricce of apple: "+fruits.get("Apple"));
    }

    private static Map<String,Integer> fruitsDetails() {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 150);
        fruits.put("Mango", 100);
        fruits.put("Grapes", 120);
        return fruits;
    }
}
