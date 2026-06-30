package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String>fruits = new HashSet<>();
        createSet(fruits);
        iterate(fruits);
        Set<String>cities = new HashSet<>();
        cities.add("chennai");
        cities.add("trichy");
        cities.add("madurai");
        searchCityByName(cities,"trichy");
        copyOfSets(fruits, cities);
        Set<Character> characters1 = new HashSet<>();
        characters1.add('a');
        characters1.add('b');
        Set<Character> characters2 = new HashSet<>();
        characters2.add('a');
        characters2.add('j');
        compareTwoSets(characters1, characters2);

        removeElement(characters1,'a');
    }

    private static void removeElement(Set<Character>characters1 , Character ch) {
        characters1.remove(ch);
        System.out.println(characters1);

    }

    private static void compareTwoSets(Set<Character> characters1, Set<Character> characters2) {
        if (characters1.size() != characters2.size()){
            System.out.println("Two sets are not contain same elements!");
        } else if (characters1.containsAll(characters2)) {
            System.out.println("Two sets has same elements");
        }else {
            System.out.println("Two sets elements are not equal");

        }


    }

    private static void copyOfSets(Set<String> fruits, Set<String> cities) {
        fruits.addAll(cities);
        System.out.println(fruits);

    }

    private static void searchCityByName(Set<String> cities,String target) {
        for (String city : cities) {
            if (city.equals(target)){
                System.out.println("city name "+city);
                return;
            }

        }
        System.out.println("city not found");

    }

    private static void iterate(Set<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

    private static void createSet(Set<String> fruits) {
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println(fruits);
    }
}
