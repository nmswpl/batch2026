package in.co.nmsworks.training.week3.Day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        createSetAndDisply();
        iterateAllElements();
        searchSpecificCityName();
        copyOfOneSetIntoAnother();
        compareTwoSets();
        removeSpecificElement();
    }

    private static void removeSpecificElement() {
        Set<String> city = getCity();
        city.remove("Tindivanam");
        System.out.println("After Removal:"+city);
    }

    private static void compareTwoSets() {
        Set<String> city = getCity();
        Set<String> fruits=getFruits();
            if (city.containsAll(fruits)){
                System.out.println("Equal");
            }
            else {
                System.out.println("Not equal");
            }
        }


    private static void copyOfOneSetIntoAnother() {
        Set<String> city = getCity();
        Set<String> fruits=getFruits();
        city.addAll(fruits);
        System.out.println("Copy of one set into another"+city);

    }

    private static void searchSpecificCityName() {
        Set<String> city = getCity();
        System.out.println(city.contains("Tindivanam"));
    }

    private static Set<String> getCity() {
        Set<String> city=new HashSet<>();
        city.add("Chennai");
        city.add("Mumbai");
        city.add("kalcat");
        city.add("Tindivanam");
        return city;
    }

    private static void iterateAllElements() {
        Set<String> fruits=getFruits();
        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }

    private static void createSetAndDisply() {
        getFruits();
    }

    private static Set<String> getFruits() {
        Set<String> fruits=new HashSet<>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");
        return fruits;
    }
}
