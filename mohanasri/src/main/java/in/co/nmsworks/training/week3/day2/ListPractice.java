package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        ListPractice lp = new ListPractice();
        List<String> colours = new ArrayList<String>();
        List<String> newColour = new ArrayList<>();


        lp.insertColours(colours);
        lp.iterate(colours);
        lp.insertAtFirst(colours, "Brown");
        lp.get(colours, 2);
        lp.update(colours, 2, "Orange");
        lp.remove3rsElement(colours);
        lp.searchElement(colours, "Yellow");
        lp.copyAll(colours, newColour);
        lp.reverseOrder(colours);
        lp.compareTwoArrays(colours, newColour);
        lp.join(colours,newColour);


    }

    private void join(List<String> colours, List<String> newColour) {
        List<String> colour2 = new ArrayList<>();
        colour2.addAll(colours);
        colour2.addAll(newColour);
        System.out.println(colour2);
    }

    private void compareTwoArrays(List<String> colours, List<String> newColour) {
        System.out.println(colours);
        colours.remove("violet");
        colours.remove("indigo");
        colours.remove("Black");
        colours.remove("Red");

        newColour.add(1,"Brown");
        System.out.println(newColour);
        boolean isEqual = false;
        if (colours.size() == newColour.size()){
            for (int i = 0; i < colours.size(); i++){
                if(! (colours.get(i).equals(newColour.get(i)))){
                    isEqual = false;
                    break;
                }
                else {
                    isEqual = true;
                }
            }
        }
        System.out.println("Is Equal ? " + isEqual);

    }

    private void reverseOrder(List<String> colours) {
        for (int i = colours.size()-1;  i > 0; i--){
            System.out.println(colours.get(i));
        }
    }

    private void copyAll(List<String> colours, List<String> newColour) {
        newColour.add("violet");
        newColour.add("Indigo");
        colours.addAll(newColour);
        System.out.println( "Added:" + colours);
    }

    private void searchElement(List<String> colours, String searchElement) {
        System.out.println(colours.contains(searchElement));
    }

    private void remove3rsElement(List<String> colours) {
        System.out.println("Removing 3rd element");
        colours.remove(2);
        System.out.println(colours);

    }

    private void update(List<String> colours, Integer n, String colour) {
        System.out.println("new colours set");
        colours.set(n,colour);
        System.out.println(colour);
    }

    private void get(List colours, Integer index){
        System.out.println(colours.get(index));
    }

    private void insertAtFirst(List<String> colours, String clr) {
        colours.add(0, clr);
        System.out.println(colours);
    }

    private void iterate(List<String> colours) {
        for (String i : colours){
            System.out.println(i);
        }
    }

    private void insertColours(List clr) {
        clr.add("Blue");
        clr.add("Yellow");
        clr.add("Black");
        clr.add("Red");
        System.out.println(clr);
    }
}
