package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

///**
///

/// Create a map called gameScores. Look up the score of "Bob", but return 0 if "Bob" is not found in the map.
/// Question 4
/// Create a map called countryCapitals. Add "India" and "Delhi" to it, but only if "India" is not already inside the map.
/// Question 5
/// Create two maps called shopA and shopB. Copy all the items and prices from shopA into shopB in a single step.
///
///
///
///
///
/// ///
public class MapPractise {
    public static void main(String[] args) {

        MapPractise practiseObj = new MapPractise();

        Map<String, Double> fruitsMap = practiseObj.createFruitsMap();
        practiseObj.printFruitsMap(fruitsMap);

        Map<String, Integer> gameMap = practiseObj.createGameMap();
        practiseObj.getScoreCard(gameMap, "Bob");
        practiseObj.getScoreCard(gameMap, "Cathy");

        Map<String, Integer> shopA = new HashMap<>();
        Map<String, Integer> shopB = new HashMap<>();

        shopA.put("Rice", 300);
        shopA.put("Wheat",140);

        shopB.put("Mango", 100);
        shopB.put("Tomato",75);
        shopB.put("Onion", 80);
        shopB.put("Brinjal",60);
        practiseObj.combineTwoMaps(shopA, shopB);
        schoolClubMap();
        putIfPresentMap();
        studentMap();
    }

    private void combineTwoMaps(Map<String, Integer> shopA, Map<String, Integer> shopB) {
        shopA.putAll(shopB);
        System.out.println("Shop A");
        for(String key : shopA.keySet()){
            System.out.println(key +" : " + shopA.get(key));
        }

    }

    private Integer getScoreCard(Map<String, Integer> gameMap, String key) {
        Integer score = gameMap.get(key);
        if(score == null){
            score = 0 ;
        }
        System.out.println("The score of " + key + " : " + score);
        return score;
    }

    private Map<String, Integer> createGameMap() {

        Map<String, Integer> gameMap = new HashMap<>();
        gameMap.put("Charlie" , 50);
        gameMap.put("John", 70);
        gameMap.put("Cathy", 20);

        gameMap.putIfAbsent("Cathy",55);

        System.out.println("bob : "+gameMap.get("bob"));
        return gameMap;
    }

    private void printFruitsMap(Map<String, Double> fruitsMap) {
       for (String fruitName : fruitsMap.keySet()){
           System.out.println(fruitName + " : " +fruitsMap.get(fruitName));
       }
    }

    private Map<String, Double> createFruitsMap() {
        Map<String, Double> fruitsMap = new HashMap<>();
        fruitsMap.put("Apple" , 60.5);
        fruitsMap.put("Banana", 25.5);
        fruitsMap.put("Mango", 120.0);
        return fruitsMap;
    }


    private static void schoolClubMap() {
        Map<String, List<String>> schoolClub = new HashMap<>();
        if(!schoolClub.containsKey("ChessClub")){
            schoolClub.put("ChessClub",new ArrayList<>());
        }
        List<String> members = schoolClub.get("ChessClub");
        System.out.println("Printing Club members before adding :");
        for (Map.Entry<String, List<String>> entry : schoolClub.entrySet()) {
            System.out.println("Name of the Club : "+entry.getKey()+"List of Member : "+entry.getValue());
        }
        members.add("Sam");

        System.out.println("Printing Club members after adding :");
        for (Map.Entry<String, List<String>> entry : schoolClub.entrySet()) {
            System.out.println("Name of the Club : "+entry.getKey()+"List of Member : "+entry.getValue());
        }
    }

    private static void putIfPresentMap() {
        Map<String, List<Integer>> Q1 = new HashMap<>();
        List<Integer> marks = Q1.getOrDefault("Alice",new ArrayList<>());
        marks.add(95);
        Q1.put("Alice",marks);
        System.out.println("Printing Student Marks :");
        for (Map.Entry<String, List<Integer>> entry : Q1.entrySet()) {
            System.out.println("Name of the Student : "+entry.getKey()+"List of scores : "+entry.getValue());
        }
    }

    private static void studentMap() {
        Map<String, List<Integer>> studentOne = new HashMap<>();
        studentOne.putIfAbsent("Alice",new ArrayList<>());
        studentOne.get("Alice").add(25);
        studentOne.get("Alice").add(75);
        for (Map.Entry<String, List<Integer>> stringListEntry : studentOne.entrySet()) {
            System.out.println("Name of the Student : "+stringListEntry.getKey()+"List of scores : "+stringListEntry.getValue());
        }
    }

}
