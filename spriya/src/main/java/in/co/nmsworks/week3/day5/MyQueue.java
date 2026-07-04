package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> list = new ArrayList<>();

    public void enqueue(int element) {
        list.add(element);

    }

    public void dequeue() {

        int index = 0;
        if (list.size() == 1) {
            System.out.println("REMOVED ELEMENT: " + list.remove(list.get(0)));
            return;
        }
        int removedElement = list.remove(index);
        System.out.println("REMOVED ELEMENT: " + removedElement);
        System.out.println();
    }

    public void peek() {
        int topElement = list.get(0);
        System.out.println("PEEK ELEMENT :" + topElement);
        System.out.println();
    }

    public void size() {
        int size = list.size();
        System.out.println("Size :" + size);
    }

    public void print() {
        System.out.println("ELEMENTS IN QUEUE");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
