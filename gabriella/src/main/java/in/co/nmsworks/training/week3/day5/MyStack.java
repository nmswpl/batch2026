package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> stack = new ArrayList<>();

    public MyStack() {
    }

    public MyStack(List<Integer> stack) {
        this.stack = stack;
    }


    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }

    public void push(Integer element){
        stack.add(element);
    }

    public Integer pop(){
        Integer element;
        if (stack.isEmpty()){
            System.out.println("Stack is empty. Cannot pop.");
            element = -1;
        } else {
            element = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
        }
        return element;
    }

    public void top(){
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack.get(stack.size() - 1));
        }
    }

    public Integer getSize(){
        Integer stackSize = stack.size();
        return stackSize;
    }

    public void printStack(){
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
