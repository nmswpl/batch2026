package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();

    public void enqueue(int number){
        queue.add(number);
    }

    public int dequeue(){
        if(queue.size() == 0){
            System.out.println("Queue is Empty");
            return 0;
        }
        else {
            int dequeued = queue.get(0);
            System.out.println("Dequeued: " + dequeued);
            queue.remove(0);
            return dequeued;
        }
    }

    public void peek(){
        if(queue.size()==0){
            System.out.println("Queue is empty");
            return;
        }
        else {
            System.out.println("Peek: " + queue.get(0));
        }
    }

    public void display(){
        for (Integer i : queue) {
            System.out.println(i);
        }
    }

    public void size(){
        System.out.println(queue.size());
    }
}
