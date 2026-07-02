package in.co.nmsworks.training.week3.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        MapPractice mapPractice = new MapPractice();

        Map<String, Double> fruitsMap = mapPractice.getFruitsMap();
        mapPractice.printPriceOfFruit(fruitsMap, "Apple");
        mapPractice.getGameScore("Bob");
        mapPractice.addCountryCapitals();
        mapPractice.copyDataFromMap();
        mapPractice.storeStudentNameAndListOfScores("Alice", 85);
        mapPractice.checkWhetherNameExistsAndAddScores( "Angel", 95);
        mapPractice.addDataToSchoolClubWithMemberList("Chess club", "Sam");
    }

    private void addDataToSchoolClubWithMemberList(String clubNameToCheck, String name) {
        Map<String, List<String>> schoolClubToMembersMap = new HashMap<>();
        schoolClubToMembersMap.computeIfAbsent(clubNameToCheck, v -> new ArrayList<>()).add(name);
    }

    private void checkWhetherNameExistsAndAddScores(String nameToFind, int marks) {
        Map<String, List<Integer>> nameToScoreMap = new HashMap<>();
        nameToScoreMap.computeIfAbsent(nameToFind, v -> new ArrayList<>()).add(marks);
    }

    private void storeStudentNameAndListOfScores(String studentName, int marks) {
        Map<String, List<Integer>> studentNameToScoreMap = new HashMap<>();
        studentNameToScoreMap.computeIfAbsent(studentName, v -> new ArrayList<>()).add(marks);

        System.out.println("After insert -> " + studentNameToScoreMap);
    }


    private void copyDataFromMap() {
        Map<String, Double> shop1 = new HashMap<>();
        shop1.put("Sugar", 200.0);
        shop1.put("Milk", 50.0);

        Map<String, Double> shop2 = new HashMap<>(shop1);

        System.out.println("Shop-1 : " + shop1);
        System.out.println("Shop-2 : " + shop2);
    }

    private void addCountryCapitals() {
        Map<String, String> countryToCapitalMap = new HashMap<>();
        countryToCapitalMap.putIfAbsent("India", "Delhi");

        System.out.println("After put : " + countryToCapitalMap);
    }

    private Map<String, Integer> getGameScore(String nameToFind) {
        Map<String, Integer> scoreMap = new HashMap<>();
        //scoreMap.put("Bob", 5);
        scoreMap.put("John", 4);

        System.out.println("Score of " + nameToFind + " is : " + scoreMap.getOrDefault(nameToFind, 0));
        return scoreMap;
    }

    private void printPriceOfFruit(Map<String, Double> fruitsMap, String fruitName) {
        System.out.println("Price of " + fruitName + " is : " + fruitsMap.get(fruitName));
    }

    private Map<String, Double> getFruitsMap() {
        Map<String, Double> fruitsMap = new HashMap<>();

        fruitsMap.put("Apple", 500.0);
        fruitsMap.put("Orange", 300.0);
        fruitsMap.put("Grapes", 450.0);

        return fruitsMap;
    }


}
