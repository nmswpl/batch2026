package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Blue");
        list2.add("Red");
        list2.add("Green");
        list2.add("WHite");
        list2.add("Black");

        printList(colors);
        iterateAnArrayList(colors);
        insertELementAtFirstPosition(colors);
        retrieveElement(colors, 2);
        updateElement(colors, 2);
        removeElement(colors, 2);
        searchElement(colors, "Black");
        searchElement(colors, "Blue");
        copyList(colors);
        reverseElementsInList(colors);
        compareTwoLists(colors, list2);
        joinTwoLists(colors, list2);
    }

    private static void joinTwoLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        System.out.println("List-1 : " + list1);
        System.out.println("List-2 : " + list2);
        System.out.println("Result : " + result);
    }

    private static void compareTwoLists(List<String> list1, List<String> list2) {
        if(list1.size() != list2.size()) {
            System.out.println("list 1 and list 2 Not equal");
            return;
        }

        for (int i = 0; i < list1.size(); i++) {
            if(!list1.get(i).equals(list2.get(i))) {
                System.out.println("list 1 and list 2 Not equal");
                return;
            }
        }
        System.out.println("list 1 and list 2 are Equal");
    }

    private static void reverseElementsInList(List<String> colors) {
        System.out.println("Original list : " + colors);

        System.out.println("Reversed : ");
        for (int i = colors.size()-1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }

    private static void copyList(List<String> colors) {
        List<String> newColors = new ArrayList<>();
        newColors.add("Black");
        newColors.add("White");

        colors.addAll(newColors);
        System.out.println("New list : " + colors);
    }

    private static void searchElement(List<String> colors, String value) {
        System.out.println("Contains check : " + colors.contains(value));

        for (int index = 0; index < colors.size(); index++) {
            if(colors.get(index).equals(value)) {
                System.out.println(value + " present in index : " + index);
                return;
            }
        }
        System.out.println("Element not present");
    }

    private static void removeElement(List<String> colors, int indexToRemove) {
        System.out.println("Before remove with index: " + colors);
        colors.remove(2);

        System.out.println("After remove with index : " + colors);

        colors.add("Black");

        System.out.println("Before remove with element: " + colors);
        colors.remove("Black");

        System.out.println("After remove with element : " + colors);
    }

    private static void updateElement(List<String> colors, int indexToUpdate) {
        System.out.println("Before update : " + colors);
        colors.set(indexToUpdate, "Black");

        System.out.println("After update : " + colors);
    }

    private static void retrieveElement(List<String> colors, int index) {
        System.out.println("Element at index - " + index + " is : " + colors.get(2));
    }

    private static void insertELementAtFirstPosition(List<String> colors) {
        System.out.println("Before Add : " + colors);

        colors.add(0, "Black");

        System.out.println("After Add : " + colors);
    }

    private static void iterateAnArrayList(List<String> colors) {
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void printList(List<String> colors) {

        System.out.println("Collection : " + colors);
    }
}
