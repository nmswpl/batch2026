package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

import static org.apache.commons.lang3.ArrayUtils.removeElement;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("jackfruit");
        fruits.add("fig");

        Set<String> cities = new HashSet<>();
        cities.add("chennai");
        cities.add("mumbai");
        cities.add("banglore");

        elementsInSet(fruits);
        iterateSet(fruits);
        checkElement(cities);
        copyOfSet(fruits,cities);
        checkSetHasSameElements(cities,fruits);
        removeElement(fruits);
    }

    private static void removeElement(Set<String> fruits) {
        String fruit = "apple";
        System.out.println("after removing " + fruit + " : " + fruits.remove(fruit));
    }

    private static void checkSetHasSameElements(Set<String> cities, Set<String> fruits) {
        System.out.println("set 1 contains all elements in set 2 : " + cities.containsAll(fruits));
    }

    private static void copyOfSet(Set<String> fruits, Set<String> cities) {
        System.out.println("copying sets : " + fruits.addAll(cities));
    }

    private static void checkElement(Set<String> cities) {
        String city = "chennai";
        System.out.println("city " + city + " present in set : " + cities.contains(city));
    }

    private static void iterateSet(Set<String> fruits) {
        System.out.println("iteration through the fruits set : ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private static void elementsInSet(Set<String> fruits) {
        System.out.println("elements in set fruits : ");
        System.out.println(fruits);
    }
}
