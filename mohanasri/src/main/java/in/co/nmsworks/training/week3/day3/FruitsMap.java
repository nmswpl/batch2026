package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class FruitsMap {
    public static void main(String[] args) {

    Map<String, Integer> fruitsPrice = new HashMap<>();
    fruitsPrice.put("Apple", 120);
    fruitsPrice.put("Mango", 100);
    fruitsPrice.put("Orange", 80);

    System.out.println("Price of apple : "+ fruitsPrice.get("Apple"));

    Map<String , Integer> gameScores = new HashMap<>();
    System.out.println("Bob score : "+ gameScores.getOrDefault("Bob", 0));

    Map<String , String> countryCapitals = new HashMap<>();
    System.out.println("Do india exists ? "+ countryCapitals.get("India"));
    System.out.println("Adding delhi to india : "+ countryCapitals.putIfAbsent("India", "Delhi"));
    System.out.println("Do india exists ? "+ countryCapitals.get("India"));

    Map<String, Integer> shopA = new HashMap<>();
    shopA.put("Pencil", 10);
    shopA.put("Pen", 45);
    shopA.put("Eraser", 5);
    Map<String, Integer> shopB = new HashMap<>();
    shopB.putAll(shopA);
    System.out.println("ShopB elements : " + shopB);

    }
}
