package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        SetPractice setPractice = new SetPractice();
        setPractice.printSet();
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
        setPractice.iterateSetElements(fruits);
        setPractice.searchForElement();
        setPractice.copySet(fruits);
        setPractice.compareTwoSet(fruits);
        setPractice.removeElement(fruits, "Guava");
    }

    private void removeElement(Set<String> fruits, String fruit) {
        System.out.println(fruit + " Removed : " + fruits.remove(fruit));
    }

    private void compareTwoSet(Set<String> fruits) {
        Set<String> seasonalFruits = new HashSet<>();
        seasonalFruits.addAll(fruits);
        System.out.println("Two Sets are Equal : " + fruits.equals(seasonalFruits));
        seasonalFruits.add("Pomegranate");
        System.out.println("Two Sets are Equal : " + fruits.equals(seasonalFruits));
    }

    private void copySet(Set<String> fruits) {
        Set<String> seasonalFruits = new HashSet<>();
        seasonalFruits.addAll(fruits);
        System.out.println("Copied Set Elements : " + seasonalFruits.toString());
    }

    private void searchForElement() {
        Set<String> name = new HashSet<>();
        name.add("Sibani");
        name.add("Gobika");
        name.add("Priya");
        name.add("Brathika");
        System.out.println("Element1 present : " + name.contains("Mona"));
        System.out.println("Element2 present : " + name.contains("Sibani"));
    }

    private void iterateSetElements(Set<String> fruits) {
        System.out.println("Set Elements : ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private void printSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
        System.out.println("Set Elements : " + fruits.toString());
    }
}
