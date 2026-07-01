package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class MapPracticeProblems {
    public static void main(String[] args) {
        MapPracticeProblems mp = new MapPracticeProblems();
        Map<String, Integer> fruitPrices = mp.getFruitPrices();
        mp.getParticularPriceOfFruit(fruitPrices,"Apple");
        Map<String, Integer> gameScore = mp.getGameScore();
        mp.getParticularPersonGameScore(gameScore,"Siva");
        Map<String, String> countryCapitals = mp.getCountryCapitals();
        mp.getParticularCountryCaptial(countryCapitals,"India");
        mp.copyEntriesFromOneToAnother(mp);
    }

    private void copyEntriesFromOneToAnother(MapPracticeProblems mp) {
        Map<String, Integer> shopA = mp.getFruitPrices();
        Map<String, Integer> shopB = new HashMap<>();
        shopB.putAll(shopA);
        System.out.println(shopB);
    }


    private Map<String, String> getCountryCapitals() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("India","Delhi");
        countryCapitals.put("A","B");
        countryCapitals.put("C","D");
        return countryCapitals;
    }

    private void getParticularCountryCaptial(Map<String, String> countryCapitals, String country) {
        if (countryCapitals.containsKey(country))
            System.out.println(country+" :: "+countryCapitals.get(country));
        else
            System.out.println(country+" is not already inside the map");
    }

    private void getParticularPersonGameScore(Map<String, Integer> gameScore, String name) {
        if (gameScore.containsKey(name))
            System.out.println(name+" :: "+gameScore.get(name));
        else
            System.out.println(name+" :: 0");
    }

    private Map<String, Integer> getGameScore() {
        Map<String, Integer> gameScore = new HashMap<>();
        gameScore.put("Siva",16);
        gameScore.put("Sp",15);
        gameScore.put("Abi",17);
        return gameScore;
    }

    private void getParticularPriceOfFruit(Map<String, Integer> fruitPrices, String fruit) {
        if (fruitPrices.containsKey(fruit))
            System.out.println("Fruit :: "+fruit+"\nPrice :: "+fruitPrices.get(fruit));
        else
            System.out.println(fruit+" is not present in the Shop");
    }

    private Map<String, Integer> getFruitPrices() {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple",150);
        fruits.put("Orange",130);
        fruits.put("Mango",100);
        fruits.put("Graphes",110);
        fruits.put("Banana",70);
        return fruits;

    }
}
