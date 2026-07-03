package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> queue = new ArrayList<>();

    public void enque(Integer number) {
        queue.add(number);
    }

    public Integer deque() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public void peek(){
        System.out.println(queue.get(0));
    }

    public void size(){
        System.out.println(queue.size());
    }

    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("quueue is empty.");
            return;
        }
        for (int i = 0; i <= queue.size()-1; i++) {
            System.out.println(queue.get(i));
        }
    }
}
