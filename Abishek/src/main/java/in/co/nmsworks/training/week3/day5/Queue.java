package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<Integer> list = new ArrayList<>();

    public void enqueue(int num)
    {
        list.add(num);
    }
    public void dequeue()
    {
        if(list.size() <= 0)
        {
            System.out.println("Sorry queue has no elements");
        }
        System.out.println(list.get(0));
        list.remove(0);
    }
    public void peek()
    {
        if(list.size() <= 0)
        {
            System.out.println("Sorry queue has no elements");
        }
        System.out.println(list.get(0));
    }
    public void size()
    {
        System.out.println(list.size());
    }
    public void display(){
        System.out.println(list);
    }
}
