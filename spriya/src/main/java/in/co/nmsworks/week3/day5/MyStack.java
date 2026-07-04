package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> list = new ArrayList<>();

    public void push(int element) {
        list.add(element);

    }

    public void pop() {

        int index = list.size() - 1;
        if (list.size() == 1) {
            System.out.println("POPPED ELEMENT: " + list.remove(list.get(0)));
            return;
        }
        int removedElement = list.remove(index);
        System.out.println("POPPED ELEMENT: " + removedElement);
        System.out.println();
    }

    public void top() {
        int topElement = list.get(list.size() - 1);
        System.out.println("TOP ELEMENT :" + topElement);
        System.out.println();
    }

    public void size() {
        int size = list.size();
        System.out.println("Size :" + size);
    }

    public void print() {
        System.out.println("ELEMENTS IN STACK");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
