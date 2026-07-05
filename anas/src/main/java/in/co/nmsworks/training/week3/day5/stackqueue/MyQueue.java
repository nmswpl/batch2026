package in.co.nmsworks.training.week3.day5.stackqueue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();

    void print() {
        if(queue.isEmpty()){
            System.out.println("empty queue");
        }
        for (Integer i : queue) {
            System.out.println(i);
        }
    }

    Integer size() {
        if(queue.isEmpty()){
            System.out.println("empty queue");
            return null;
        }
        Integer sizeOfQueue = queue.size();
        return sizeOfQueue;
    }

    Integer peak() {
        if(queue.isEmpty()){
            System.out.println("empty queue");
            return null;
        }
        Integer peakElement = queue.get(0);
        return peakElement;
    }

    List<Integer> dequeue() {
        if(queue.isEmpty()){
            System.out.println("empty queue");
            return null;
        }
        queue.remove(0);
        return queue;
    }

    List<Integer> enqueue(Integer value) {
        queue.add(value);
        return queue;
    }
}
