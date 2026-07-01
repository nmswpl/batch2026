package in.co.nmsworks.training.week3.Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mp = new MapPractice();

        System.out.println("--- Fruits Map Data ---");
        System.out.println(mp.fruits());

        System.out.println("\n--- Fetching Price for Apple ---");
        mp.fruitNames();

        System.out.println("\n--- Looking up Bob's Score ---");
        mp.GameScore();

        System.out.println("\n--- Country and Capitals ---");
        mp.createCountryCaptitals();

        System.out.println("\n--- Copying Shop Items ---");
        mp.copyShopItems();

        System.out.println("\n--- Students and Scores ---");
        mp.studentScores();

        System.out.println("\n--- School Clubs and Members ---");
        mp.clubMembers();
    }

    private void createCountryCaptitals() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("India", "Delhi");
        countryCapitals.putIfAbsent("japan", "Tokyo");

        System.out.println("Map content: " + countryCapitals);
    }

    private Map<String, Integer> GameScore() {
        Map<String, Integer> gameScores = new HashMap<>();

        gameScores.put("ronaldo", 250);
        gameScores.put("messi", 150);
        gameScores.put("neimar", 50);

        System.out.println("Bob score is: " + gameScores.getOrDefault("Bob", 0));

        return gameScores;
    }

    private void fruitNames() {
        Map<String, Integer> fruitPrices = getFruits();
        System.out.println("Price of Apple is: " + fruitPrices.get("Apple"));
    }

    private Map<String, Integer> fruits() {
        return getFruits();
    }

    private static Map<String, Integer> getFruits() {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 250);
        fruitPrices.put("Orange", 150);
        fruitPrices.put("Mango", 50);
        fruitPrices.put("Pineapple", 175);
        fruitPrices.put("DragonFruit", 430);
        return fruitPrices;
    }

    private void copyShopItems() {
        Map<String, Integer> shopA = new HashMap<>();
        shopA.put("Shirt", 500);
        shopA.put("Pant", 800);

        Map<String, Integer> shopB = new HashMap<>();
        shopB.putAll(shopA);

        System.out.println("Shop A: " + shopA);
        System.out.println("Shop B: " + shopB);
    }

    private void studentScores() {
        Map<String, List<Integer>> studentScoresMap = new HashMap<>();

        studentScoresMap.put("Alice", new ArrayList<>());
        studentScoresMap.get("Alice").add(85);

        if (!studentScoresMap.containsKey("Angel")) {
            studentScoresMap.put("Angel", new ArrayList<>());
        }
        studentScoresMap.get("Angel").add(95);

        System.out.println("All Student Scores: " + studentScoresMap);
    }

    private void clubMembers() {
        Map<String, List<String>> schoolClubs = new HashMap<>();

        schoolClubs.putIfAbsent("Chess Club", new ArrayList<>());
        schoolClubs.get("Chess Club").add("Sam");

        System.out.println("Clubs: " + schoolClubs);
    }
}