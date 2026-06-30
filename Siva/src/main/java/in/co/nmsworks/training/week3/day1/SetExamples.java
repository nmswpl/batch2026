package in.co.nmsworks.training.week3.day1;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        SetExamples se = new SetExamples();
        Set<String> fruits = new HashSet<>();
        se.addItems(fruits,new String[]{"Apple","Orange","Mango","Grapes","Apple","PineApple"});
        se.printAllItems(fruits);
        Set<String> city = new HashSet<>();
        se.addItems(city,new String[]{"Sivakasi","Madurai","Chennai","Coimbatore"});
        se.printAllItems(city);
        se.searchItem(city,"Sivakasi");
        se.copyFromOneSetToOther(fruits,city);
        se.compareTwoSets(fruits,city);
        se.compareTwoSets(city,city);
        se.removeSpecificElement(fruits,"Madurai");
    }

    private void removeSpecificElement(Set<String> set, String value) {
        if (set.contains(value)) {
            set.remove(value);
            System.out.println("Sucessfully Removed");
        }
        else {
            System.out.println(value+" not present in this set");
        }

    }

    private void compareTwoSets(Set<String> set1, Set<String> set2) {
        if (set1.equals(set2))
            System.out.println("Both have same elements");
        else
            System.out.println("Both have different elements");
    }

    private void copyFromOneSetToOther(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
        System.out.println("Sucessfully Copied");
    }

    private void searchItem(Set<String> cities, String city) {
        if (cities.contains(city)) {
            System.out.println(city+" is present");
        }
        else {
            System.out.println(city+" is not present");
        }
    }

    private void printAllItems(Set<String> fruits) {
        System.out.println("-----------------Printing All Items----------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private void addItems(Set<String> setItem, String[] values) {
        for (String eachValue : values) {
            setItem.add(eachValue);
        }
    }
}
