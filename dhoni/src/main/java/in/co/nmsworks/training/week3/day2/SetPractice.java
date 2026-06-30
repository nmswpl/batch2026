package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

import static in.co.nmsworks.training.week3.day2.ListPractice.iterateElements;
import static org.apache.commons.lang3.ArrayUtils.removeElement;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");


        Set<String> fruits2 = new HashSet<>();
        fruits2.add("grapes");
        fruits.add("mango");
        fruits2.add("orange");

        Set<String> fruits3 = new HashSet<>();


        printElements(fruits);
        iterateElements(fruits);

        Set<String> citys = new HashSet<>();
        citys.add("chennai");
        citys.add("salem");
        citys.add("erode");

        searchCity("erode", citys);
        copySet(fruits,fruits2,fruits3);
        setEqual(fruits,fruits2);
        removeElement("orange",fruits);

    }

    private static void removeElement(String key,Set<String> fruits) {
        System.out.println( "remove : "+ fruits.remove(key));
    }

    private static void setEqual(Set<String> fruits, Set<String> fruits2) {
            if(fruits.containsAll(fruits2)){
                System.out.println("Equal");
                return;
            }
        System.out.println("Equal set");
    }

    private static void copySet(Set<String> fruits, Set<String> fruits2, Set<String> fruits3) {
        System.out.println("set 1: " + fruits);
        System.out.println("set 2: " + fruits2);
        fruits3.addAll(fruits);
        fruits3.addAll(fruits2);
        System.out.println("set 3: " + fruits3);

    }

    private static void searchCity(String city, Set<String> citys) {
        if(citys.contains(city)){
            System.out.println("Found");
            return;
        }
        System.out.println("not found");
    }

    private static void iterateElements(Set<String> fruits) {
        System.out.println("Elements in list : ");
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }

    private static void printElements(Set<String> fruits) {
        System.out.println(fruits);
    }
}
