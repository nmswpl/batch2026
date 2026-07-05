package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStack {
    List<Integer> stackList = new ArrayList<>();

    public Integer pop() {
        Integer elementOnTop = stackList.get(stackList.size() - 1);
        stackList.remove(elementOnTop);
        return elementOnTop;
    }

    public void push(int element) {
        List<Integer> stackList = getListStack();
        stackList.add(element);
    }

    public List<Integer> getListStack() {
        return stackList;
    }

    public void printStack() {
        List<Integer> listStack = getListStack();

        for (int i = listStack.size()-1; i >=0 ; i--) {
            System.out.println(listStack.get(i));
        }
    }

    public Integer top() {
        Integer elementOnTop = stackList.get(stackList.size() - 1);
        return elementOnTop;

    }

    public int size() {
        List<Integer> listStack = getListStack();
        return listStack.size();
    }
}
