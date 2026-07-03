package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    private List<Integer> queue = new ArrayList<>();

    public void enqueue(Integer input) {
        queue.add(input);
    }

    public Integer dequeue() {
        if(queue.isEmpty()) {
            System.out.println("Queue Empty!");
            return -1;
        }

        Integer popped = queue.remove(0);
        System.out.println("Popped : " + popped);
        return popped;
    }

    public Integer top() {
        if(queue.isEmpty()) {
            System.out.println("Queue Empty!");
            return -1;
        }

        int top = queue.get(0);
        System.out.println("Top : " + top);
        return top;
    }

    public void size() {
        System.out.println("Size of queue : " + queue.size());
    }

    public void display() {
        System.out.println(queue);
    }
}
