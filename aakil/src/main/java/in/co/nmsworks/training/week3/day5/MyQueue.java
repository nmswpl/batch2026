package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;

import java.util.List;

public class MyQueue {
    private List<Integer> queue;

    public MyQueue() {
        queue = new ArrayList<>();
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY CAN'T PEEK");
            return null;
        }
        return queue.get(0);
    }

    public void enqueue(Integer element) {
        queue.add(element);

    }

    public Integer dequeue() {
        if (isEmpty()) {
                System.out.println("QUEUE EMPTY CAN'T DEQUEUE");
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println(queue);
            return;
        }
        System.out.println(queue);
    }

    public int size() {
        return queue.size();
    }
}
