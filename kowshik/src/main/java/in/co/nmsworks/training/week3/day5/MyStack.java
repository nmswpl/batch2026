package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<Integer> stack = new ArrayList<>();

    public void push(Integer num) {
        stack.add(num);
        System.out.println("Pushed : " + num);
    }

    public Integer pop() {

        if(stack.isEmpty()) {
            System.out.println("Stack empty!");
            return -1;
        }

        Integer removedNum = stack.remove(stack.size() - 1);
        System.out.println("Popped element : " + removedNum);
        return removedNum;
    }

    public Integer top() {
        if(stack.isEmpty()) {
            System.out.println("Stack empty!");
            return -1;
        }

        Integer topElement = stack.get(stack.size() - 1);
        System.out.println("Top element : " + topElement);
        return topElement;
    }

    public void size() {
        System.out.println("Size of stack : " + stack.size());
    }

    public void printStack() {
//        System.out.println("Stack : " + stack);

        for (int i = stack.size()-1; i >= 0; i++) {
            System.out.print(stack.get(i) + " ");
        }
    }


}
