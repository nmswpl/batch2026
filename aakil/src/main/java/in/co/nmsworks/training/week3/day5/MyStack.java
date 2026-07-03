package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStack {
    private List<Integer> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY CAN'T PEEK");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public void push(Integer element) {
        stack.add(element);
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY CAN'T POP");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println(stack);
            return;
        }
        System.out.print("[");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int size() {
        return stack.size();
    }
}
