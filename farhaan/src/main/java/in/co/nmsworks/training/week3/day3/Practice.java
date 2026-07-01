package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Practice p = new Practice();
        Map<String,Integer> fruits = addMapValue();
        printFruitPrice(fruits,"Apple");
        Map<String, Integer> players = new HashMap<>();
        players.put("Bob",50);
        players.put("John", 100);
        players.put("Max",120);
        Integer result = printPlayerScore(players,"Bob");
        System.out.println("The Score of the player  is :: " + result);
        System.out.println("_______________________________________________");
        Map<String,String> countryCapitals = new HashMap<>();
        countryCapitals.put("US","Washington");
        countryCapitals.put("UK","London");
        countryCapitals.put("Germany","Berlin");
        addCountryCapital(countryCapitals,"India","Delhi");
        copyTwoMaps(players,fruits);
        Map<String, List<Integer>> scores = getStudentScores();
        putStudentScores(scores,98);
        getSchoolClubs();
    }

    private static void getSchoolClubs() {
        Map<String, List<String>> clubs = new HashMap<>();
        List<String> members = clubs.getOrDefault("Chess Club",new ArrayList<>());
        members.add("Sam");
        clubs.put("Chess Club", members);
        System.out.println(clubs);
        System.out.println("_______________________________________________");

    }

    private static void putStudentScores(Map<String, List<Integer>> map, Integer mark) {
        List<Integer> marks = map.getOrDefault("Angel",new ArrayList<>());
        marks.add(mark);
        map.put("Angel", marks);
        System.out.println(map);
        System.out.println("_______________________________________________");
    }

    private static Map<String, List<Integer>> getStudentScores() {
        Map<String , List<Integer>> studentScores = new HashMap<>();
        List<Integer> marks = new ArrayList<>();
        studentScores.put("Alex",marks);
        marks.add(80);
        marks.add(74);
        marks = new ArrayList<>();
        marks.add(65);
        marks.add(79);
        studentScores.put("Alice",marks);
        System.out.println(studentScores.get("Alice"));
        System.out.println("_______________________________________________");

        return studentScores;
    }

    private static void copyTwoMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        mapOne.putAll(mapTwo);
        System.out.println("Map is Copied");
        System.out.println("_______________________________________________");

    }

    private static void addCountryCapital(Map<String, String> map, String key, String value) {
        map.putIfAbsent(key, value);
        System.out.println("Country Added");
        System.out.println("_______________________________________________");

    }

    private static Integer printPlayerScore(Map<String, Integer> map, String player) {
        Integer playerScore = map.getOrDefault("Bob",0);
        return playerScore;
    }

    private static void printFruitPrice(Map<String, Integer> map, String key) {
        System.out.println("_______________________________________________");
        System.out.println("The Price of the Fruit " + key + " is :: " + map.get(key));
        System.out.println("_______________________________________________");

    }

    private static Map<String, Integer> addMapValue() {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple",150);
        fruitPrices.put("Orange",200);
        fruitPrices.put("Banana",50);
        System.out.println("_______________________________________________");
        System.out.println("The Fruits are added");
        return fruitPrices;
    }
}
