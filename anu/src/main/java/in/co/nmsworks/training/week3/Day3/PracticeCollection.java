package in.co.nmsworks.training.week3.Day3;

import java.util.*;

public class PracticeCollection {
    public static void main(String[] args) {
        PracticeCollection practiceCollection =new PracticeCollection();

        System.out.println("print the fruits name ------");
        practiceCollection.printFruitsDetails();
        System.out.println();

        System.out.println("Print the Games Score -----");
        practiceCollection.printGameScore();
        System.out.println();

        System.out.println("Print the captial name ------");
        practiceCollection.printCapitals();
        System.out.println();

        System.out.println("copy one map into another --------");
        practiceCollection.printCopyMap();
        System.out.println();

        System.out.println("student list ------");
        practiceCollection.printSTudentDetail();
        System.out.println();


    }

    private void printSTudentDetail() {

        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", new ArrayList<>());
        studentScores.get("Alice").add(85);
        String targetStudent = "Angel";
        if (studentScores.containsKey(targetStudent)) {
            studentScores.get(targetStudent).add(95);
        }else {
            studentScores.put(targetStudent, new ArrayList<>());
            studentScores.get(targetStudent).add(95);
        }

        for(String s : studentScores.keySet()){
            System.out.println(studentScores.get(s));
        }

        System.out.println();

        System.out.println("club member-------");

        Map<String, List<String>> clubMembers = new HashMap<>();

        clubMembers.putIfAbsent("Chess Club", new ArrayList<>());
        clubMembers.get("Chess Club").add("Sam");

        for(String s : clubMembers.keySet()){
            System.out.println(clubMembers.get(s));
        }
    }

    private void printCopyMap() {
        countryCapitals india = new countryCapitals("Saravana");
        countryCapitals delhi = new countryCapitals("Trends");

        Map<Integer,String> shopA =new HashMap<>();
        Map<Integer,String> shopB=new HashMap<>();

        shopA.put(1,india.getName());
        shopA.put(2,delhi.getName());

        shopB.putAll(shopA);

        for(Integer i : shopB.keySet()){
            System.out.println(shopB.get(i));
        }
    }

    private void printCapitals() {
        countryCapitals india = new countryCapitals("India");
        countryCapitals delhi = new countryCapitals("Delhi");

        Map<Integer , String> capitals = new HashMap<>();

        capitals.put(2,delhi.getName());
        capitals.putIfAbsent(1,india.getName());

        for (Integer i : capitals.keySet()){
            System.out.println(capitals.get(i));
        }
    }

    private void printGameScore() {
        GameScore scoreOne =new GameScore("Ani" ,100.0);
        GameScore scoreTwo =new GameScore("Bob" ,200.0);

        Map<String,Double> game =new HashMap<>();
        game.put(scoreOne.getGameName(), scoreOne.getGameScore());
        game.put(scoreTwo.getGameName(), scoreTwo.getGameScore());

        for (String i : game.keySet()){
            System.out.println(game.get(i) + " " + i);
        }

        String name="Bob";
        if (game.containsKey(name)) {
            System.out.println("found");
        } else {
            System.out.println("notfound");
        }
    }

    private void printFruitsDetails() {
        FruitsPrice fruitOne= new FruitsPrice("Banana",400.0);
        FruitsPrice fruitTwo= new FruitsPrice("Grapes",200.0);
        FruitsPrice fruitThree= new FruitsPrice("Apple",450.0);
        FruitsPrice fruitFour= new FruitsPrice("Orange",100.0);

        Map<String,Double> fruitsName = new HashMap<>();

        fruitsName.put(fruitOne.getNames(),fruitOne.getPrice());
        fruitsName.put(fruitTwo.getNames(),fruitTwo.getPrice());
        fruitsName.put(fruitThree.getNames(),fruitThree.getPrice());
        fruitsName.put(fruitFour.getNames(),fruitFour.getPrice());

        Set<Map.Entry<String,Double>> fruitsEntry = fruitsName.entrySet();
        for (Map.Entry<String, Double> integerStringEntry : fruitsEntry) {
            System.out.print("map key : " + integerStringEntry.getKey() +" ");
            System.out.print("map value : "  +integerStringEntry.getValue());
            System.out.println();
        }

        System.out.println("Price of an Apple is  : " + fruitsName.get("Apple"));

    }

}
