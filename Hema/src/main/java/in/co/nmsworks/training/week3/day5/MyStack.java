package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<String> stack ;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(String data)
    {
        stack.add(data);
    }

    public String pop()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty!");
            return null;
        }
        String element = stack.get(stack.size() - 1);
        stack.remove(stack.size()-1);
        return element;
    }

    public String top()
    {
        return stack.get(stack.size()-1);
    }

    public Integer size()
    {
        return  stack.size();
    }

    public void printStack()
    {
        System.out.print("[ ");
        for (int i = stack.size() -1; i >= 0; i--) {
            System.out.print(stack.get(i)+", ");

        }
        System.out.println("]");
    }



}
