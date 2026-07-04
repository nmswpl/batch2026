package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack  {
    List<Integer> list=new ArrayList<>();
    public void push(Integer num)
    {
        list.add(num);
    }
    public void pop() {
        if(list.size()>0)
        {
            list.remove((list.size())-1);
        }
        else {
            System.out.println("list is empty");
        }

    }
    public void top() {
        System.out.println("Top element is "+list.get(list.size()-1));
    }
    public void size()
    {
        if(list.isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Size of the stack is "+list.size());
        }

    }
    public void printStack() {
        System.out.println("Stack elements are : ");
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
