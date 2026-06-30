package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        addMethod();
        iterateList();
        insertFirst();
        retrieveSpecifiedIndexElemement();
        updateElement();
        removeThirdElement();
        searchElement();
        copyList();
        reverseList();
        compareList();
        joinList();

    }

    public static void joinList() {
        List<String> list1 = new ArrayList<>();

        list1.add("red");
        list1.add("purple");
        list1.add("green");
        System.out.println("List1: " + list1);

        List<String> list2 = new ArrayList<>();

        list2.add("orange");
        list2.add("blue");
        list2.add("green");
        System.out.println("List2: " + list2);

        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("List3: " + list3);


    }

    public static void compareList() {
        System.out.println("Compare");
        List<String> list1 = new ArrayList<>();

        list1.add("red");
        list1.add("purple");
        list1.add("green");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();

        list2.add("red");
        list2.add("purple");
        list2.add("red");
        list2.add("white");
        System.out.println(list2);

        boolean isEqualList = true;

        if(list1.size() != list2.size()){
            System.out.println("Not same list");
            return;
        }
        else{
            for (int i = 0; i < list1.size(); i++) {

                if(list1.get(i).equals(list2.get(i))){
                    isEqualList = true;
                }
                else{
                    isEqualList=false;
                    break;
                }
            }
        }
        if(isEqualList){
            System.out.println("same list");
        }
        else {
            System.out.println("Not same list");
        }
    }

    public static void reverseList() {
        List<String> list = new ArrayList<>();
        System.out.println("reverse...");
        list.add("red");
        list.add("purple");
        list.add("green");
        System.out.println(list);
        System.out.println("Reversed...");

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }

    }

    public static void copyList() {
        List<String> list1 = new ArrayList<>();

        list1.add("red");
        list1.add("purple");
        list1.add("green");
        System.out.println("List1: " + list1);

        List<String> list2 = new ArrayList<>(list1);
        System.out.println("List2: " + list2);
    }

    public static void searchElement() {
        System.out.println("searching");
        List<String> list = new ArrayList<>();

        list.add("red");
        list.add("purple");
        list.add("green");
        System.out.println(list);

        String search = "green";
        boolean isPresent = false;
        for (String s : list) {
            if(s.equals(search)){
                System.out.println(s + "present at index:" + list.indexOf(s));
                isPresent=true;
                break;
            }

        }
        if(!isPresent){
            System.out.println(search + " not present");
        }
    }

    public static void removeThirdElement() {
        List<String> list = new ArrayList<>();
        System.out.println("Remove third element:");
        list.add("red");
        list.add("purple");
        list.add("green");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }

    public static void updateElement() {
        List<String> list = new ArrayList<>();
        System.out.println("update element");
        list.add("red");
        list.add("purple");
        list.add("green");
        System.out.println(list);
        list.set(1,"Blue");
        System.out.println(list);
    }

    public static void retrieveSpecifiedIndexElemement() {
        List<String> list = new ArrayList<>();

        list.add("red");
        list.add("purple");
        list.add("green");
        System.out.println(list);
        System.out.println("2nd index: " + list.get(2));
    }

    public static void addMethod(){
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Blue");
        System.out.println(list);

    }
    public static void iterateList(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("purple");
        list.add("green");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void insertFirst(){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("purple");
        list.add("green");
        list.add(0,"Brown");

        System.out.println(list);
    }
}
