package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("Blue");
        colors.add("Black");
        System.out.println(colors);

        printArrayList(colors);

        colors.add(0, "White");
        System.out.println(colors);

        int index = 3;
        System.out.println("At index "  + index + ": " + colors.get(index));

        String color = "Teal";
        colors.set(index, color);
        System.out.println(colors);

        colors.remove(index);
        System.out.println("After deleting element at index 3: " + colors);

        searchAndPrintIndex(colors, "Green");
        searchAndPrintIndex(colors, "Orange");

        List<String> colors2 = new ArrayList<>(2);
        colors2.add("Orange");
        colors2.add("Yellow");

        copyArrayList(colors, colors2);
        System.out.println("Updated colors list after joining: " + colors);

        printReverseList(colors);

        compareArray(colors, colors2);
        compareArray(colors, colors);

        List<String> colors3 = new ArrayList<>(2);
        colors3.add("Grey");
        colors3.add("Brown");

        List<String> newColors = joinArrays(colors, colors3);
        System.out.println("New array list after joining: " + newColors);

    }

    private static void printArrayList(List<String> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    private static void searchAndPrintIndex(List<String> arrayList, String value){
        if (arrayList.contains(value)){
            System.out.println("Element " + value + " is present. Index is: " + arrayList.indexOf(value));
        } else {
            System.out.println("Element not found");
        }
    }

    private static void copyArrayList(List<String> list1, List<String> list2){
        list1.addAll(list2);
    }

    private static void printReverseList(List<String> list){
        System.out.print("Reverse array list: ");
        for (int i = list.size()-1; i >-0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static void compareArray(List<String> list1, List<String> list2){
        if (list1.size() == list2.size()){
            for (int i = 0; i < list1.size(); i++){
                if (!(list1.get(i).equals(list2.get(i)))) {
                    System.out.println("Not equal");
                    return;
                }
            }
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    private static List<String> joinArrays(List<String> list1, List<String>list2){
        List<String> newList = new ArrayList<>(list1.size()+list2.size());
        newList.addAll(list1);
        newList.addAll(list2);
        return newList;
    }



}
