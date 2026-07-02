package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mapPractice = new MapPractice();
        mapPractice.createFruitMap();
        mapPractice.getPriceOfFruit("Apple");
        mapPractice.gameScoreMap();
        mapPractice.countryCapitalsMap();
        mapPractice.copyMap();
        mapPractice.studentMarksMap();
        mapPractice.schoolClubMap();

    }

    private void schoolClubMap() {
        Map<String, List<String>> schoolClub = new HashMap<>();
        List<String> clubs = new ArrayList<>();
        schoolClub.putIfAbsent("Chess Club", clubs);
        clubs.add("Sam");
        for (Map.Entry<String, List<String>> clubEntry : schoolClub.entrySet()) {
            System.out.println("Club Name : " + clubEntry.getKey() + " " + "Members : " + clubEntry.getValue());

        }
    }

    private void studentMarksMap() {
        Map<String, List<Integer>> studentMarks = new HashMap<>();
        List<Integer> marks = new ArrayList<>();
        studentMarks.put("Alice", marks);
        marks.add(85);
        for (Map.Entry<String, List<Integer>> markEntry : studentMarks.entrySet()) {
            System.out.println("Name : " + markEntry.getKey() + " " + "Marks : " + markEntry.getValue());

        }
        System.out.println("Is Alice Present : " + studentMarks.containsKey("Alice"));
        if (! studentMarks.containsKey("Alice")) {
            studentMarks.put("Alice", marks = new ArrayList<>());
            marks.add(95);
        } else {
            marks.add(95);
        }
        for (Map.Entry<String, List<Integer>> markEntry : studentMarks.entrySet()) {
            System.out.println("Name : " + markEntry.getKey() + " " + "Marks : " + markEntry.getValue());

        }

    }

    private void copyMap() {
        Map<String, Float> shopA = new HashMap<>();
        shopA.put("Egg", 7.50F);
        shopA.put("Milk", 10.0F);
        Map<String, Float> shopB = new HashMap<>();
        shopB.putAll(shopA);
        System.out.println("ShopA Entries ");
        for (Map.Entry<String, Float> stringFloatEntry : shopA.entrySet()) {
            System.out.println("Items : " + stringFloatEntry.getKey() + " " + " Price : " + stringFloatEntry.getValue());
        }
        System.out.println("Shop B Entries :");
        for (Map.Entry<String, Float> stringFloatEntry : shopB.entrySet()) {
            System.out.println("Items : " + stringFloatEntry.getKey() + " " + " Price : " + stringFloatEntry.getValue());
        }
    }

    private void countryCapitalsMap() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("India", "Delhi");

    }

    private void gameScoreMap() {
        Map<String, Integer> gameScore = new HashMap<>();
        gameScore.put("Bob", 85);
        gameScore.put("Alex", 99);
        gameScore.put("Flemming", 87);
        if (gameScore.containsKey("Bob")) {
            System.out.println("Score of Bob : " + gameScore.get("Bob"));
        }
        else {
            System.out.println("Score of Bob : " + 0);
        }

    }

    private void getPriceOfFruit(String key) {
        Map<String, Float> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 250.0F);
        fruitPrices.put("Orange", 300.0F);
        fruitPrices.put("Banana", 85.97F);
        System.out.println("Price of " + key + " is : " + fruitPrices.get(key));
    }

    private void createFruitMap() {
        Map<String, Float> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 250.0F);
        fruitPrices.put("Orange", 300.0F);
        fruitPrices.put("Banana", 85.97F);
        for (Map.Entry<String, Float> fruitToPrice : fruitPrices.entrySet()) {
            System.out.println("Fruit : " + fruitToPrice.getKey() + " " + " Price : " + fruitToPrice.getValue());
        }
    }
}
