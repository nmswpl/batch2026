package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        fruitPrices();
        gameMap();
        countryMap();
        copyMap();
        studentMap();
        putIfPresentMap();
        schoolClubMap();
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

    private static void copyMap() {
        Map<String,Integer> shopA = new HashMap<>();
        shopA.put("ABC Shop",23455);
        shopA.put("RK Shop", 4567);
        Map<String,Integer> shopB = new HashMap<>();
        shopB.putAll(shopA);
        System.out.println("Listing the list of ShopB : ");
        for (Map.Entry<String, Integer> entry : shopB.entrySet()) {
            System.out.println("Shop name : "+entry.getKey()+" Shop ID : "+entry.getValue());

        }
    }

    private static void countryMap() {
        Map<String,Integer> countryCapitals = new HashMap<>();
        countryCapitals.putIfAbsent("India",1);
        countryCapitals.putIfAbsent("India",13);
        countryCapitals.putIfAbsent("Africa",2);
        for(Map.Entry<String,Integer> entry : countryCapitals.entrySet()){
            System.out.println("Countries : " +entry.getKey()+ "Values :"+entry.getValue());
        }



    }

    private static void gameMap() {
        Map<String,Integer> gameScores = new HashMap<>();
        gameScores.put("Dhoni",7);
        gameScores.put("Bob",15);
        System.out.println("Bob's Score : "+gameScores.getOrDefault("Bob",0));

    }

    private static void fruitPrices() {
        Map<String,Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple",200);
        fruitPrices.put("Orange",350);
        fruitPrices.put("Banana",100);
        for(Map.Entry<String,Integer> entry : fruitPrices.entrySet()){
            if(entry.getKey().equals("Apple")){
                System.out.println("The Value of Apple is : "+entry.getValue());
            }
        }
    }


}
