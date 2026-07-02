package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        fruitsMap();
        gamesMap();
        countryCapitals();
        copyOfMaps();
        mapWithList();
    }

    private static void mapWithList() {

        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);

        if (studentScores.containsKey("Angel")) {
            studentScores.get("Angel").add(95);
        } else {
            List<Integer> angelScores = new ArrayList<>();
            angelScores.add(95);
            studentScores.put("Angel", angelScores);
        }

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Map<String, List<String>> clubs = new HashMap<>();

        clubs.putIfAbsent("Chess Club", new ArrayList<>());
        clubs.get("Chess Club").add("Sam");

        for (Map.Entry<String, List<String>> entry : clubs.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void copyOfMaps() {
        Map<String, Integer> shopA = new HashMap<>();
        Map<String, Integer> shopB = new HashMap<>();

        shopA.put("table", 200);
        shopB.put("lap", 300);

        shopA.putAll(shopB);

        System.out.println(shopA);
    }

    private static void countryCapitals() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("india", "delhi");

        System.out.println(countryCapitals);
    }

    private static void gamesMap() {
        Map<String, Integer> games = new HashMap<>();

        games.put("bob", 100);
        games.put("pupg", 120);
        games.put("free Fire", 150);

        Integer value;
        if ((value = games.get("bob")) != 0) {
            System.out.println("Bob Score " + value);
        } else {
            System.out.println("Bob Score " + 0);
        }
    }

    private static void fruitsMap() {
        Map<String, Integer> fruits = new HashMap<>();

        fruits.put("apple", 200);
        fruits.put("banana", 200);
        fruits.put("mango", 200);

        System.out.println(fruits);
        System.out.println("Price of apple : " + fruits.get("apple"));
    }
}