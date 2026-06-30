package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        createSet();
        iterateSet();
        searchCity();
        copySets();
        compareSets();
        removeElementFromASet();

    }

    private static void removeElementFromASet() {
        System.out.println("Remove element from a Set ....");
        Set<String> city = new HashSet<>();
        city.add("Chennai");
        city.add("Pattukkottai");
        city.add("Madhurai");

        System.out.println("Remove Element : "+ city.remove("Madhurai"));
    }

    private static void compareSets() {
        System.out.println("Compare Sets ....");
        Set<String> city = new HashSet<>();
        city.add("Chennai");
        city.add("Pattukkottai");
        city.add("Madhurai");
        Set<String> place = new HashSet<>();
        place.add("Chennai");
        place.add("Pattukkottai");
        place.add("Madhurai");

        System.out.println("Compare two sets : "+ city.equals(place));


    }

    private static void copySets() {
        System.out.println("Copy Sets ....");
        Set<String> city = new HashSet<>();
        city.add("Chennai");
        city.add("Pattukkottai");
        city.add("Madhurai");

        Set<String> place = new HashSet<>();
        System.out.println(place.addAll(city));
    }

    private static void searchCity() {
        Set<String> city = new HashSet<>();
        city.add("Chennai");
        city.add("Pattukkottai");
        city.add("Madhurai");
        System.out.println("Search city of Chennai  : "+ city.contains("Chennai"));
    }

    private static void iterateSet() {
        System.out.println("Iterate city....");
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private static void createSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
