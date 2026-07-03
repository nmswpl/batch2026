package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyQueue {
    private List<Integer> queue = new ArrayList<>();

    public MyQueue() {
    }

    public void size(){
        System.out.println("The size of stack is :: " + queue.size());
    }

    public void display() {
        System.out.print("The elements in the stack is :: ");
        System.out.println(queue);
    }

    public void peek() {
        System.out.println(" The top value of stack is :: " + queue.get(0));
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            int i = queue.get(0);
            Integer b = queue.remove(i);
            System.out.println("The value " + i + " has been popped ");
        }
    }

    public void enqueue(int pushValue) {
        queue.add(pushValue);
        System.out.println("The value " + pushValue + " has been pushed ");
    }

}
