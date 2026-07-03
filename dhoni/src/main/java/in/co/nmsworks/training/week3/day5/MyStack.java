package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> stack;
    int top;

    public MyStack() {
        stack = new ArrayList<>();
        top = -1;
    }

    int peek(){
        return stack.get(top);
    }

    int pop(){

        if(stack.isEmpty()){
            return -1;
        }

        int element = stack.remove(top);
        top--;
        return element;
    }

    void push(int element){
        stack.add(element);
        top++;
    }

    void printStack(){

        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        for(int i = stack.size()-1; i >= 0; i--){
            System.out.print( stack.get(i) + " " );
        }

        System.out.println();
    }

    int getSize(){
        return stack.size();
    }

}
