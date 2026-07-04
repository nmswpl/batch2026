package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    private List<String> queue = new ArrayList<>();

    public void enqueue(String element)
    {
        queue.add(element);
    }

    public  void dequeue()
    {
        if( !queue.isEmpty() )
        {
            queue.remove(0);
        }
        else
        {
            System.out.println("Queue is empty!");
        }

    }

    public Integer size()
    {
        return queue.size();
    }

    public String peak()
    {
        return queue.get(0);
    }
    public void printQueue()
    {
        System.out.println(queue);
    }

}
