package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStack {
    private List<Integer> stack = new ArrayList<>();

    public MyStack() {
    }


    public List<Integer> getStack() {
        return stack;
    }

    public void setStack(List<Integer> stack) {
        this.stack = stack;
    }

    public void size(){
        System.out.println("The size of stack is :: " + stack.size());
    }

    public void display() {
        System.out.println();
        System.out.print("The elements in the stack is :: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }


    public void top() {
        System.out.println(" The top value of stack is :: " + stack.get(stack.size()-1));
    }
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            int i = stack.remove(stack.size() - 1);
            System.out.println("The value " + i + " has been popped ");
        }
    }
    public void push(int pushValue) {
            stack.add(pushValue);
            System.out.println("The value " + pushValue + " has been pushed ");
    }

}
