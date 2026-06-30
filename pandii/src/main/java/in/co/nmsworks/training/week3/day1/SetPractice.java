package in.co.nmsworks.training.week3.day1;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Jackfruit");
        fruits.add("Banana");
        fruits.add("kiwi");

        printFruits(fruits);        //1  //2

        searchFruits(fruits);       //3

        Set <String> fruitsSet=new HashSet<>();
        fruitsSet.addAll(fruits);
        System.out.print("Copy of set fruits into new set ");
        printFruits(fruitsSet);             //4

        checkTwoSetAreSame(fruits, fruitsSet);      //5

        removeElement(fruits,"Apple");          //6

    }

    private static void removeElement(Set<String> fruits,String fruit) {
        fruits.remove(fruit);
        System.out.print("After remove one fruit ");
        printFruits(fruits);
    }

    private static void checkTwoSetAreSame(Set<String> fruits, Set<String> fruitsSet) {
        if(fruits.equals(fruitsSet))
        {
            System.out.println("Same set");
        }
        else {
            System.out.println("not same set");
        }
    }

    private static void searchFruits(Set<String> fruits) {
        System.out.println("Searched fruit found is "+fruits.contains("Banana"));
    }

    private static void printFruits(Set<String> fruits) {
        System.out.println("Print fruits :");
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }
        System.out.println();
    }
}
