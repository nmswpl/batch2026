package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    static List<Integer> myList = new ArrayList<>();

    void print() {
        for (int i = myList.size() - 1 ; i >= 0; i--) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }

     void size() {
        System.out.println( " Size : "+ myList.size());
    }

     void top() {
        System.out.println("Top element : " + myList.get(myList.size()-1));
    }

     void pop() {
        if(myList.isEmpty()){
            System.out.println("Stack is Empty ");
        } else {
            System.out.println("Popped Element : " + myList.get(myList.size() - 1));
            myList.remove(myList.size() - 1);
        }
    }

     void  push(int i) {
       myList.add(i);
    }
}
