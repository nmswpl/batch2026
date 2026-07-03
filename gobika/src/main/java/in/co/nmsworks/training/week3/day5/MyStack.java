package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> stack = new ArrayList<>();

    public void push(Integer element){
        stack.add(element);
    }

    public void pop(){
        if (stack.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            Integer topElement = stack.get(stack.size()-1);
            stack.remove(topElement);
            System.out.println(topElement);
        }

    }

    public void top(){
        System.out.println(stack.get(stack.size()-1));
    }

    public void size(){
        System.out.println(stack.size());
    }

    public void printStack(){
        for ( int i = stack.size()-1 ; i >= 0 ; i--) {
            System.out.println(stack.get(i));
        }
    }
}
