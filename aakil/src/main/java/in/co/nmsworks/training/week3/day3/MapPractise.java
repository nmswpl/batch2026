package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MapPractise {
    public static void main(String[] args) {
        studentScoreExample();
        System.out.println("----------");
        schoolClubExample();
    }

        /**
        * Create a map for school clubs and their member lists.
        *Add "Chess Club" with an empty list only if it does not exist,
        *and then add "Sam" to that club's list. */
    private static void schoolClubExample() {

        Map<String, List<String>> clubMap = new HashMap<>();
        List<String> studentList = new ArrayList<>();

        clubMap.put("Rifle Club", studentList);
        studentList.add("Gun-Gin Gook");
        studentList.add("Jill Jung Jook");

        studentList = new ArrayList<>();
        clubMap.putIfAbsent("Chess Club", studentList);
        studentList.add("Alex");
        studentList.add("Erica");

        studentList = clubMap.get("Chess Club");
        studentList.add("Sam");

        clubMap.forEach((k, v) -> System.out.println(k + " --> " + v));
    }

    private static void studentScoreExample() {
    /* Create a map to store a student's name and their list of test scores.
    Add a student named "Alice" with a new list, and  add the score 85 to her list */

        Map<String, List<Integer>> studentScores = new HashMap<>();
        List<Integer> scores = new ArrayList<>();

        studentScores.put("Alex", scores);
        scores.add(56);
        scores.add(65);
        scores.add(76);
        scores.add(87);

        scores = new ArrayList<>();
        studentScores.put("Angel", scores);
        scores.add(45);
        scores.add(54);

//        scores = new ArrayList<>();
//        studentScores.put("Sam", scores);
//        scores.add(45);
//        scores.add(54);

        scores = new ArrayList<>();
        studentScores.put("Alice", scores);
        scores.add(45);
        scores.add(85);

        studentScores.forEach((k, v) -> System.out.println(k + "--->" + v));

        /* From Q1's map , find "Angel" in your map.
        If she is already there, add a new score of 95 to her list, but if she is missing,
        create a new list for her with the score 95. */

        scores = studentScores.getOrDefault("Angel", new ArrayList<>());
        scores.add(34);
        scores.add(95);

        studentScores.forEach((k, v) -> System.out.println(k + "--->" + v));
    }
}
