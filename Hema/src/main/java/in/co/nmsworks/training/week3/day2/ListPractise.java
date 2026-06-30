package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        System.out.println(colors);
//        createArrayList();
        iterateList(colors);
        insertElement(colors, "Orange", 1);
        retrieveElement(colors, 5);
        updateElement(colors, "Red", "Pink");

        removeElement(colors , 3);
        searchElement(colors, "Orange");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        copyLists(colors, fruits);
        reverseList(colors);

        compareLists(colors,fruits);

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");

        compareLists(fruits, fruits2);

        joinLists(colors, fruits);
    }

    private static void joinLists(List<String> list1, List<String> list2) {
        List<String> newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        System.out.println(newList);
    }

    private static void compareLists(List<String> list1, List<String> list2) {
        if(list1.size() != list2.size())
        {
            System.out.println("Not equal!");
            return;
        }

        for (int i = 0; i < list1.size(); i++) {
            if( list1.get(i) != list2.get(i))
            {
                System.out.println("Not equal!");
                return;
            }
        }
        System.out.println("Equal!");
    }

    private static void reverseList(List<String> list) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i)+ ", ");
        }
        System.out.println();
    }

    private static void copyLists(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println(list1);
    }

    private static void searchElement(List<String> list, String element) {
        if( !list. contains(element))
        {
            System.out.println("Element not found");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if( list.get(i) == element)
            {
                System.out.println("Index = "+ i);
            }
        }
    }

    private static void removeElement(List<String> list, int index) {
        System.out.println(list.remove(index));
        System.out.println(list);
    }

    private static void updateElement(List<String> list, String oldElement, String newElement) {
        if(list.contains(oldElement))
        {
            list.set(list.indexOf(oldElement), newElement);
        }

        System.out.println(list);
    }

    private static void retrieveElement(List<String> list, int index) {
        System.out.println(list.get(index));
    }

    private static void insertElement(List<String> list, String element, int index) {
        list.add(index,element);
        System.out.println(list);
    }

    private static void iterateList(List list) {
        for (Object object : list) {
            System.out.print(object+" , ");
        }
        System.out.println();
    }

//    private static void createArrayList() {
//        List<String> colors = new ArrayList<>();
//        colors.add("White");
//        colors.add("Black");
//        colors.add("Blue");
//        colors.add("Red");
//        colors.add("Yellow");
//
//        System.out.println(colors);
//    }
}
