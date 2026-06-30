package in.co.nmsworks.training.week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        setCreation();
        iterateSet();
        search();
        copy();
        compare();
        reove();

    }

    public static void reove() {
        Set<String > set = getSet();
        System.out.println("Remove..");
        System.out.println("Original set: "+set);
        set.remove("Orange");
        System.out.println(set);
    }

    public static void compare() {
        Set<String> set1 = getSet();
        Set<String> set2 = new HashSet<>();
        set2.add("Pineapple");
        set2.add("Orange");
        set2.add("Banana");
        set2.add("Apple");
        boolean isEqual = false;
        if(set1.size()!=set2.size()){
            System.out.println("Not same ");
            return;
        }
        else{
            for (String s : set1) {
                if(set2.contains(s)){
                    isEqual=true;
                }
                else{
                    isEqual = false;
                    System.out.println("Not same");
                    break;
                }
            }
            if(isEqual){
                System.out.println("Equal set");
            }
        }
    }

    public static void copy() {
        Set<String> set1 = getSet();
        System.out.println("Set1: "+set1);
        Set<String> set2 = new HashSet<>(set1);
        System.out.println("Set2: "+set2);
    }

    public static void search() {
        Set<String> set = new HashSet<>();
        System.out.println("Search...");
        set.add("Chennai");
        set.add("Villupuram");
        set.add("Coimbatore");

        String search = "Villupuram";
        boolean isPresent = false;
        for (String s : set) {
            if(search.equals(s)){
                System.out.println("Element found");
                isPresent = true;
                break;
            }
        }
        if(!isPresent){
            System.out.println("Element not found");
        }


    }

    public static void iterateSet() {
        Set<String> set = getSet();

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static Set<String> getSet() {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        return set;
    }

    public static void setCreation(){
        Set<String> set = getSet();

        System.out.println(set);
    }
}
