package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> mainList = new ArrayList<>();
        mainList.add("One");
        mainList.add("Two");
        mainList.add("Three");
        mainList.add("Four");

        List<String> backupList = new ArrayList<>();
        backupList.add("One");
        backupList.add("Two");
        backupList.add("three");
        backupList.add("Four");

        printingColors();
        iterateElements(mainList);
        insertAtFirstIndex(mainList);
        retrieveElementFromindex(mainList, 2);
        updateElementInIndex(mainList, 3, "New Three");
        removeSpecificElement(mainList, 4);
        searchAndReturnIndex(mainList, "Two");
        copyTwoList(mainList);
        printElementInReverse(mainList);
        compareTwoArrayLists(mainList, backupList);
        addTwoListToNewList(mainList,backupList);
    }

    private static void addTwoListToNewList(List<String> listOne, List<String> listTwo) {
        List<String> listThree = new ArrayList<>();
        listThree.addAll(listOne);
        listThree.addAll(listTwo);
        System.out.println(listThree);
        System.out.println("___________________________________________");
    }

    private static void compareTwoArrayLists(List<String> listOne, List<String> listTwo) {
        boolean isEqual = false;
        if(listOne.size() != listTwo.size()){
            System.out.println("The given List are different sizes");
        }
        for (int i = 0; i < listOne.size(); i++) {
            if(listOne.get(i).equals(listTwo.get(i))){
                isEqual = true;
            }
            else {
                isEqual = false;
            }
        }
        if(isEqual){
            System.out.println("the given lists are equal");
        }
        else {
            System.out.println("the given lists are not equal");
        }
        System.out.println("_______________________________________");
    }

    private static void printElementInReverse(List<String> inputList) {
        for (int i = inputList.size()-1; i > 0; i--) {
            System.out.println(inputList.get(i));
        }
        System.out.println("_________________________________________");
    }

    private static void copyTwoList(List<String> inputList) {
        List<String> newList = new ArrayList<>();
        newList.addAll(inputList);
        for (String s : newList){
            System.out.println(s);
        }
        System.out.println("_______________________________________________");

    }

    private static void searchAndReturnIndex(List<String> inputList, String element) {
            if(inputList.contains(element)){

                    System.out.println("The Element " + element + " is in the index of :: " + inputList.indexOf(element));
                }
            else {
                System.out.println("The given element is not present");
            }
        System.out.println("__________________________________________");
    }

    private static void removeSpecificElement(List<String> inputList, int index) {
        inputList.remove(index);
        for (String s : inputList){
            System.out.println(s);
        }
        System.out.println("_______________________________________");
    }

    private static void updateElementInIndex(List<String> inputList, Integer i, String inputString) {
        inputList.set(i,inputString);
        for (String s : inputList){
            System.out.println(s);
        }
        System.out.println("_____________________________________________");
    }

    private static void retrieveElementFromindex(List<String> inputList, Integer index) {
        System.out.println(inputList.get(index));
        System.out.println("___________________________________________");
    }

    private static void insertAtFirstIndex(List<String> inputList) {
        inputList.add(0,"Zero");
        for (String s : inputList){
            System.out.println(s);
        }
        System.out.println("______________________________________");
    }

    private static void iterateElements(List<String> inputList) {
        for (String s : inputList){
            System.out.println(s);
        }
        System.out.println("______________________________________");
    }

    private static void printingColors() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors);
        System.out.println("_______________________________________________");
    }
}
