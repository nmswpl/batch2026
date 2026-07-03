package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> stack = new ArrayList<>();

    public int push(Integer name) {
        stack.add(name);
        return 0;
    }

    public Integer pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public void top(){
        System.out.println(stack.get(stack.size() - 1));
    }

    public void size(){
        System.out.println(stack.size());
    }

    public void printStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
