package in.co.nmsworks.training.week3.Day2;

import java.util.*;

public class RunnerCollection {
    public static void main(String[] args) {
//        listMethod();
//        setMethod();
        mapMethod();
    }

    private static void mapMethod() {
        MapPractice studentOne = new MapPractice(1, "TamilSelvan");
        MapPractice studentTwo = new MapPractice(2, "Anushri");
        MapPractice studentThree = new MapPractice(3, "Vijaya Shree");
        MapPractice studentFour = new MapPractice(4, "Gopi");

        Map<Integer,String> mapPractic = new HashMap<>();

        mapPractic.put(studentOne.getStudendId(),studentOne.getStudentName());
        mapPractic.put(studentTwo.getStudendId(),studentTwo.getStudentName());
        mapPractic.put(studentThree.getStudendId(),studentThree.getStudentName());
        mapPractic.put(studentFour.getStudendId() ,studentFour.getStudentName());

        for (Integer i : mapPractic.keySet()) {
            String studentName = mapPractic.get(i);
            System.out.println("student id: " + i + " and student name: " + studentName);
        }

        System.out.println();
        System.out.println("iterate through all the key-value pairs in a map.");
        Set<Map.Entry<Integer,String>> studentEntrySet = mapPractic.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : studentEntrySet) {
            System.out.print("map key : " + integerStringEntry.getKey() +" ");
            System.out.print("map value : "  +integerStringEntry.getValue());
            System.out.println();
        }

        System.out.println();
        System.out.println("search for a specific key in a map.");
        int searchKey =1;
        if(mapPractic.containsKey(searchKey)){
            System.out.println("key"+ searchKey + " id: " + mapPractic.get(searchKey));
        }
        else{
            System.out.println("not found---");
        }

        System.out.println();
        System.out.println("search for a specific value in a map.");
        String searchvalue = "Anushri";
        if(mapPractic.containsValue(searchvalue)){
            System.out.println("Value: " + searchvalue + " " + " found");
        }
        else{
            System.out.println("not found---");
        }


        System.out.println();

        System.out.println("copy of one map into another map.");
        Map<Integer,String> copymapPractic = new HashMap<>();

        MapPractice studentFive = new MapPractice(5, "Archana");
        MapPractice studentSix = new MapPractice(6, "Anisha");
        copymapPractic.put(studentFive.getStudendId(),studentFive.getStudentName());
        copymapPractic.put(studentSix.getStudendId(),studentSix.getStudentName());

        mapPractic.putAll(copymapPractic);
        for (Integer i : mapPractic.keySet()) {
            String studentName = mapPractic.get(i);
            System.out.println("student id: " + i + " and student name: " + studentName);
        }

        System.out.println();
        System.out.println("compare two maps and check whether they contain the same key-value pairs.");
        if(mapPractic.equals(copymapPractic)){
            System.out.println("its both equal");
        }
        else{
            System.out.println("not equals ");
        }


        System.out.println();
        System.out.println("remove a specified key and its corresponding value from a map.");
        mapPractic.remove(4);
        for (Integer i : mapPractic.keySet()) {
            String studentName = mapPractic.get(i);
            System.out.println("student id: " + i + " and student name: " + studentName);
        }

        System.out.println();
        System.out.println("update the value associated with a specified key in a map.");
        mapPractic.replace(3,"Vijaya Shree" , " viji");
        for (Integer i : mapPractic.keySet()) {
            String studentName = mapPractic.get(i);
            System.out.println("student id: " + i + " and student name: " + studentName);
        }

        System.out.println();
        System.out.println("print all the keys and all the values of a map separately.");
        for (Integer i : mapPractic.keySet()) {
            String studentName = mapPractic.get(i);
            System.out.println("student id: " + i + " and student name: " + studentName);
        }

        System.out.println();
        System.out.println("count the total number of key-value pairs in a map." + mapPractic.size());
    }

    private static void setMethod() {
        Set<SetPractice> setPracticeSet = new HashSet<>();

        SetPractice fruitsOne= new SetPractice("orange");
        SetPractice fruitsTwo= new SetPractice("Apple");
        SetPractice fruitsThree= new SetPractice("grapes");
        SetPractice fruitsFour= new SetPractice("mango");

        setPracticeSet.add(fruitsOne);
        setPracticeSet.add(fruitsTwo);
        setPracticeSet.add(fruitsThree);
        setPracticeSet.add(fruitsFour);

        System.out.println("print all the elements.=----------");
        for (SetPractice setPractice : setPracticeSet) {
            System.out.println(setPractice);
        }

        System.out.println();
        System.out.println("iterate through all the elements of a set.");

        Iterator<SetPractice> fruitsIterator = setPracticeSet.iterator();
        while(fruitsIterator.hasNext()){
            System.out.println(fruitsIterator.next());
        }

        System.out.println();
        System.out.println("copy of one set into another set------");

        Set<SetPractice> copyPracticeSet = new HashSet<>();

        SetPractice cityOne= new SetPractice("Bangalore");
        SetPractice cityTwo= new SetPractice("Chennai");
        SetPractice cityThree= new SetPractice("Cuddalore");
        SetPractice cityFour= new SetPractice("Villupuram");

        copyPracticeSet.add(cityOne);
        copyPracticeSet.add(cityTwo);
        copyPracticeSet.add(cityThree);
        copyPracticeSet.add(cityFour);


        System.out.println("search for an element in an array list-------");
        if (setPracticeSet.contains(fruitsTwo)) {
            System.out.println("Found the element: " + fruitsTwo);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println();

        System.out.println("print copy all the elements.=----------");
        setPracticeSet.addAll(copyPracticeSet);
        for (SetPractice copyPractice : copyPracticeSet) {
            System.out.println(copyPractice);
        }

        System.out.println();
        System.out.println(" compare two array lists --- " );
        if (setPracticeSet.equals(copyPracticeSet)) {
            System.out.println("two array are equals");
        } else {
            System.out.println("two array are different.");
        }

        System.out.println();
        System.out.println("remove the specific element -----");
        setPracticeSet.remove(fruitsTwo);

        System.out.println("print after removing all the elements.=----------");
        for (SetPractice setPractice : setPracticeSet) {
            System.out.println(setPractice);
        }
    }

    private static void listMethod() {
        List<ListPractice> listPracticeList = new ArrayList<>();

        ListPractice colorsOne = new ListPractice("Green");
        ListPractice colorsTwo = new ListPractice("Red");
        ListPractice colorsThree = new ListPractice("Black");
        ListPractice colorsFour = new ListPractice("Blue");

        listPracticeList.add(colorsOne);
        listPracticeList.add(colorsTwo);
        listPracticeList.add(colorsThree);
        listPracticeList.add(colorsFour);

        for (int i = 0; i < listPracticeList.size(); i++) {
            System.out.println(listPracticeList.get(i));
        }

        System.out.println();

        System.out.println("iterate through all elements in an array list  --------");
        Iterator<ListPractice> stringIterator = listPracticeList.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println();
        System.out.println("insert an element into the array list at the first position-------");
        ListPractice colorsZero = new ListPractice("White");
        listPracticeList.add(0,colorsZero);
        for (int i = 0; i < listPracticeList.size(); i++) {
            System.out.println(listPracticeList.get(i));
        }

        System.out.println();
        System.out.println("retrieve an element (at a specified index)---------");
        System.out.println(listPracticeList.get(2));

        System.out.println();
        System.out.println("Before update at colours one ------------ " );
        System.out.println(listPracticeList.get(1));

        System.out.println("update an array element by the given element------");
        listPracticeList.set(2,colorsZero);
        for (int i = 0; i < listPracticeList.size(); i++) {
            System.out.println(listPracticeList.get(i));
        }

        System.out.println();
        listPracticeList.remove(3);

        System.out.println("after remove the value " );
        for (int i = 0; i < listPracticeList.size(); i++) {
            System.out.println(listPracticeList.get(i));
        }

        System.out.println();
        System.out.println("search for an element in an array list-------");
        int index = listPracticeList.indexOf(colorsTwo);
        if (listPracticeList.contains(colorsTwo)) {
            System.out.println("Found the element: " + colorsTwo + " of index  " + index);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println();
        System.out.println("copy one array list into another.");

        List<ListPractice> copyListPractice = new ArrayList<>();
        copyListPractice.addAll(listPracticeList);

        for (int i = 0; i < copyListPractice.size(); i++) {
            System.out.println(copyListPractice.get(i));
        }

        System.out.println();
        System.out.println("print reverse elements in an array list.");
        for (int i = copyListPractice.size() - 1; i >= 0; i--) {
            System.out.println(copyListPractice.get(i));
        }

        System.out.println();
        System.out.println(" compare two array lists --- " );
        if (copyListPractice.equals(listPracticeList)) {
            System.out.println("two array are equals");
        } else {
            System.out.println("two array are different.");
        }

        System.out.println();
        System.out.println("join two array lists.-----");
        listPracticeList.addAll(copyListPractice);

    }
}
