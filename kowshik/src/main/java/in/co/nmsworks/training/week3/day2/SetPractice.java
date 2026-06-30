package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        createAndPrintSet();
        iterateSet();
        searchCity("Tiruppur");
        copyOneSetIntoOther(getCitiesSet());
        compareTwoSets(getCitiesSet(), getFruitsSet());
        removeElement(getCitiesSet(), "Chennai");
    }

    private static void removeElement(Set<String> set, String elementToRemove) {
        System.out.println("Before remove : " + set);
        boolean remove = set.remove(elementToRemove);
        System.out.println("Boolean : " + remove);
        System.out.println("After remove : " + set);
    }

    private static void compareTwoSets(Set<String> set1, Set<String> set2) {
        if(set1.size() != set2.size()) {
            System.out.println("Set1 and Set2 are not equal");
            return;
        }

        if(set1.equals(set2)) {
            System.out.println("Set1 and Set2 are equal");
        }
        else {
            System.out.println("Set1 and Set2 are not equal");
        }
    }


    private static void copyOneSetIntoOther(Set<String> set1) {
        System.out.println("Original set : " + set1);
        Set<String> copiedSet = new HashSet<>(set1);
        System.out.println("Copied set : " + copiedSet);
    }

    private static Set<String> getCitiesSet() {
        Set<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Coimbatore");

        return cities;
    }

    private static void searchCity(String cityToSearch) {
        Set<String> cities = getCitiesSet();

        if (cities.contains(cityToSearch)) {
            System.out.println("City : " + cityToSearch + " present");
        }
        else {
            System.out.println("City : " + cityToSearch + " NOT present");
        }
    }

    private static Set<String> getFruitsSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple");

        return fruits;
    }

    private static void iterateSet() {
        Set<String> fruitsSet = getFruitsSet();

        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }
    }

    private static void createAndPrintSet() {
        Set<String> fruitsSet = getFruitsSet();

        System.out.println(fruitsSet);
    }
}
