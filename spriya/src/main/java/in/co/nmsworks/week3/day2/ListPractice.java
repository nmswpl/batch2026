package in.co.nmsworks.week3.day2;

import java.util.*;

public class ListPractice {
    public void addColors() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        for (String s : list) {
            System.out.println(s);

        }
    }

    public void iterate() {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
    }

    public void addAtFirst() {

        List<Integer> list2 = new ArrayList<>();

        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        list2.add(0, 10);

        for (Integer i : list2) {
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println(list2.get(3));

    }

    public void updateElement() {
        List<Double> price = new ArrayList<>();
        price.add(200.0);
        price.add(100.0);
        price.add(300.0);

        for (Double v : price) {
            System.out.println(v);
        }
        System.out.println(" ");
        price.set(2, 250.0);

        for (Double v : price) {
            System.out.println(v);
        }
    }

    public void removeMethod() {
        List<Integer> age = new ArrayList<>();

        age.add(10);
        age.add(20);
        age.add(50);
        age.add(70);
        age.add(30);

        for (Integer i : age) {
            System.out.println(i);
        }
        age.remove(3);
        System.out.println(" ");

        for (Integer i : age) {
            System.out.println(i);
        }
    }

    public void searchElement() {
        List<Integer> sno = new ArrayList<>();

        sno.add(1);
        sno.add(2);
        sno.add(3);
        sno.add(4);
        System.out.println("Contains :" + sno.contains(3));
        System.out.println("Index value :" + sno.indexOf(3));
    }

    public void copyArrayList() {
        List<Integer> age = new ArrayList<>();

        age.add(10);
        age.add(11);
        age.add(12);
        System.out.println("First List");
        for (Integer i : age) {
            System.out.println(i);
        }
        List<Integer> age2 = new ArrayList<>();

        age2.add(13);
        age2.add(14);
        age2.add(15);

        System.out.println("Second List");
        for (Integer i : age2) {
            System.out.println(i);
        }

        for (Integer i : age2) {
            age.add(i);
        }

        System.out.println("After copied");
        for (Integer i : age) {
            System.out.println(i);
        }
    }

    public void reverseArray() {
        List<Double> mark = new ArrayList<>();

        mark.add(55.0);
        mark.add(66.0);
        mark.add(77.0);
        mark.add(99.0);
        System.out.println("Before Reverse");
        for (int i = 0; i < mark.size(); i++) {
            System.out.println(mark.get(i));
        }
        System.out.println(" ");
        System.out.println("After Reverse");
        for (int i = mark.size() - 1; i >= 0; i--) {
            System.out.println(mark.get(i));
        }
    }

    public void compare() {
        List<Integer> age = new ArrayList<>();

        age.add(10);
        age.add(11);
        age.add(12);

        List<Integer> age1 = new ArrayList<>();

        age1.add(10);
        age1.add(11);
        age1.add(12);
        int set = 0;

        if (age.size() != age1.size()) {
            System.out.println("Invalid not equal arrays");
            return;
        }
        for (int i = 0; i < age.size(); i++) {
            if (age.get(i) != age1.get(i)) {
                System.out.println("Two List are Not Equal");
                set = 1;
                break;
            } else {
                continue;
            }
        }
        if (set == 0) {
            System.out.println("Two List are Equal");
        }

    }

    public void join() {
        List<Integer> markList1 = new ArrayList<>();
        markList1.add(88);
        markList1.add(99);
        markList1.add(66);

        List<Integer> markList2 = new ArrayList<>();
        markList2.add(100);
        markList2.add(35);
        markList2.add(77);

        List<Integer> markList3 = new ArrayList<>();
        for (Integer i : markList1) {
            markList3.add(i);
        }
        for (Integer i : markList2) {
            markList3.add(i);
        }
        System.out.println("Third List");
        for (Integer i : markList3) {
            System.out.println(i);
        }
    }

}
