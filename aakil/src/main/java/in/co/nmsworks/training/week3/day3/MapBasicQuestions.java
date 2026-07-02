package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class MapBasicQuestions {
    public static void main(String[] args) {
        Map<String, Double> fruitPriceMap =  fruitPrices();
        printFruitPrice(fruitPriceMap, "Apple");

        Map<String, Integer> gameScores = new HashMap<>();
        gameScores.put("Bobby", 21);
        gameScores.put("Bobboi Boy", 23);
        gameScores.put("Bro Boi", 7);
        gameScores.put("Bob", 25);

        String gamer = "Bob";

        lookupGameScore(gameScores, gamer);

        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Russia", "Moscow");
        countryCapitals.put("Italy", "Rome");
        countryCapitals.put("USA", "WashingtonDC");

        String country = "India", capital = "Delhi";
        addCountryCaptial(countryCapitals, country, capital);
        addCountryCaptial(countryCapitals, country, capital);

        Map<String, Integer> shopA = new HashMap<>();
        shopA.put("IceCream", 60);
        shopA.put("Apple", 10);
        shopA.put("Mango", 15);
        shopA.put("Juice", 25);
        Map<String, Integer> shopB = new HashMap<>();
        shopB.put("Falooda", 120);


        addAllToShopB(shopB, shopA);
    }

    private static void addAllToShopB(Map<String, Integer> shopB, Map<String, Integer> shopA) {
        shopB.putAll(shopA);
    }

    private static void addCountryCaptial(Map<String, String> countryCapitals, String country, String capital) {
        countryCapitals.putIfAbsent(country, capital);
    }

    private static void lookupGameScore(Map<String, Integer> gameScores, String gamer) {
        System.out.println(gamer + " scored " + gameScores.getOrDefault(gamer, 0) + " points.");
    }

    private static void printFruitPrice(Map<String, Double> fruitPriceMap,String fruit) {
        System.out.println(fruit + " is $" + fruitPriceMap.get(fruit));
        System.out.println("-----------");
    }

    private static Map<String, Double> fruitPrices() {
        Map<String, Double> fruitPriceMap = new HashMap<>();
        fruitPriceMap.put("Apple", 10.20);
        fruitPriceMap.put("Mango", 16.00);
        fruitPriceMap.put("JAckFruit", 50.00);

        fruitPriceMap.forEach((fruit, price) -> System.out.println(fruit + " > $" + price));
        System.out.println("-----------");
        return fruitPriceMap;
    }
}
