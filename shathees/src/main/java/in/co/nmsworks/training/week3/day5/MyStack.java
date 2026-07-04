package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    public MyStack() {
    }

    List<Integer> stack = new ArrayList<>();
    public void push(Integer number){
        System.out.println("value "+number+"pushed into Stack");
        stack.add(number);
    }
    public void pop(){

        if(!stack.isEmpty()){
            stack.remove(stack.size()-1);
        }

    }
    public int size(){
        return stack.size();
    }
    public int peek(){
        return stack.get(size()-1);
    }
    public void print(){
        System.out.println("The stack elements are : : ");
        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.println(stack.get(i));

        }
    }
}
