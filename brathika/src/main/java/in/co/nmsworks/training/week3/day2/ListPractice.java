package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice{
    public static void main(String[] args) {
        ListPractice practice = new ListPractice();
        practice.createArrayList();
        List<String> names = new ArrayList<>();
        names.add("Brathu");
        names.add("Amrutha");
        names.add("Rithika");
        names.add("Chintu");
        names.add("Liduu");
        practice.iterateThroughArrayList(names);
        practice.insertElementAtFirst(names);
        practice.getElementAtSpecifiedIndex(names,3);
        practice.updateTheElement(names , 1, "Brathika");
        practice.removeElement(names,3);
        practice.searchForElement(names,"Brathika");
        List<String> names2 = new ArrayList<>();
        names2.add("Ramya");
        names2.add("Keerthana");
        names2.add("Vasu");
        names2.add("Nikesh");
        practice.copyElements(names,names2);
        practice.printReverseElementInArrayList(names);
        practice.compareTwoArrayList(names,names2);
        practice.joinTwoList(names,names2);
    }

    private void joinTwoList(List<String> names, List<String> names2) {
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(names);
        joinedList.addAll(names2);
        System.out.println("List after joining is: "+joinedList);
    }

    private void compareTwoArrayList(List<String> names, List<String> names2) {
        if (names.size() != names2.size()) {
            System.out.println("Two list are not Equal");
        }
        else {
            boolean isEqual = true;
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i) == names2.get(i)) {
                    isEqual = true;
                }
                else {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("Two list are equal");
            }
            else {
                System.out.println("Two are not equal");
            }
        }

    }

    private void printReverseElementInArrayList(List<String> names) {
        System.out.println("List before reversing: "+names);
        List<String> names2 = new ArrayList<>();
        for (int i = names.size() - 1; i > 0; i--) {
            names2.add(names.get(i));
        }
        System.out.println("List after reversing: "+names2);
    }

    private void copyElements(List<String> names, List<String> names2) {
        System.out.println("List before coping: "+names);
        for (String s : names2) {
            names.add(s);
        }
        System.out.println("List after coping: "+names);
    }

    private void searchForElement(List<String> names, String value) {
        if (names.contains(value)) {
            System.out.println(value+" is present at "+names.indexOf(value));
        }
    }

    private void removeElement(List<String> names, int index) {
        System.out.println("List before Removing: "+names);
        names.remove(index);
        System.out.println("List after Removing: "+names);
    }

    private void updateTheElement(List<String> names, int index, String newvalue) {
        System.out.println("List before update: "+names);
        names.set(index,newvalue);
        System.out.println("List after update: "+names);
    }

    private void getElementAtSpecifiedIndex(List<String> names, int number1) {
        System.out.println("Element at the index "+number1+" is "+names.get(number1));
    }

    private void insertElementAtFirst(List<String> names) {
        names.add(0,"Kabi");
        System.out.println(names);
    }

    private void iterateThroughArrayList(List<String> names) {
        System.out.println("Name in the list are: ");
        for (String name : names) {
            System.out.println(name+" ");
        }

    }

    private void createArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Purple");
        System.out.println(colors);
    }

}
