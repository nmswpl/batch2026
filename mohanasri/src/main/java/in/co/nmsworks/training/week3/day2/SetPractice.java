package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {


        SetPractice sp = new SetPractice();
        Set<String> fruits = new HashSet<>();
        Set<String> fruits2 = new HashSet<>();
        Set<String> city = new HashSet<>();
        city.add("Chennai");
        city.add("Banglore");


        sp.addFruits(fruits);
        sp.iteratingFruits(fruits);
        sp.searchCity(city, "Banglore");
        sp.copy(fruits2, fruits);
        sp.compareTwoSets(fruits, fruits2);
        sp.removeElementInSet(fruits, "Mango");


    }

    private void removeElementInSet(Set<String> fruits, String fruit) {
        fruits.remove(fruit);
        System.out.println(fruits);

    }

    private void compareTwoSets(Set<String> fruits, Set<String> fruits2) {
        boolean cmp = false;
       for( String s : fruits){
           if (fruits2.contains(s)){
               cmp = true;
               break;
           }

       }
        System.out.println("comapring two sets : " + cmp);
    }

    private void copy(Set<String> fruits2, Set<String> fruits) {
        fruits2.addAll(fruits);
        System.out.println(fruits2);
    }

    private void searchCity(Set<String> city, String searchCity) {
        System.out.println("City set contains Banglore ? "+ city.contains(searchCity));
    }

    private void iteratingFruits(Set<String> fruits) {
        System.out.println("Iterating fruits");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


    private void addFruits(Set<String> fruits) {

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Guava");
        System.out.println(fruits);

    }

}
