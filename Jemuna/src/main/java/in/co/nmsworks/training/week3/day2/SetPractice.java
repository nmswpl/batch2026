package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        setFruits();
        printFruits();
        specificFruit();
        copySet();
        compareSet();
        removeSpecificElement();
    }

    private static void removeSpecificElement() {
        Set<String> fruits =setFruits();
        System.out.println("Removing Element at index 0 : "+fruits.remove("Apple"));

    }

    private static void compareSet() {
        Set<String> fruits =setFruits();
        Set<String> fruits1 =setFruits();
        fruits1.add("Pomegranate");
        fruits1.add("Pine apple");
        System.out.println("Comparing two sets : "+ fruits.containsAll(fruits1));
    }

    private static void copySet() {
        Set<String> fruits =setFruits();
        Set<String> fruits2 = new HashSet<>();
        System.out.println("Copy Set : ");
        fruits2.addAll(fruits);
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }
    }

    private static void specificFruit() {
        Set<String> fruits =setFruits();
        System.out.println("Searching an element in an Array :"+fruits.contains("Apple"));
    }

    private static void printFruits() {
        Set<String> fruits =setFruits();
        System.out.println("List of Fruits : ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private static Set<String> setFruits() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        return fruits;
    }
}
