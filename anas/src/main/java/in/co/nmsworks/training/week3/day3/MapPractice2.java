package in.co.nmsworks.training.week3.day3;

import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        createFruitPricesMap();
        printApplePrice();
        getBobScoreOrDefault();
        addCountryIfAbsent();
        copyShopAToShopB();
        addStudentAndScore();
        addAngelScoreIfAbsent();
        addMemberToChessClub();
    }


    public static void createFruitPricesMap() {

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 120);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Orange", 80);

        System.out.println("Question 1");
        System.out.println(fruitPrices);
        System.out.println();
    }


    public static void printApplePrice() {

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 120);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Orange", 80);

        System.out.println("Question 2");
        System.out.println("Price of Apple: " + fruitPrices.get("Apple"));
        System.out.println();
    }


    public static void getBobScoreOrDefault() {

        Map<String, Integer> gameScores = new HashMap<>();

        gameScores.put("Alice", 95);
        gameScores.put("Charlie", 88);

        int score = gameScores.getOrDefault("Bob", 0);

        System.out.println("Question 3");
        System.out.println("Bob's Score: " + score);
        System.out.println();
    }


    public static void addCountryIfAbsent() {

        Map<String, String> countryCapitals = new HashMap<>();

        countryCapitals.putIfAbsent("India", "Delhi");
        countryCapitals.putIfAbsent("India", "New Delhi");

        System.out.println("Question 4");
        System.out.println(countryCapitals);
        System.out.println();
    }


    public static void copyShopAToShopB() {

        Map<String, Integer> shopA = new HashMap<>();
        shopA.put("Milk", 60);
        shopA.put("Bread", 45);
        shopA.put("Eggs", 70);

        Map<String, Integer> shopB = new HashMap<>();

        shopB.putAll(shopA);

        System.out.println("Question 5");
        System.out.println("Shop A: " + shopA);
        System.out.println("Shop B: " + shopB);
        System.out.println();
    }


    public static void addStudentAndScore() {

        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);

        System.out.println("Question 6");
        System.out.println(studentScores);
        System.out.println();
    }
    public static void addAngelScoreIfAbsent() {

        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);

        studentScores.computeIfAbsent("Angel", k -> new ArrayList<>()).add(95);

        System.out.println("Question 7");
        System.out.println(studentScores);
        System.out.println();
    }


    public static void addMemberToChessClub() {

        Map<String, List<String>> schoolClubs = new HashMap<>();

        schoolClubs.putIfAbsent("Chess Club", new ArrayList<>());
        schoolClubs.get("Chess Club").add("Sam");

        System.out.println("Question 8");
        System.out.println(schoolClubs);
        System.out.println();
    }
}