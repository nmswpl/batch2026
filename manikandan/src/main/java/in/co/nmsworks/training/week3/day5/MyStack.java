package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(value);
        System.out.println("PUSHED: " + value);
    }

    public void pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        int removedValue = list.remove(list.size() - 1);
        System.out.println("Popped: " + removedValue);
    }

    public int peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }


    public void print() {
        if (list.isEmpty()) {
            System.out.println("Stack: []");
            return;
        }
        System.out.print("Stack : ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


    public int size() {
        return list.size();
    }
}