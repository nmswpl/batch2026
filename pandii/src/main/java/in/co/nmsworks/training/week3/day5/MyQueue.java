package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue  {
    List<Integer> list =new ArrayList<>();
    public void enQueue(Integer num)
    {
        list.add(num);
    }
    public void deQueue() {
        if(list.size()>0)
        {
            list.remove(0);
        }
        else {
            System.out.println("list is empty");
        }

    }
    public void front() {
        if (list.isEmpty())
        {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Top element is "+list.get(0));
        }
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
        System.out.println("Queue elements are : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
