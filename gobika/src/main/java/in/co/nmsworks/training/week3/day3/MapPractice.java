package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mapPractice = new MapPractice();
        mapPractice.createFruitMap();
        mapPractice.gameScore();
        mapPractice.addCountry();
        mapPractice.copyMaps();
        Map<String, List<Integer>> studentScore = new HashMap<>();
        mapPractice.addStudentScore("Alice",85,studentScore);
        mapPractice.addStudentScore("Alice",90, studentScore);
        mapPractice.addStudentScore("Gobika" ,95, studentScore);
        mapPractice.addStudentScore("Angel",95,studentScore);
        System.out.println(studentScore);
        mapPractice.schoolClub();


    }

    private void schoolClub() {
        Map<String,List<String>> schoolClub = new HashMap<>();
        List<String> memberInNss = new ArrayList<>();
        memberInNss.add("Gobika");
        memberInNss.add("Roshika");
        schoolClub.put("NSS",memberInNss);
        System.out.println(schoolClub);

        schoolClub.putIfAbsent("Chess Club", new ArrayList<>());
        schoolClub.get("Chess Club").add("Sam");

        System.out.println(schoolClub);

    }

    private void addStudentScore(String name, Integer mark, Map<String, List<Integer>> studentScore) {
        List<Integer> scoreList= studentScore.get(name);
        if (scoreList == null){
            scoreList = new ArrayList<>();
            studentScore.put(name, scoreList);
        }
        scoreList.add(mark);
//        System.out.println(studentScore);
    }


    private void copyMaps() {
        Map<String,Float> shopA = new HashMap<>();
        shopA.put("Apple", 450.0F);
        shopA.put("Orange",360.0F);
        shopA.put("Grapes",100.0F);
        shopA.put("Banana",200.0F);
        shopA.put("Cherry",250.0F);

        Map<String,Float> shopB = new HashMap<>();
        shopB.put("Tomato", 40.0F);
        shopB.put("Potato",50.0F);
        shopB.put("Cabbage", 46.0F);


        shopA.putAll(shopB);
        System.out.println(shopA);

    }

    private void addCountry() {
        Map<String,String> country = new HashMap<>();
        System.out.println(country.putIfAbsent("India","Delhi"));
    }

    private void gameScore() {
        Map<String,Integer> nameAndScore = new HashMap<>();
        nameAndScore.put("Arun",100);
        nameAndScore.put("Bob",90);
        nameAndScore.put("Charan",150);
        nameAndScore.put("Dharani",110);
        System.out.println("Get Bob score : "+ nameAndScore.getOrDefault("Bob",0));
    }

    private void createFruitMap() {
        Map<String,Float> fruits = new HashMap<>();
        fruits.put("Apple", 450.0F);
        fruits.put("Orange",360.0F);
        fruits.put("Grapes",100.0F);
        fruits.put("Banana",200.0F);
        fruits.put("Cherry",250.0F);

        System.out.println("Price of Apple : "+fruits.get("Apple"));

    }

}
