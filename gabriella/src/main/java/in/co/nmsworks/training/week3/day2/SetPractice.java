package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Litchi");

        System.out.println(fruits);

        printElements(fruits);

        Set<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai");
        System.out.println(cities);

        String city = "Trichy";
        System.out.println("Contains " + city + ": " + cities.contains(city));

        fruits.addAll(cities);
        System.out.println(fruits);

        Set<String> fruits2 = new HashSet<>();
        fruits2.add("Apple");
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Dates");

        System.out.println("fruits contains fruits2: " + fruits.containsAll(fruits2));

        fruits.remove("Apple");
        System.out.println("After removing an element: " + fruits);
    }

    private static void printElements(Set<String> fruits){
        for (String fruit : fruits) {
            System.out.print(fruit + " ");

        }
        System.out.println();
    }

}
