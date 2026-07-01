package in.co.nmsworks.training.week3.day3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mapPractice = new MapPractice();

        Map<String,Integer> fruitPrice = mapPractice.getFruitPrice();
        mapPractice.printFruitNames(fruitPrice);

        Map<String,Integer> gameScore = mapPractice.getGameScore();
        mapPractice.getScoreByName("Bob", gameScore);

        Map<String,String> countryCapitals = mapPractice.getCountryCapital();
        String replace = countryCapitals.replace("India", "Delhi");

        Map<String,Integer> shopA = new HashMap<>();
        shopA.put("soap" , 100);
        shopA.put("ice cream" , 50);
        shopA.put("lays" , 20);

        Map<String, Integer> shopB = new HashMap<>(shopA);
        System.out.println("shop A : " + shopA);
        System.out.println("shop B : " + shopB);

        Map<String, List<Integer>> studentScores = new HashMap<>();
        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);
        System.out.println(studentScores);

    }

    private Map<String, String> getCountryCapital() {
        Map<String, String> map = new HashMap<>();

        map.put("India", null);
        map.put("USA", "New york");
        map.put("Japan", "Tokyo");

        return map;
    }

    private void getScoreByName(String name, Map<String, Integer> gameScore) {

        if(gameScore.containsKey(name)){
            System.out.println(" name : " + name + " score : " + gameScore.get(name));
            return;
        }
        System.out.println(" name : " + name + " score : " + gameScore.getOrDefault(name,0));
    }

    private Map<String, Integer> getGameScore() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Arun", 12);
        map.put("Charan", 5);
        map.put("Dhoni", 8);

        return map;
    }

    private void printFruitNames(Map<String, Integer> fruitPrice) {
        System.out.println("Fruit Names ");

        for (String fruit : fruitPrice.keySet()){
            System.out.println(fruit);
        }
    }

    private Map<String, Integer> getFruitPrice() {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 150);
        map.put("mango", 200);
        map.put("orange", 100);
        map.put("pine apple", 250);
        map.put("grape", 200);

        return map;
    }
}
