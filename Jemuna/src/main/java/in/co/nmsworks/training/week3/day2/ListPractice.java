package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.ArrayUtils.removeElement;

public class ListPractice {
    public static void main(String[] args) {
        arrayListCreation();
        iterateAllElements();
        insertElementFirst();
        retrieveElement();
        updateElement();
        removeElement();
        searchElement();
        copyArray();
        compareList();
        addList();
        reverseElements();


    }

    private static void reverseElements() {
        List<String> list = arrayListCreation();
        System.out.println("Printing List 2 in reverse :");
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }


    }

    private static void addList() {
        List<String> list = arrayListCreation();
        List<String> list2 = arrayListCreation();
        System.out.println("Adding List 1 and 3 :"+ list.addAll(list2));

    }

    private static void compareList() {
        List<String> list = arrayListCreation();
        System.out.println("Actual List Is   :: " + list);
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("Comparing two List :"+list.containsAll(list2));
    }

    private static void copyArray() {
        List<String> list = arrayListCreation();
        List<String> list2 = new ArrayList<>();
        System.out.println("Before copying List 1: "+list);
        System.out.println("Before copying List 2: "+list2);
        list2.addAll(list);
        System.out.println("After copying List 2: "+list2);

    }

    private static void searchElement() {
        List<String> list = arrayListCreation();
        System.out.println("Searching an element in an Array :");
        int indexValue = 0;
        System.out.println("list"+list);
        for (String colors : list) {
            if(colors.equals("Violet")){
                indexValue = list.indexOf(colors);
            }
        }
        if (indexValue>=0){
            System.out.println("Element found at index : "+ indexValue);

        }
        else{
            System.out.println("Element not found");
        }

    }

    private static void removeElement() {
        List<String> list = arrayListCreation();
        System.out.println("Remove the element at 3rd position : "+list.remove(3));
    }

    private static void updateElement() {
        List<String> list = arrayListCreation();
        System.out.println("Updating the element at 0th position : "+list.set(0,"Ivory"));

    }

    private static void retrieveElement() {
        List<String> list = arrayListCreation();
        System.out.println("Retrieving the element at 0th position : "+list.get(0));
    }

    private static void insertElementFirst() {
        List<String> list = arrayListCreation();
        String insert = list.set(0,"Purple");
        System.out.println("Insert into the First position of the Collection: "+ insert);

    }

    private static void iterateAllElements() {
        List<String> list = new ArrayList<>();
        list.add("Violet");
        list.add("Indigo");
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Yellow");
        System.out.println("Iterating over the Array List : ");
        for (String colors : list) {
            System.out.println(colors);

        }


    }

    private static List<String> arrayListCreation() {
        List<String> list = new ArrayList<>();
        list.add("Violet");
        list.add("Indigo");
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Yellow");
        return list;
    }
}
