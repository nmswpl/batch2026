package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> QueueList = new ArrayList<>();

    public void pop() {
        if (!QueueList.isEmpty()) {
            System.out.println("Poped Element : "+QueueList.remove(0));
        } else {
            System.out.println("MyQueue is empty");
        }
    }

    public void size() {
        if(QueueList.isEmpty()){
            System.out.println("Size : 0");
        }
        else{
            System.out.println("Size : "+QueueList.size());
        }
    }

    public void top() {
        if (!QueueList.isEmpty()) {
            System.out.println("Top Element : " +QueueList.get(0));
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        for (int i = 0; i < QueueList.size(); i++) {
            System.out.println("Size of the Queue : "+QueueList.get(i));
        }
    }

    public void push(Integer num) {
        QueueList.add(num);
    }

}
