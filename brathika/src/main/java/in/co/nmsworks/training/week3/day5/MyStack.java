package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> element = new ArrayList<>();
    public void top() {
        if (element.size() > 0) {
            int index = element.size() - 1;
            System.out.println("Top element is: "+element.get(index));
        }
        else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        for (int i = element.size() - 1; i >=0 ; i--) {
            System.out.println(element.get(i));
        }
    }

    public void size() {
        System.out.println(element.size());

    }

    public void push(int i) {
        element.add(i);
    }

    public void pop() {
        if (element.size() > 0) {
            System.out.println("Element poped: "+element.get(element.size() - 1));
            element.remove(element.size() - 1);
        }
        else {
            System.out.println("Stack is empty");
        }
    }
}
