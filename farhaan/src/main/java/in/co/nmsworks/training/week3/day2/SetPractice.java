package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetPractice {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Mango");
        Set<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Banglore");
        cities.add("Pune");
        printFruits(fruits);
        iterateElementsInSet(fruits);
        searchSpecificCity(cities, "Mumbai");
        copyIntoNewSet(cities);
        compareAndCheckTwoSets(fruits,cities);
        removeSpecificElementFromSet(cities, "Mumbai");
    }

    private static void removeSpecificElementFromSet(Set<String> inputSet, String element) {
        if(inputSet.contains(element)){
            inputSet.remove(element);
            System.out.println("The element is removed");
        }
        else{
            System.out.println("The element is not present");
        }
        System.out.println("_________________________________________");
    }

    private static void compareAndCheckTwoSets(Set<String> setOne, Set<String> setTwo) {
        if(setOne.size() != setTwo.size()){
            System.out.println("The given List are different sizes");
        }
        if(setOne.containsAll(setTwo)){
            System.out.println("The Two Sets are equal");
        }
        else{
            System.out.println("The Two Sets are not equal");
        }
        System.out.println("_________________________________________");
    }

    private static void copyIntoNewSet(Set<String> inputSet) {
        Set<String> newSet = new HashSet<>();
        newSet.addAll(inputSet);
        System.out.println("The new set is copied");
        System.out.println("_________________________________________");
    }

    private static void searchSpecificCity(Set<String> cities, String element) {
        if(cities.contains(element)){
            System.out.println("The given city is present");
        }
        else{
            System.out.println("The given city is not present");
        }
        System.out.println("_________________________________________");
    }

    private static void iterateElementsInSet(Set<String> inputSet) {
        for (String s : inputSet){
            System.out.println(s);
        }
        System.out.println("_________________________________________");
    }

    private static void printFruits(Set<String> inputSet) {
        System.out.println(inputSet);
        System.out.println("_________________________________________");
    }

}
