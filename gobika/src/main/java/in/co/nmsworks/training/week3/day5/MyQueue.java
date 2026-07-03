package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();

    public void enqueue(Integer element){
        queue.add(element);
    }

    public void dequeue(){
        if (queue.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else {
            Integer firstElement = queue.get(0);
            queue.remove(firstElement);
            System.out.println(firstElement);
        }

    }

    public void peek(){
        System.out.println(queue.get(0));
    }

    public void size(){
        System.out.println(queue.size());
    }

    public void printQueue(){
        for (Integer element : queue) {
            System.out.println(element);
        }
    }
}
