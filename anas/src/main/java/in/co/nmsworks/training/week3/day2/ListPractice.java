package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListPractice {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("green");
        colors.add("blue");

        List<String> colors2 = new ArrayList<>();
        colors.add("red");
        colors.add("purple");
        colors.add("violet");
        colors.add("green");

        arrayListCreation(colors);
        iterationList(colors);
        insertAtFirst(colors);
        getElementAtIndex(colors);
        updateElement(colors);
        removeElementAtIndex(colors);
        containsElement(colors);
        copyOneListToOther(colors,colors2);
        reverseElement(colors);
        checkTwoListsEqual(colors,colors2);
        joinTwoList(colors,colors2);
    }

    private static void joinTwoList(List<String> colors, List<String> colors2) {
        List<String> colorsnew = new ArrayList<>();
        colorsnew.addAll(colors);
        colorsnew.addAll(colors2);
        System.out.println("after joining two lists without duplicates : " + colorsnew);
    }

    private static void checkTwoListsEqual(List<String> colors, List<String> colors2) {
        System.out.println("list colors contains all elements of colors2 : " + colors.containsAll(colors2));
    }

    private static void reverseElement(List<String> colors) {
        System.out.println("reverse of list : ");
        for (int i = colors.size() - 1; i <= 0; i--) {
            System.out.println(colors.get(i));
        }
    }

    private static void copyOneListToOther(List<String> colors, List<String> colors2) {
        colors.addAll(colors2);
        System.out.println("after copying one list to another : " + colors);
    }

    private static void containsElement(List<String> colors) {
        String color = "blue";
        if (colors.contains(color)){
            System.out.println("index of the color : " + colors.indexOf(color));
        }
        else{
            System.out.println("no color found");
        }
    }

    private static void updateElement(List<String> colors) {
        colors.set(1,"orange");
        System.out.println("after replacing : " + colors);
    }

    private static void removeElementAtIndex(List<String> colors) {
        Integer ind = 2;
        colors.remove(ind);
        System.out.println("after removal of element at pos : " + colors);
    }

    private static void getElementAtIndex(List<String> colors) {
        Integer ind = 3;
        System.out.println("color at index " + 3 + " :" + colors.get(ind));
    }

    private static void insertAtFirst(List<String> colors) {
        colors.add(0,"yellow");
        System.out.println("after adding element at first : " + colors);
    }

    private static void iterationList(List<String> colors) {
        System.out.println("interation of list : ");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void arrayListCreation(List<String> colors) {
        System.out.println("elements in array list : ");
        System.out.println(colors);
    }
}
