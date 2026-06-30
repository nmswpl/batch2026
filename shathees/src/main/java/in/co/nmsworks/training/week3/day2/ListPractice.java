package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("violet");
        colors.add("yellow");
        System.out.println("------------create a array List--------------");
        createArrayList(colors);
        System.out.println("--------------Iterate----------------");
        Iterate(colors);
        System.out.println("-------------Insert At First ----------------");
        insertAtFirst(colors);
        System.out.println("--------------retrive element based on index ---------");
        retriveElement(colors,2);
        System.out.println("----------update-----------");
        update(colors,1);
        System.out.println("-----------remove-----------");
        remove(colors,2);
        System.out.println("-----------search------------");
        searchElement(colors,"pink");
        List<String> names = new ArrayList<>();
        names.add("raju");
        names.add("dhoni");
        System.out.println("-------------------copy-------------");
        copyOfArrayList(colors, names);
        System.out.println("--------------reverse---------------");
        reverseElements(colors);
        List<Character> characters1 = new ArrayList<>();
        characters1.add('a');
        characters1.add('b');
        characters1.add('c');
        List<Character> characters2 = new ArrayList<>();
        characters2.add('a');
        characters2.add('f');
        characters2.add('c');
        System.out.println("----------------compare-----------------");
        compare(characters1, characters2);
        System.out.println("----------------join-------------------");
        joinTwoArrayList(characters1, characters2);



    }

    private static void joinTwoArrayList(List<Character> characters1, List<Character> characters2) {
        for (Character c : characters2) {
            if (!characters1.contains(c)){
                characters1.add(c);
            }
        }
        System.out.println(characters1);
    }

    private static void compare(List<Character> characters1, List<Character> characters2) {
        for (int i = 0; i < characters1.size(); i++) {
            if (characters1.get(i) != characters2.get(i)){
                System.out.println("both list are not equal");
                return;
            }

        }
        System.out.println("Equal");

    }

    private static void reverseElements(List<String> colors) {
        for (int i = colors.size()-1; i >= 0; i--) {
            System.out.println(colors.get(i));

        }
    }

    private static void copyOfArrayList(List<String> colors, List<String> names) {
        colors.addAll(names);
        System.out.println(colors);
    }

    private static void searchElement(List<String> colors,String target) {
        for (String color : colors) {
            if (color.contains(target)){
                System.out.println("The Element found at "+color.indexOf(target));
            }
        }
        System.out.println("The Element Not Found "+ -1);

    }

    private static void remove(List<String> colors,int index) {
        colors.remove(index);
        System.out.println(colors);
    }

    private static void update(List<String> colors,int index) {
        colors.set(index,"pink");
        System.out.println(colors);


    }


    private static void retriveElement(List<String> colors,int index) {
        System.out.println(colors.get(index));

    }

    private static void insertAtFirst(List<String>colors) {
        colors.add(0,"blue");
        System.out.println(colors);

    }

    private static void Iterate(List<String>colors) {
        for (String color : colors) {
            System.out.println(color);

        }

    }

    private static void createArrayList(List<String>colors) {

        System.out.println(colors);

    }
}
