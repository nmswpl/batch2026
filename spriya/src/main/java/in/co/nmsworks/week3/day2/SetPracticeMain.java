package in.co.nmsworks.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPracticeMain {
    public static void main(String[] args) {
        SetPractice setPractice = new SetPractice();
        Set<String> fruit = new HashSet<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Orange");


        System.out.println("Add fruits");
        setPractice.addFruits(fruit);
        System.out.println("Iterate");
        setPractice.iterate(fruit);
        System.out.println();
        System.out.println("Copy method");
        setPractice.copyMethod(fruit);
        System.out.println();
        System.out.println("Search city");
        setPractice.searchCity();
        System.out.println();
        System.out.println("Compare two sets");
        setPractice.compare();
        setPractice.removeElement(fruit);


    }
}
