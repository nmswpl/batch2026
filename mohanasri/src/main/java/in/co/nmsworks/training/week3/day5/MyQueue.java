package in.co.nmsworks.training.week3.day5;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();

    void enqueue(int i){
        System.out.println(i + "  enqueued successfully ");
        queue.add(i);
    }
    void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued element : " + queue.get(0));
            queue.remove(0);
        }
    }
    void peak(){
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Peak element : " + queue.get(0));
        }
    }
    void printQueue(){
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements : ");
            for (Integer i : queue) {
                System.out.print(i + " ");
            }
        }
    }
    void size() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Size of the queue : " + queue.size());
        }

    }
}
