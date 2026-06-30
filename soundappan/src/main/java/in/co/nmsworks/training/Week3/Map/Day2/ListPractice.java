package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void addColor(List<String>list){
        list.add("Red");
        list.add("Blue");
        list.add("White");
    }
    public static void printList(List<String>list){
    for(String val:list){
        System.out.println(val);
    }
    }
    public static void addElementAtFirst(List<String>list){
        list.add(0,"Black");
        System.out.println(list);
    }
    public static void retrieveAtIndex(List<String>list){
        System.out.println(list.get(1));
    }
public static void updateAnList(List<String>list){
        list.set(1,"Green");
    System.out.println(list);
}
public static void removeAnElement(List<String>list){
        list.remove(3);
        System.out.println(list);
}
public static void searchAnElement(List<String>list,String val){
        for (String name:list){
            if(name.equals(val)){
                System.out.println("The Element Present in the List");
            }
            else{
                System.out.println("Not Present");
            }
        }
}
public static void copyAnList(List<String>list,List<String>list2){
        list.addAll(list2);
    System.out.println(list2);
}
public static void reverseAnElement(List<String>list) {
    for (int i = list.size() - 1; i >= 0; i--) {
        System.out.print(list.get(i) + " ");
    }
}
public static void compareList(List<String>list,List<String>list2){
        boolean value=true;
        if(list.size()!=list2.size()){
            System.out.println("List is not equal");
        }
        for(String val:list) {
            if (!list2.contains(val)) {
                System.out.println("List is not Equal");
                value=false;
            }
        }
    System.out.println(value);
}
public static void joinTwoList(List<String>list,List<String>list2){
        list.addAll(list2);
        System.out.println(list);
}


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        list2.add("Red");
        list2.add("Blue");
        list2.add("White");
        addColor(list);
        System.out.print("Print out the collection");
        printList(list);
        System.out.println("Set Index at first");
        addElementAtFirst(list);
        System.out.println("Retrieve At Index");
        retrieveAtIndex(list);
        System.out.println("Update An list");
        updateAnList(list);
        System.out.println();
        removeAnElement(list);
        System.out.println();
        copyAnList(list,list2);
        searchAnElement(list,"Green");
        reverseAnElement(list);
        compareList(list,list2);
        joinTwoList(list,list2);
    }
}
