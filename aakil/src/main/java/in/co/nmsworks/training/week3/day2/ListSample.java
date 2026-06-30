package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListSample{
    public static void main(String[] args) {
        colorList();
        iterateList();

        List<String> names = new ArrayList<>();
        List<String> boys = new ArrayList<>();
        boys.add("Aakil Ahamed");
        names.add("FArhann");
        names.add("Sathish");
        names.add("MAx");
        names.add("Dhoni");
        String element1 = "Aakil";
        String element2 = "Ahamed";
        int index = 1;

        insertAtFirst(names, element1);
        getElement(names, index);
        updateElement(names, index, "Ram");
        removeThirdElement(names);
        searchList(names, element1);
        copyInto(names, boys);
        reversePrinter(names);
        compareLists(names, boys);
        joinLists(names, boys);
    }

    private static void joinLists(List<String> listOne, List<String> listTwo) {
        List<String> result = new ArrayList<>();
        result.addAll(listOne);

        for (String ele : listTwo) {
            if(!result.contains(ele))
                result.add(ele);
        }

        System.out.println("JOINED LISTS :: " + result);
    }

    private static void compareLists(List<String> listOne, List<String> listTwo) {
        if(listOne.size() != listTwo.size()){
            System.out.println("NOT EQUAL");
            return;
        }
        for (int i = 0; i < listOne.size(); i++) {
            if(!Objects.equals(listOne.get(i), listTwo.get(i))){
                System.out.println("NOT EQUAL");
                return;
            }
        }
        System.out.println("EQUAL");
    }

    private static void reversePrinter(List<String> list) {
        System.out.println("REVERSED :: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    private static void copyInto(List<String> source, List<String> dest) {
        System.out.println("SOURCE :: " + source);
        System.out.println("DESTINATION :: " + dest);
        dest.addAll(source);
        System.out.println("COPIED INTO DESTINATION:: " + dest);
    }

    private static void searchList(List<String> list, String target) {
        System.out.println((list.contains(target)) ? "FOUND @ " + list.indexOf(target) : "NOT FOUND");
    }

    private static void removeThirdElement(List<String> list) {
        list.remove(3);
        System.out.println("REMOVED 3RD INDEX : " + list);
    }

    private static void updateElement(List<String> list, int index, String element) {
        list.set(index, element);
        System.out.println("UPDATED @ " + index + " : " + list);
    }

    private static void getElement(List<String> list, int index) {
        System.out.println("ELEMENT @ " + index + " : " + list.get(index));;
    }

    private static void insertAtFirst(List<String> list, String element) {
        list.add(0, element);
        System.out.println("INSERT AT 1ST :: " + list);
    }

    private static void iterateList() {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("REd");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("-----");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("-----------------");

    }

    private static void colorList() {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("REd");

        System.out.println(colors);
        System.out.println("-----------------");

    }
}
