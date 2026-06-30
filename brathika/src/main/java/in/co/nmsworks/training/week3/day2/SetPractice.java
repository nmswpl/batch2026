package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        SetPractice practice = new SetPractice();
        Set<String> city = new HashSet<>();
        city.add("Trichy");
        city.add("Coimbatore");
        city.add("Chennai");
        city.add("Karur");
        city.add("Salem");
        practice.createAddAndPrintSet();
        practice.iterateThroughSet(city);
        practice.searchElements(city,"Bangalore");
        Set<String> city2 = new HashSet<>();
        city2.add("Bangalore");
        city2.add("Thanjavur");
        city2.add("Erode");
        practice.copyElementsFromSetToSet(city,city2);
        practice.checkwhetherSetIsEqual(city, city2);
        practice.removeSpecifiedElement(city,"Karur");

    }

    private void removeSpecifiedElement(Set<String> city, String value) {
        System.out.println("Set before removing the element: "+city);
        city.remove(value);
        System.out.println("Set after removing the element: "+city);
    }

    private void checkwhetherSetIsEqual(Set<String> city, Set<String> city2) {
        if (city.equals(city2)) {
            System.out.println("Two set are equal");
        }
        else {
            System.out.println("Two set are not equal");
        }
    }

    private void copyElementsFromSetToSet(Set<String> city, Set<String> city2) {
        System.out.println("Set before coping: "+city);
        for (String s : city2) {
            city.add(s);
        }
        System.out.println("Set after coping: "+city);
    }

    private void searchElements(Set<String> city, String value) {
        if (city.contains(value)) {
            System.out.println(value+" is found in the set");
        }
        else {
            System.out.println(value+" is not found in the set");
        }
    }

    private void iterateThroughSet(Set<String> state) {
        for (String s : state) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    private void createAddAndPrintSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pomogranate");
        fruits.add("Orange");
        fruits.add("Mosambi");
        System.out.println(fruits);
    }
}
