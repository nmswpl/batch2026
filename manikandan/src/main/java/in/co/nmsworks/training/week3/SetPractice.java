package in.co.nmsworks.training.week3;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        createSet();
        iterateSet();
        searchSet();
        copySet();
        compareSet();
        removeSet();
    }

    private static void removeSet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        System.out.println("6.REMOVE");
        System.out.println(fruits.remove("MANGO"));
    }

    private static void compareSet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        Set<String>copySet = new HashSet<>();
        copySet.add("WATERMELON");
        copySet.add("GUAVA");
        System.out.println("5.COMPARING");
        System.out.println(copySet.equals(fruits));
    }

    private static void copySet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        System.out.println("4.COPYSET");

        Set<String>copySet = new HashSet<>();
        copySet.addAll(fruits);
        System.out.println(copySet);
    }

    private static void searchSet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        System.out.println("3.SEARCH ");
        System.out.println(fruits.contains("MANGO"));

    }


    private static void iterateSet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        System.out.println("2.ITERATE ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }



    }

    private static void createSet() {
        Set<String> fruits=new HashSet<>();
        fruits.add("MANGO");
        fruits.add("BANANA");
        fruits.add("STRAWBERRY");
        fruits.add("ORANGE");
        System.out.println("1.ADD ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
