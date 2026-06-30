package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractise {
    public static void main(String[] args) {
//        createSet();
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        System.out.println("Created Set => "+ fruits);

        iterateSet(fruits);

        Set<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Trichy");

        searchElement(cities, "Trichy");
        createCopy(cities);
        compareSets(fruits, cities);

        Set<String> cities2 = new HashSet<>();
        cities2.add("Trichy");
        cities2.add("Mumbai");
        cities2.add("Chennai");

        compareSets(cities2, cities);
        removeElement(fruits, "Strawberry");
        System.out.println(fruits);

    }

    private static void removeElement(Set<String> set, String element) {
        System.out.println(set.remove(element));
    }

    private static void compareSets(Set<String> set1, Set<String> set2) {
        if( set1.size()!=set2.size() )
        {
            System.out.println("false");
            return;
        }
//        System.out.println(set1.containsAll(set2));
        for (String string : set1) {
            if( !set2.contains(string) )
            {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }

    private static void createCopy(Set<String> set1) {
        Set<String> newSet = new HashSet<>();
        newSet.addAll(set1);
        System.out.println("New Set => "+newSet);
    }

    private static void searchElement(Set<String> set, String element) {
        System.out.println(set.contains(element));
    }

    private static void iterateSet(Set<String> set) {
        for (String string : set) {
            System.out.print(string+ ", ");
        }
        System.out.println();

    }


    private static void createSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        System.out.println("Created Set => "+ fruits);
    }
}
