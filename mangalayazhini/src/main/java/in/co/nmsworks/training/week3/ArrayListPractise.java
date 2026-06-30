package in.co.nmsworks.training.week3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {
    public static void main(String[] args) {

        ArrayListPractise obj = new ArrayListPractise();

        List<String> myColors = obj.createStringArray();

        obj.iterateStringArray(myColors) ;
        obj.insertElementToStringArray(myColors,"orange");
        obj.retriveElementFromStringArray(myColors, 2);
        obj.updateElementOfStringArray(myColors,"Yellow","YELLOW");
        obj.removeElementFromStringArray(myColors,3);
        obj.searchElementFromStringArray(myColors,"Blue");
        obj.copyElementsFromOneToAnotherArray();
        obj.reverseElementsOfStringArray(myColors);
        obj.compareTwoLists();
        obj.joinTwoLists();

    }

    private void joinTwoLists() {
        List<String> subjectList1 = new ArrayList<>();
        List<String> subjectList2 = new ArrayList<>();
        List<String> combinedSubjectList = new ArrayList<>();


        subjectList1.add("Maths");
        subjectList1.add("Physics");

        subjectList2.add("C");
        subjectList2.add("C++");

        combinedSubjectList.addAll(subjectList1);
        combinedSubjectList.addAll(subjectList2);

        System.out.println("Joined List : ");
        iterateStringArray(combinedSubjectList);


    }

    private void compareTwoLists() {
        List<String> subjectList1 = new ArrayList<>();
        List<String> subjectList2 = new ArrayList<>();


        subjectList1.add("Maths");
        subjectList1.add("Physics");

        subjectList2.add("Maths");
        subjectList2.add("physics");

        int count = 0 ;
        for (int i = 0; i < subjectList1.size(); i++) {
            if(subjectList1.get(i) == subjectList2.get(i)){
                count++;
            }
        }

        if(count == subjectList1.size()) {
            System.out.println("\nBoth the Lists are equal");
        }
        else{
            System.out.println("\nBoth the Lists are not equal");

        }

    }


    private void reverseElementsOfStringArray(List<String> listArray) {

        System.out.println("Reversed List : ");
        for (int i = listArray.size()-1; i >= 0 ; i--) {
            System.out.print(listArray.get(i) + " ");
        }
    }

    private void copyElementsFromOneToAnotherArray() {
        List<String> subjectList1 = new ArrayList<>();
        List<String> subjectList2 = new ArrayList<>();


        subjectList1.add("Maths");
        subjectList1.add("Physics");

        subjectList2.add("Java");
        subjectList2.add("Python");
        subjectList2.add("C++");
        subjectList2.add("C");



        System.out.println("\nSubjectList 1 : ");
        iterateStringArray(subjectList1);


        System.out.println("\nSubjectList 2 : ");
        iterateStringArray(subjectList2);


        subjectList1.addAll(subjectList2);


        System.out.println("\nSubjectList 1 with SubjectList 2 : ");
        iterateStringArray(subjectList1);




    }

    private boolean searchElementFromStringArray(List<String> listArray, String value) {
        if(listArray.contains(value)) {
            int idx = listArray.indexOf(value);
            System.out.println("The element is present at the index : " + idx);
            return true;
        }
        else{
            System.out.println("Not present");
            return false;

        }
    }

    private void removeElementFromStringArray(List<String> listArray, int idx) {
        listArray.remove(idx);
        System.out.println("\nList after removing the element from index " + idx);
        iterateStringArray(listArray);

    }

    private void updateElementOfStringArray(List<String> listArray,String oldValue, String newValue) {
        int oldIdx = listArray.indexOf(oldValue);
        listArray.set(oldIdx, newValue);

        System.out.println("\nUpdates List : ");
        iterateStringArray(listArray) ;

    }

    private String retriveElementFromStringArray(List<String> listArray, int idx) {
        String element = listArray.get(idx);
        System.out.println("\nThe element at the given index "+ idx + " ::" + element);
        return  element;
    }

    private void insertElementToStringArray(List<String> listArray, String value){
        System.out.println("\nBefore Insertion");
        iterateStringArray(listArray) ;
        listArray.add(0,value);
        System.out.println("\nAfter Insertion");
        iterateStringArray(listArray) ;

    }
    private void iterateStringArray(List<String> listArray) {
        System.out.print("\nString Array Elements : ");
        for (String value : listArray) {
            System.out.print(value + " ");
        }
    }

    private List<String> createStringArray() {
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("Yellow");
        colorsList.add("Blue");
        colorsList.add("White");
        colorsList.add("Black");


//        System.out.print("Colors List : ");
//        for (String color : colorsList) {
//            System.out.print(color + " ");
//        }
        System.out.println("Colors : ");
        iterateStringArray(colorsList) ;

        return colorsList;
    }




}
