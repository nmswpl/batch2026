package in.co.nmsworks.week3.day3;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class FruitMap {

    public void fruitPrices() {

        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("Apple", 100);
        fruitPrice.put("Orange", 200);
        fruitPrice.put("Guava", 400);

        getPrice(fruitPrice);
    }

    public void getPrice(Map<String, Integer> map) {
        System.out.println(map.get("Apple"));
    }

    public void getScore() {
        Map<String, Integer> gameScore = new HashMap<>();
        gameScore.put("Alice", 88);
        gameScore.put("Miranda", 99);
        gameScore.put("Ariel", 100);

        System.out.println(gameScore.getOrDefault("Bob", 0));
    }

    public void getCountry() {
        Map<Integer, String> countryCapitals = new HashMap<>();

        countryCapitals.put(1, "delhi");
        countryCapitals.putIfAbsent(2, "India");

        for (Map.Entry<Integer, String> e : countryCapitals.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }

    public void getShopDetails() {
        Map<String, Integer> shopA = new HashMap<>();
        Map<String, Integer> shopB = new HashMap<>();

        shopA.put("Slipper", 200);
        shopA.put("Rope", 400);
        shopA.put("Tablet", 450);
        shopA.put("Knife", 100);

        shopB.putAll(shopA);

        for (Map.Entry<String, Integer> e : shopB.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getKey());
        }
    }

    public void studentMarkList() {
        Map<String, List<Integer>> studentMark = new HashMap<>();

        studentMark.put("Alice", new ArrayList<>());

        studentMark.get("Alice").add(85);

    }


}
