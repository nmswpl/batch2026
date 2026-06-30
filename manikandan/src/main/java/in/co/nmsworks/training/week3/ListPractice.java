package in.co.nmsworks.training.week3;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {


    public static void main(String[] args) {

        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        addColor();//1
        iterateElements();//2
        insertAtfirst();//3
        retrieveElement();//4
        updateAnArray();//5
        removeElement();//6
        searchElement();//7
        copyList();//8
        reverseElements();//9
        compareTwoArrays();//10
        jointwoArrayLists();//11



    }

    private static void jointwoArrayLists() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        List<String>rgb = new ArrayList<>();
        rgb.add("RED");
        rgb.add("GREEN");
        rgb.add("BROWN");

        List<String> newlist = new ArrayList<>();
        newlist.addAll(colors);
        newlist.addAll(rgb);
        System.out.println("11.Join Two ArrayList");
        System.out.println(newlist);
    }

    private static void compareTwoArrays() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        List<String>rgb = new ArrayList<>();
        rgb.add("RED");
        rgb.add("GREEN");
        rgb.add("BROWN");

        System.out.println("10.COMPARE TWO ARRAYS");

        System.out.println(colors.equals(rgb));
    }

    private static void reverseElements() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");
        System.out.println("9.REVERSE ELEMENTS ");
        for(int i=colors.size()-1;i>=0;i--){
            System.out.println(colors.get(i));
        }

    }

    private static void copyList() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        List<String>rgb = new ArrayList<>();
        rgb.add("RED");
        rgb.add("GREEN");
        rgb.add("BROWN");
        System.out.println("8.ADD COLORS ");
        System.out.println(colors.addAll(rgb));
    }

    private static void searchElement() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");
        System.out.println("7.SEARCH FOR ELEMENTS ");
        System.out.println(colors.contains("VIOLET"));
    }

    private static void removeElement() {
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        colors.remove(2);
        System.out.println("6.REMOVE AN ELEMENT ");
        for (String color : colors) {
            System.out.println(color);

        }
    }

    private static void updateAnArray() {

        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        colors.set(0,"WHITE");
        System.out.println("5.UPDATE ELEMENT ");
        for (String i : colors){
            System.out.println(i);
        }

    }

    private static void retrieveElement() {


        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");
        System.out.println("4.RETRIEVE AT SPECIFIC INDEX :");
        System.out.println(colors.get(0));
    }

    static void addColor(){

       List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");
       System.out.println("1.ADD COLORS ");
       System.out.println(colors.get(0));

    }

    static void iterateElements(){
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");
        System.out.println("2.ITERATE ALL ");
        for (String i : colors){
            System.out.println(i);
        }
    }

    static void insertAtfirst(){
        List<String>colors = new ArrayList<>();
        colors.add("BLACK");
        colors.add("VIOLET");
        colors.add("BLUE");

        colors.add(0,"WHITE");
        System.out.println("3.INSERT AT FIRST ");
        for (String i : colors){
            System.out.println(i);
        }

    }

}
