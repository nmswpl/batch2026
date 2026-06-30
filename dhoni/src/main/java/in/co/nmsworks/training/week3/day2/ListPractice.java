package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        List<String> colors2 = new ArrayList<>();
        colors2.add("orange");
        colors2.add("pink");
        colors2.add("Navy blue");
        colors2.add("violet");

        List<String> temp = new ArrayList<>();

        printList(colors);
        iterateElements(colors);
        insertAtFirst(colors, new String("white"));
        retrieveElementByIndex(2, colors);
        updateElement(2,"white",colors);
        removeThirdElement(colors);
        searchElement("orange",colors);
        copyList(colors,colors2);
        printReverseElements(colors);
        compareTwoList(colors,colors2);
        joinTwoList(colors,colors2,temp);

    }

    private static void joinTwoList(List<String> list, List<String> list2, List<String> temp) {
        System.out.println("list1 : " + list);
        System.out.println("list2 : " + list2);
        temp.addAll(list);
        temp.addAll(list2);
        System.out.println("list3 : " + temp);
    }

    private static void compareTwoList(List<String> colors, List<String> colors2) {
        if(colors.size() != colors2.size()){
            System.out.println("Not equal");
            return;
        }

        for(int i = 0; i < colors.size(); i++){
            if(colors.get(i).equals(colors2.get(i))){
                System.out.println("Not equal");
                return;
            }
        }
        System.out.println("Lists are equal");
    }

    private static void printReverseElements(List<String> colors) {

        System.out.println("Reverse print : ");
        System.out.println(colors);
        System.out.println();
        for (int i = colors.size()-1; i >= 0; i--){
            System.out.println(colors.get(i));
        }
    }

    private static void copyList(List<String> colors, List<String> colors2) {
        System.out.println("colors 1 : " + colors);
        System.out.println("colors 2 : " + colors2);
        colors.addAll(colors2);
        System.out.println("colors 1 after copy : " + colors);
    }

    private static void searchElement(String key, List<String> colors) {
        for (String color : colors) {
            if (key.equals(color)) {
                System.out.println("Found : " + key);
                return;
            }
        }
        System.out.println("Not found : " + key);
    }

    private static void removeThirdElement(List<String> colors) {
        if(colors.size() < 3){
            System.out.println("Invalid size is less than 3");
            return;
        }
        System.out.println(colors);
        System.out.println("third element before " + colors.get(2));
        colors.remove(2);
        System.out.println("third  element after " + colors.get(2));
    }

    private static void updateElement(int index, String color, List<String> colors) {
        System.out.println("before : " + colors.get(index));
        colors.set(index,color);
        System.out.println("after : " + colors.get(index));
    }

    private static void retrieveElementByIndex(int index, List<String> colors) {
        System.out.println("element at index " + index + " : " + colors.get(index));
    }

    private static void insertAtFirst(List<String> colors, String element) {
        colors.add(0,element);
        System.out.println("color index 0 : " +colors.get(0));
    }

    static void iterateElements(List<String> colors) {
        System.out.println("iterate Elements");
        for (String color : colors){
            System.out.println(color);
        }
    }

    private static void printList(List<String> colors) {
        System.out.println(colors);
    }


}
