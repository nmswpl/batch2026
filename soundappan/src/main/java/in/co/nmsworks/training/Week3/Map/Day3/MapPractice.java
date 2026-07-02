package in.co.nmsworks.training.Week3.Map.Day3;

import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void fruitAdd(Map<String,Double>fruitPrice){
        fruitPrice.put("Apple",90.0);
        fruitPrice.put("Orange",20.0);
        fruitPrice.put("Mango",50.0);
        fruitPrice.put("Banana",7.0);
        fruitPrice.put("kiwi",35.0);
        System.out.println(fruitPrice);
    }
    public static void priceOfGiveFruit(Map<String,Double>fruitPrice){
        System.out.println(fruitPrice.get("Apple"));
    }
    public static void scoreOfPerson(Map<String,Integer>gameScores,String key){
        if(!gameScores.containsKey(key)) {
            System.out.println("0");
        }
        else{
            System.out.println(gameScores.get(key));
        }
    }
    private static void countryCapital(Map<String,String> country) {List<String> val=new ArrayList<>();
        country.put("India",null);
    }
    public static void copyMapToMap( Map<String,Integer>gameScores, Map<String,Integer>game){
        gameScores.putAll(game);
        System.out.println(gameScores);
    }
    public static void multiMap(Map<String,List<Integer>>student){
        student.put("Alice",new ArrayList<>());
        student.get("Alice").add(85);
        System.out.println(student);
    }
    public static void putIfMap(Map<String, List<Integer>> studentScores){
        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);

        studentScores.computeIfAbsent("Angel", k -> new ArrayList<>()).add(95);

        System.out.println(studentScores);
    }
    public static void clubsMap(Map<String, List<String>> clubs ){
        clubs.putIfAbsent("Chess Club", new ArrayList<>());

        clubs.get("Chess Club").add("Sam");

        System.out.println(clubs);
    }
    public static void main(String[] args) {
        Map<String,Double>fruitPrice=new HashMap<>();
        Map<String,Integer>gameScores=new HashMap<>();
        Map<String, String>country=new HashMap<>();
        Map<String,Integer>game=new HashMap<>();
        Map<String,List<Integer>>student=new HashMap<>();
        Map<String, List<Integer>> studentScores = new HashMap<>();
        Map<String, List<String>> clubs = new HashMap<>();

        fruitAdd(fruitPrice);
        priceOfGiveFruit(fruitPrice);
        scoreOfPerson(gameScores,"Bob");
        countryCapital(country);
        copyMapToMap(gameScores,game);
        multiMap(student);
        putIfMap(studentScores);
        clubsMap(clubs);
    }
}
