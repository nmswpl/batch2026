package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        addColours();
        iterateArray();
        addColoursAtFirst();
        retrieveElement();
        updateElement();
        removeSpecificElement();
        checkElementPresent();
        copyList();
        reverseArrayElement();
        compareArrays();
        joinArrayList();


    }

    private static void joinArrayList() {
        System.out.println("Join two arrays..");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");

        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Lotus");

        List<String> newList = new ArrayList<>();
        newList.addAll(flowers);
        newList.addAll(colors);

        for (String s : newList) {
            System.out.println(s);
        }


    }

    private static void compareArrays() {
        System.out.println("Compare two arrays..");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");

        List<String> flowers = new ArrayList<>();
        flowers.add("Red");
        flowers.add("Blue");
        flowers.add("Green");
        flowers.add("Black");
//        System.out.println(colors.equals(flowers));

        if (colors.size() != flowers.size()){
            System.out.println("Two list are not equal");
        }
        else {
            boolean equal = true;
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) != flowers.get(i)){
                    equal = false;
                    break;
                }
            }
            if (equal){
                System.out.println("Two list are equal");
            }
            else {
                System.out.println("Two list are not equal");
            }
        }


    }

    private static void reverseArrayElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");

        for (int i = colors.size()-1; i >= 0; i--) {
            System.out.println("Reverse Array List : "+ colors.get(i));
        }
    }

    private static void copyList() {
        System.out.println("Copy Value ......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        List<String> flowers = new ArrayList<>();

        flowers.addAll(colors);
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void checkElementPresent() {
        System.out.println("Contain Value and Print Index .......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Contain Value : "+ colors.contains("Red")+ " Index "+ colors.indexOf("Red"));
    }

    private static void removeSpecificElement() {
        System.out.println("Remove Value  .......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Remove using remove  : " + colors.remove(3));
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void updateElement() {
        System.out.println("Update Value  .......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Update using SET  : " + colors.set(2,"Black"));
        for (String color : colors) {
            System.out.println(color);
        }

    }

    private static void retrieveElement() {
        System.out.println("Retrieve  .......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Retrieve using GET  : " + colors.get(2));
    }

    private static void addColoursAtFirst() {

        System.out.println("Add First .......");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        colors.add(0,"Yellow");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void iterateArray() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void addColours() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
    }
}
