package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        fruitSet();

        Set<String> fruits = new HashSet<>();
        Set<String> food = new HashSet<>();

        food.add("dosa");

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");

        String element1 = "Lemon";
        String element2 = "Tomato";



        iterateSet(fruits);
        searchElement(fruits, element1);
        copyInto(fruits, food);
        compareSets(fruits, food);
        removeElement(fruits, element1);

    }

    private static void removeElement(Set<String> set, String target) {
        set.remove(target);
        System.out.println("REMOVED \" " + target + "\" : " + set);
    }

    private static void compareSets(Set<String> setOne, Set<String> setTwo) {
        if(setOne.size() != setTwo.size()){
            System.out.println("NOT EQUAL");
            return;
        }

        System.out.println((setOne.containsAll(setTwo)) ? "EQUAL" : "NOT EQUAL");
    }

    private static void copyInto(Set<String> source, Set<String> dest) {
        System.out.println("SOURCE :; " + source);
        System.out.println("DEST :: "+ dest);
        dest.addAll(source);
        System.out.println("COPIED INTO :: " + dest);
    }

    private static void searchElement(Set<String> set, String target) {
        System.out.println((set.contains(target)) ? "FOUND" : "NOT FOUND");
    }

    private static void iterateSet(Set<String> set) {
        System.out.println("ITERATION : ");
        set.forEach(System.out::println);
    }

    private static void fruitSet() {
        Set<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");

        System.out.println("FRUITS SET :: " + fruits);

    }
}
