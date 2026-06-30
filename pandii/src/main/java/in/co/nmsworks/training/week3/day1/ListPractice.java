package in.co.nmsworks.training.week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();

        addColors(colors);

        printList(colors);      //1 2

        addColorAtfirst(colors);        //3

        System.out.println("Element at index");
        retriveAtIndex(colors,6);       //4
        
        replaceElement(colors);             //5
        System.out.println("After replace red ");
        printList(colors);

        colors.remove(3);           //6
        System.out.println("After removing the element at 3");
        printList(colors);

        System.out.println("Search element index ");
        searchElement(colors,"Violet");         //7


        reverseList(colors);            //8

        List<String> list=new ArrayList<>();
        list.addAll(colors);
        System.out.println("After copy");
        printList(list);


        List <String> colorsNew=new ArrayList<>();
        colorsNew.add("Purple");
        colorsNew.add("Grey");
        colorsNew.add("Brown");
        colorsNew.add("Black");

        checkTwoLists(colors, colorsNew);       //9

        colorsNew.addAll(colors);           //11
        System.out.println("Join two list");
        printList(colors);


    }

    private static void addColors(List<String> colors) {
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");
    }

    private static void checkTwoLists(List<String> colors, List<String> colorsNew) {
        if(colors.equals(colorsNew))
        {
            System.out.println("Same list");
        }
        else {
            System.out.println("Not Same list");
        }
    }

    private static void reverseList(List<String> colors) {
        System.out.println("Reverse of List colors ");
        for (int i = colors.size()-1; i >= 0; i--) {
            System.out.print(colors.get(i)+" ");
        }
        System.out.println();
    }

    private static void searchElement(List<String> colors,String color) {
        System.out.println(colors.indexOf(color));
    }

    private static String replaceElement(List<String> colors) {
        return colors.set(7, "RED");
    }

    private static void retriveAtIndex(List<String> colors,Integer ind) {
        System.out.println(colors.get(ind));
    }

    private static void addColorAtfirst(List<String> colors) {
        colors.add(0,"Pink");
        printList(colors);
    }

    private static void printList(List<String> colors) {
        for (String color : colors) {
            System.out.print(color+" ");
        }
        System.out.println();
    }
}
