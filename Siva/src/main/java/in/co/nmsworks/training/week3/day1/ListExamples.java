package in.co.nmsworks.training.week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        ListExamples le = new ListExamples();
        List<String> colors = new ArrayList<>();
        le.addColors(colors, new String[]{"Red", "Green", "Yellow", "Blue", "Black"});
        le.printColors(colors);
        le.insertElementIntheFirstPosition(colors,"Violet");
        le.retrieveElementFromParticularIndex(colors,2);
        le.updateValueInTheColors(colors,"Red","White");
        le.removeElementInTheList(colors,3);
        le.elementPresentOrNot(colors,"Black");
        le.copyList(colors);
        le.printElementsInTheReverseOrder(colors);
        le.compareTwoList(colors,colors);
        le.joinTwoArrayList(colors);
    }

    private void joinTwoArrayList(List<String> colors) {
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("OrangeRed");
        colors1.add("Purple");
        colors1.add("Black");
        colors1.add("Blue");
        List<String> allColors = new ArrayList<>();
        allColors.addAll(colors);
        for (String eachColor : colors1) {
            if (!allColors.contains(eachColor))
                allColors.add(eachColor);
        }
        System.out.println("After Merging 2 lists without duplicate");
        for (String allColor : allColors) {
            System.out.println(allColor);
        }
    }

    private void compareTwoList(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            System.out.println("Two List are not Equal");
            return;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                System.out.println("Two List are not Equal");
                return;
            }
        }
        System.out.println("Two List are Equal");
    }

    private void printElementsInTheReverseOrder(List<String> colors) {
        System.out.println("Printing colors in ReverseOrder");
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }

    private void copyList(List<String> colors) {
        List<String> cpyColors = new ArrayList<>();
        cpyColors.addAll(colors);
        System.out.println("After copy from Colors List");
        for (String cpyColor : cpyColors) {
            System.out.println(cpyColor);
        }
    }

    private void elementPresentOrNot(List<String> colors, String color) {
        if (colors.contains(color)) {
            System.out.println(color + " present in the Colors List");
            System.out.println("Index position :: "+colors.indexOf(color));
        }
        else {
            System.out.println(color + " not present in the Colors List");
        }
    }

    private void removeElementInTheList(List<String> colors, int index) {
        if (index >= colors.size()) {
            System.out.println("Current Colors size :: "+colors.size());
            return;
        }
        colors.remove(index);
        System.out.println(index+" index removed sucessfully");
    }

    private void updateValueInTheColors(List<String> colors, String oldValue, String newValue) {
        if (colors.contains(oldValue)) {
            int index = colors.indexOf(oldValue);
            colors.set(index,newValue);
            System.out.println("Update Sucessfully");
            return;
        }
        System.out.println("Oldvalue is not present in the colors List");
    }

    private void retrieveElementFromParticularIndex(List<String> colors, int index) {
        System.out.println("Colors of index "+index+" = "+colors.get(index));
    }

    private void insertElementIntheFirstPosition(List<String> colors, String color) {
        colors.add(1,color);
    }

    private void printColors(List<String> colors) {
        System.out.println("Available Colors :: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private void addColors(List<String> colors, String[] colorString) {
        for (String eachColor : colorString) {
            colors.add(eachColor);
        }
    }
}
