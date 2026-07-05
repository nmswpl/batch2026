package in.co.nmsworks.training.week3.day5.stackqueue;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    List<Integer> stack1 = new ArrayList<>();

    void print() {
        for (int i = stack1.size() -1 ; i > 0; i--) {
            System.out.println(stack1.get(i));
        }
    }

    Integer size() {
        Integer sizeOfStack = stack1.size();
        return sizeOfStack;
    }

    Integer peak() {
        Integer peakElement = stack1.get(stack1.size() - 1);
        return peakElement;
    }

    List<Integer> pop() {
        if(stack1.isEmpty()){
            System.out.println("empty stack");
            return null;
        }
        Integer index = stack1.size();
        stack1.remove(index);
        return stack1;
    }

    List<Integer> push(Integer value) {
        stack1.add(value);
        return stack1;
    }

}
