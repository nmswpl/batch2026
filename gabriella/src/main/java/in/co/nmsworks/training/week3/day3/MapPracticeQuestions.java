package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPracticeQuestions {
    public static void main(String[] args) {
        MapPracticeQuestions mapPracticeQuestions = new MapPracticeQuestions();
        Map<String, Float> fruits = new HashMap<>();
        fruits.put("Mango", 200f);
        fruits.put("Apple", 320f);
        fruits.put("Pineapple", 150f);
        fruits.put("Peach", 250f);
        fruits.put("Litchi", 170f);

        System.out.println("Price of apple: " + fruits.get("Apple"));

        Map<String, Integer> gameScores = new HashMap<>();
        gameScores.put("Alice", 5);
        gameScores.put("B", 9);
        gameScores.put("Eve", 12);

        String name = "Bob";
        System.out.println("Game score of " + name + ": ");
        if (gameScores.get(name) == null) System.out.println("0");
        else System.out.println(gameScores.get(name));

        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington DC");
        countryCapitals.put("Egypt", "Cairo");
        countryCapitals.putIfAbsent("India", "Delhi");
        countryCapitals.putIfAbsent("India", "New Delhi");
        System.out.println(countryCapitals);

        Map<String, Float> shopA = new HashMap<>();
        shopA.put("A", 10f);
        shopA.put("B", 15f);

        Map<String, Float> shopB = new HashMap<>();
        shopB.put("C", 20f);
        shopB.put("D", 25f);

        shopA.putAll(shopB);
        System.out.println(shopA);

        Map<String, List<Float>> testScores = new HashMap<>();
        List<Float> aliceScores = new ArrayList<>();
        aliceScores.add(90f);
        aliceScores.add(82f);
        testScores.put("Alice", aliceScores);
        System.out.println(testScores);
        aliceScores.add(85f);
        testScores.put("Alice", aliceScores);
        System.out.println(testScores);
        List<Float> angelScores = new ArrayList<>();
        angelScores.add(92f);
        angelScores.add(79f);
        testScores.putIfAbsent("Angel", angelScores);
        System.out.println(testScores);

        Map<String, List<String>> schoolClubs = new HashMap<>();
        schoolClubs.putIfAbsent("Chess Club", new ArrayList<>());
        schoolClubs.get("Chess Club").add("Sam");
        System.out.println(schoolClubs);

    }
}
