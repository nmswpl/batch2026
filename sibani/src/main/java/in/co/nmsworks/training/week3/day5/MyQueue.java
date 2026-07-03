package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    static List<Integer> myList = new ArrayList<>();

    void print() {
        for (int i = 0 ; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }

    void size() {
        System.out.println( " Size : "+ myList.size());
    }

    void peek() {
        System.out.println("Top element : " + myList.get(0));
    }

    void dequeue() {
        if(myList.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Popped Element : " + myList.get(0));
            myList.remove(0);
        }
    }

    void  enqueue(int i) {
        myList.add(i);
    }
}
