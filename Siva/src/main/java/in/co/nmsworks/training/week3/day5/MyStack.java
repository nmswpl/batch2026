package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> stackElements = new ArrayList<>();

    public void push(Integer val) {
        stackElements.add(val);
    }

    public Integer pop() {
        if (stackElements.size() == 0) {
            return Integer.MAX_VALUE;
        }
        Integer val = stackElements.get(stackElements.size()-1);
        stackElements.remove(stackElements.size()-1);
        return val;
    }

    public Integer top() {
        return stackElements.get(stackElements.size()-1);
    }

    public void printStack() {
        if (stackElements.size() == 0) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack Elements :: ");
        for (int i = stackElements.size() - 1; i >= 0; i--) {
            System.out.print(stackElements.get(i)+" ");
        }
        System.out.println();
    }

    public Integer getSize() {
        return stackElements.size();
    }
}
