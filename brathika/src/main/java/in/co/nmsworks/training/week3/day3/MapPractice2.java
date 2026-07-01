package in.co.nmsworks.training.week3.day3;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        MapPractice2 mapPractice2 = new MapPractice2();
        Map<String, Integer> fruitsToPrice = new HashMap<>();
        fruitsToPrice.put("Apple",140);
        fruitsToPrice.put("Orange",90);
        fruitsToPrice.put("Pomogranate",250);
        fruitsToPrice.put("Gauva",90);
        fruitsToPrice.put("Mosambi",180);
        mapPractice2.findPrice(fruitsToPrice,"Apple");
        Integer score = mapPractice2.getgameScores();
        System.out.println("Score :"+score);
        mapPractice2.createCountryCapitals();
    }

    private void createCountryCapitals() {
        Map<String, String> countryCapital = new HashMap<>();

        if (!countryCapital.containsKey("India")) {
            countryCapital.put("India","Delhi");
        }
        System.out.println(countryCapital);
    }

    private Integer getgameScores() {
        Map<String, Integer> gameScore = new HashMap<>();
        gameScore.put("Bob",39);
        gameScore.put("Dhoni",100);
        gameScore.put("Rohit",80);
        gameScore.put("Virat",99);
        gameScore.put("Shreyas",50);
        gameScore.put("Hardhik Pandhiya",49);
        if (gameScore.containsKey("Bob")) {
            return gameScore.get("Bob");
        }
        return 0;
    }

    private void findPrice(Map<String, Integer> fruitsToPrice, String value) {
        for (Map.Entry<String, Integer> entry : fruitsToPrice.entrySet()) {
            if (entry.getKey().equals(value)) {
                System.out.println("Price of "+value+" is "+entry.getValue());
            }
        }
    }
}
