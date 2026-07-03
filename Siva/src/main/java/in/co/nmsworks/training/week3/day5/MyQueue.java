package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queueList = new ArrayList<>();

    public void enqueue(Integer val) {
        queueList.add(val);
    }

    public Integer dequeue() {
        if (queueList.size() == 0) {
            return Integer.MAX_VALUE;
        }
        Integer val = queueList.get(0);
        queueList.remove(0);
        return val;
    }
    
    public Integer front() {
        if (queueList.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return queueList.get(0);
    }

    public void print() {
        if (queueList.size() == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue Elements :: ");
        for (int i = 0; i < queueList.size(); i++) {
            System.out.print(queueList.get(i)+" ");
        }
        System.out.println();
    }
    
    public Integer getSize() {
        return queueList.size();
    }
}
