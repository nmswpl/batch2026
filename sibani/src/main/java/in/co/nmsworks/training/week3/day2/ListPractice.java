package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    private static Object rainbow;

    public static void main(String[] args) {
        ListPractice listPractice = new ListPractice();
        listPractice.printArrayList();
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        listPractice.iterateList(colors);
        listPractice.insertIntoFirstPos(colors);
        listPractice.retrieveElementFromList(colors, 1);
        listPractice.updateElement(colors, 1, "Green");
        colors.add("Green");
        colors.add("Pink");
        listPractice.removeElement(colors, 3);
        listPractice.searchForElement(colors, "Pink");
        List<String> rainbow = new ArrayList<>();
        listPractice.copyList(colors, rainbow);
        listPractice.reverseList(colors);
        listPractice.compareTwoList(colors, rainbow);
        listPractice.joinTwoArray(colors,rainbow);

    }

    private void joinTwoArray(List<String> colors, List<String> rainbow) {
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(colors);
        joinedList.addAll(rainbow);
        System.out.println("Joined Array List : " + joinedList.toString());
    }

    private void reverseList(List<String> colors) {
        System.out.println();
        System.out.println("Reversed List Elemnts");
        for (int i = colors.size()- 1; i >=0 ; i--) {
            System.out.println(colors.get(i));
        }
    }

    private void compareTwoList(List<String> colors, List<String> rainbow) {
        int count = 0;
        if (colors.size() != rainbow.size()) {
            System.out.println("Compare Strings of Equal Length");
        }
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i) == rainbow.get(i)) {
                count++;
            }
        }
        if (count == colors.size()) {
            System.out.println("Two List are equal");
        }
        else {
            System.out.println("Two list are not Equal");
        }

    }

    private void copyList(List<String> colors, List<String> rainbow) {
        rainbow.addAll(colors);
        System.out.println("Copied List Elements: ");
        for (String s : rainbow) {
            System.out.println(s);
        }
    }

    private void searchForElement(List<String> colors, String string) {
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i) == string) {
                System.out.println("Element Found at index : " + i);
                break;
            }
            else {
                System.out.println("Element not found");
            }
        }

    }

    private void removeElement(List<String> colors, Integer i) {
        System.out.println("Elemnt Removed : " + colors.remove(i));
    }

    private void updateElement(List<String> colors, Integer i, String newval) {
        System.out.println("Element Updated : " + colors.set(i, newval));
    }

    private void retrieveElementFromList(List<String> colors, Integer i) {
        System.out.println("Element at 2nd Position : " + colors.get(i));

    }

    private void insertIntoFirstPos(List<String> colors) {

        colors.add(0, "Orange");
        System.out.println("List Elements");
        System.out.println(colors.toString());

    }

    private void iterateList(List<String> colors) {

        System.out.println("List Elements");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private void printArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        System.out.println("List Elements");
        System.out.println(colors.toString());
    }

}
