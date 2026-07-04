package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    List<Integer> queue = new ArrayList<>();
    void enqueue(Integer number){
        queue.add(number);

    }
    void dequeue(){
        if (!queue.isEmpty()){
             queue.remove(queue.get(0));
        }

    }

    int peek(){
        return queue.get(0);
    }

    int size(){
        return queue.size();
    }

    void print(){
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));

        }
    }
}
