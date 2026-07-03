package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();

    public MyQueue() {
    }

    public MyQueue(List<Integer> queue) {
        this.queue = queue;
    }

    public void enqueue(Integer element){
        queue.add(element);
        System.out.println(element + " added to queue");
    }

    public Integer dequeue(){
        Integer element;
        if (queue.isEmpty()){
            System.out.println("Queue is empty. cannot dequeue");
            element = -1;
        } else {
            element = queue.get(0);
            queue.remove(0);
        }
        return element;
    }

    public void peek(){
        if (queue.isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue.get(queue.size()-1));
        }
    }

    public Integer getSize(){
        Integer queueSize = queue.size();
        return queueSize;
    }

    public void printQueue(){
        if (queue.isEmpty()) System.out.println("Queue is empty");
        else {
            for (Integer i : queue) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
