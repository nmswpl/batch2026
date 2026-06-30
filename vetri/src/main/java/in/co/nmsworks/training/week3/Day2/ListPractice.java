package in.co.nmsworks.training.week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {


    public static void main(String[] args) {
        createArrayAndDisply();
        iterateAllElements();
        insertAtPostion(2);
        retrivalfrom(2);
        updateElement();
        removeThirdElement(1);
        searchForAnElement();
        copyOneListToAnother();
        reverseElements();
        compareTwoArrayList();
        joinTwoArrays();

    }

    private static void joinTwoArrays() {

        List<String> colors = getColorsList();
        List<String> names = getNames();
        List<String> result=new ArrayList<>();
        result.addAll(colors);
        result.addAll(names);
        System.out.println("Join of two arrays are:"+result);

    }

    private static void compareTwoArrayList() {
        List<String> colors = getColorsList();
        List<String> names = getNames();

        if(colors.size()!=names.size()){
            System.out.println("Not equal");
            return;
        }
        else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i)!=names.get(i)){
                    System.out.println("Not Equal");
                    return;
                }
            }
            System.out.println("Equal");
        }


    }

    private static List<String> getNames() {
        List<String> names=new ArrayList<>();
        names.add("vetri");
        names.add("selvan");
        names.add("selvan");
        names.add("selvan");
        names.add("selvan");
        return names;
    }

    private static void reverseElements() {
        List<String> colors = getColorsList();
        for (int i = colors.size()-1; i >=0; i--) {
            System.out.println(colors.get(i));
        }

    }

    private static void copyOneListToAnother() {
        List<String> colors = getColorsList();
        names(colors);
        System.out.println("Copy one list to another :"+colors);
    }

    private static void names(List<String> colors) {
        List<String> names=new ArrayList<>();
        names.add("vetri");
        names.add("selvan");
        colors.addAll(names);
    }

    private static void searchForAnElement() {
        List<String> colors = getColorsList();
        System.out.println(colors.contains("indigo"));
        System.out.println(colors.indexOf("indigo"));
    }

    private static List<String> getColorsList() {
        List<String> color = new ArrayList<>();
        color.add("violet");
        color.add("indigo");
        color.add("blue");
        color.add("green");
        color.add("yellow");
        System.out.println("Exisiting elements are: " + color);
        return color;
    }

    private static void removeThirdElement(Integer index) {
        List<String> color = getColorsList();
        color.remove(3);
        System.out.println("After upadate:" + color);

    }

    private static void updateElement() {
        List<String> color = getColorsList();
        color.set(2,"selvan");
        System.out.println("After upadate:" + color);

    }

    private static void retrivalfrom(int index) {
        List<String> color = new ArrayList<>();
        color.add("violet");
        color.add("indigo");
        color.add("blue");
        color.add("green");
        color.add("yellow");

        System.out.println("Retrival from Position :"+color.get(index));
    }

    private static void insertAtPostion(Integer index) {
        List<String> colors = new ArrayList<>();
        colors.add("violet");
        colors.add("indigo");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);
        colors.add(index, "vetri");
        System.out.println("Insert at Position" + colors);
    }

    private static void iterateAllElements() {
        List<String> colors = new ArrayList<>();
        colors.add("violet");
        colors.add("indigo");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);

        //System.out.println(colors);
        for (String cls : colors) {
            System.out.println(cls);
        }
    }

    private static void createArrayAndDisply() {
        List<String> colors = new ArrayList<>();
        colors.add("violet");
        colors.add("indigo");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);

    }
}
