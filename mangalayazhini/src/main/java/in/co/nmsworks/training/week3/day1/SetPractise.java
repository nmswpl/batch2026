package in.co.nmsworks.training.week3.day1;

import java.util.Set;
import java.util.HashSet;

public class SetPractise {
    public static void main(String[] args) {

        SetPractise obj = new SetPractise();
        Set<String> fruitsSet = obj.createSetOfStrings();
        obj.printSetOfStrings(fruitsSet);

        Set<String> citySet = new HashSet<>();
        citySet.add("Chennai");
        citySet.add("Hyderabad");
        citySet.add("Bangalore");


        obj.searchInSet(citySet, "Chennai");
        obj.copyOneSetToAnother(citySet);
        obj.removeElementFromSet(citySet, "Chennai");

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Python");
        set1.add("Java");
        set1.add("C++");

        set2.add("Python");
        set2.add("Java");
        set2.add("C++");

        obj.compareTwoSets(set1, set2);

    }

    private void removeElementFromSet(Set<String> strSet, String value) {
        strSet.remove(value);
        System.out.println("\nSet after removing the specified element : ");
        printSetOfStrings(strSet);
    }

    private void compareTwoSets(Set<String> strSet1, Set<String> strSet2) {
        int originalSize = strSet1.size();
        strSet1.addAll(strSet2);
        if(strSet1.size() != originalSize){
            System.out.println("\nThe given two sets are not equal ");
        }
        else{
            System.out.println("\nThe given two sets are equal ");
        }
    }

    private void copyOneSetToAnother(Set<String> stringSet) {
        Set<String> newStringSet = new HashSet<>();
        newStringSet.addAll(stringSet);

        System.out.println("\nNew Copied Set : ");
        printSetOfStrings(newStringSet);
    }

    private boolean searchInSet(Set<String> stringSet, String value) {
        if(stringSet.contains(value)) {
            System.out.println("\nThe value " + value + " is present in the set ");
            return true;
        }else{
            System.out.println("\nThe value " + value + " is not present in the set ");
            return false;
        }
    }

    private void printSetOfStrings(Set<String> stringSet) {
        System.out.print("\nSet : ");
        for (String str : stringSet) {
            System.out.print(str + " ");
        }
    }

    private Set<String> createSetOfStrings() {
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        return stringSet;
    }


}
