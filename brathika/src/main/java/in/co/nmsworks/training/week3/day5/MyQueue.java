package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();
    public void enQueue(int i) {
        queue.add(i);
    }
    public void deQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Element removed is: "+queue.get(0));
            queue.remove(0);
        }
    }
    public void size() {
        System.out.println("Size of Queue is: "+queue.size());
    }
    public void peek() {
        System.out.println("Peek element is: "+queue.get(0));
    }
    public void print() {
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
