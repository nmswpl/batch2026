package in.co.nmsworks.week3.day2;

import com.google.protobuf.MapEntry;

import java.sql.SQLOutput;
import java.util.*;

public class MapPractice {
    public void printEntries() {
        System.out.println("Print All entries");
        Map<Integer, String> studentDetail = new HashMap<>();

        studentDetail.put(1, "Priyanka");
        studentDetail.put(2, "Mohanasri");
        studentDetail.put(3, "Gabriella");
        studentDetail.put(4, "Hema");
        studentDetail.put(5, "Anushri");
        for (Map.Entry<Integer, String> e : studentDetail.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();
    }

    public void iterate() {
        System.out.println("Iterate map");

        Map<Integer, Integer> mark = new HashMap<>();

        mark.put(1, 33);
        mark.put(2, 66);
        mark.put(3, 66);

        for (Map.Entry<Integer, Integer> e : mark.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();
    }

    public void search() {
        System.out.println("Search map");

        Map<Integer, Integer> mark = new HashMap<>();

        mark.put(1, 33);
        mark.put(2, 66);
        mark.put(3, 66);
        System.out.println(mark.containsKey(2));


        System.out.println();
    }

    public void searchValue() {
        System.out.println("Search Value");

        Map<Integer, Integer> mark = new HashMap<>();

        mark.put(1, 33);
        mark.put(2, 66);
        mark.put(3, 66);
        System.out.println(mark.containsValue(2));


        System.out.println();
    }

    public void compare() {
        System.out.println("Compare Method");
        Map<Integer, Integer> markList1 = new HashMap<>();
        markList1.put(1, 66);
        markList1.put(2, 77);
        markList1.put(3, 55);

        Map<Integer, Integer> markList2 = new HashMap<>();
        markList2.put(1, 66);
        markList2.put(2, 77);
        markList2.put(3, 55);

        System.out.println(markList1.equals(markList2));
        System.out.println();
    }

    public void copyMethod() {
        System.out.println("Copy Method");
        Map<Integer, Integer> markList1 = new HashMap<>();
        markList1.put(1, 66);
        markList1.put(2, 77);
        markList1.put(3, 55);

        Map<Integer, Integer> markList2 = new HashMap<>();
        markList2.putAll(markList1);

        for (Map.Entry<Integer, Integer> e : markList2.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();


    }

    public void removeMethod() {
        Map<Integer, Integer> sno = new HashMap<>();
        sno.put(1, 66);
        sno.put(2, 77);
        sno.put(3, 55);
        System.out.println("Before");
        for (Map.Entry<Integer, Integer> e : sno.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        sno.remove(2, 77);
        System.out.println("After");
        for (Map.Entry<Integer, Integer> e : sno.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();


    }

    public void update() {
        Map<Integer, Integer> sno = new HashMap<>();
        sno.put(1, 66);
        sno.put(2, 77);
        sno.put(3, 55);
        System.out.println("Before");
        for (Map.Entry<Integer, Integer> e : sno.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        sno.replace(2, 88);
        System.out.println("After");
        for (Map.Entry<Integer, Integer> e : sno.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println();

    }

    public void printAll() {
        Map<Integer, Integer> age = new HashMap<>();
        age.put(1, 66);
        age.put(2, 77);
        age.put(3, 55);

        System.out.println(age.keySet());


    }

    public void totalCount() {
        Map<Integer, Integer> age = new HashMap<>();
        age.put(1, 66);
        age.put(2, 77);
        age.put(3, 55);

        System.out.println(age.keySet().size());
    }
}



