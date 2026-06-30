package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void addFruitNameSet(Set<String>val){
        val.add("Apple");
        val.add("Orange");
        val.add("Mango");
        System.out.println(val);
    }
    public static void iterateToAllElement(Set<String>val){
        for(String fruit:val){
            System.out.println(fruit);
        }
    }
    public static void checkSpecificCity(Set<String>val){
        System.out.println(val.contains("Apple"));
    }
    public static void copyOneSet(Set<String>val){
        Set<String>set2=new HashSet<>();
        val.addAll(set2);
        System.out.println(set2);
    }
    public static void containsAllElement(Set<String>val,Set<String>val1){
        System.out.println(val.containsAll(val1));
    }
    public static void removeSpecificElement(Set<String>val){
        val.remove("Mango");
        System.out.println(val);
    }


    public static void main(String[] args) {
     Set<String>val=new HashSet<>();
     Set<String>val1=new HashSet<>();
     addFruitNameSet(val);
        System.out.println();
     iterateToAllElement(val);
        System.out.println();
     checkSpecificCity(val);
        System.out.println();
        copyOneSet(val);
        System.out.println();
        containsAllElement(val,val1);
        System.out.println();
        removeSpecificElement(val);


    }
}
