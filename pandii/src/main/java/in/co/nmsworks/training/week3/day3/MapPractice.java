package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mapPractice=new MapPractice();

        Map<String,Integer>fruitmap=mapPractice.createFruitMap();
        System.out.println(fruitmap);
        mapPractice.priceOffruit(fruitmap,"Apple");

        Map<String,Integer>gameMap=mapPractice.createGameScore();
        System.out.println(gameMap.getOrDefault("Bob",0));

        Map<String ,String>capitals= mapPractice.countryCapitals();
        capitals.putIfAbsent("India","Delhi");
        System.out.println(capitals);

        mapPractice.joinMaps();

        mapPractice.studentScores();

        mapPractice.schoolClubsAdd();

    }

    private void schoolClubsAdd() {
        Map<String,List<String >> schoolClubs = new HashMap<>();
        schoolClubs.put("CarromClub",new ArrayList<>());
        schoolClubs.get("CarromClub").add("kumar");
        schoolClubs.putIfAbsent("Chess",new ArrayList<>());
        schoolClubs.get("Chess").add("Sam");

        System.out.println(schoolClubs);
    }

    private void studentScores() {
        Map<String, List<Integer>> testScores=new HashMap<>();
        testScores.put("pandi",new ArrayList<>());
        testScores.get("pandi").add(85);
        testScores.get("pandi").add(80);

        System.out.println(testScores);
    }

    private void joinMaps() {
        Map<String,Integer> shopA=new HashMap<>();
        Map<String,Integer> shopB=new HashMap<>();

        shopA.put("pen",20);
        shopB.put("pencil",10);
        shopA.putAll(shopB);
        System.out.println(shopA);
    }

    private Map<String,String> countryCapitals() {
        Map<String,String> capitals=new HashMap<>();
        capitals.put("America","Washington");
        capitals.put("Australia","Sydney");
        capitals.put("Pakistan","Lahore");
        capitals.put("Bangladesh","Dhaka");

        return capitals;
    }

    private Map<String,Integer> createGameScore() {
        Map<String,Integer> gameMap=new HashMap<>();
        gameMap.put("pandi",100);
        gameMap.put("anas",200);
        return gameMap;
    }

    private void priceOffruit(Map<String, Integer> fruitmap, String fruit) {
        Integer price=fruitmap.get(fruit);
        System.out.println("Price of "+fruit+" "+price);
    }


    private Map<String, Integer> createFruitMap() {
        Map<String, Integer> fruitPrices=new HashMap<>();
        fruitPrices.put("Apple",150);
        fruitPrices.put("Orange",100);
        fruitPrices.put("Mango",80);
        fruitPrices.put("Pomegranate",120);
        fruitPrices.put("Kiwi",250);

        return fruitPrices;
    }
}
