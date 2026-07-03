package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> stack = new ArrayList<>();



    public void push(int number){
        stack.add(number);
    }
    public  int pop(){
        if(stack.size()==0){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            int popped = stack.get(stack.size()-1);
            System.out.println("Popped: " + popped);
            stack.remove(stack.size()-1);
            return popped;
        }
    }

    public void peek(){
        System.out.println(stack.get(stack.size()-1));
    }

    public void stackSize(){
        System.out.println(stack.size());
    }

    public void print(){
        for (int i = stack.size()-1; i >= 0 ; i--) {
            System.out.println(stack.get(i));
        }
    }
}
