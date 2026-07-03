package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    int first;
    int last;
    List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
        first = -1;
        last = -1;
    }

    public  void enqueue(int element){

        if(first == -1) {
            list.add(element);
            first = 0;
            last++;
            return;
        }
        last++;
        list.add(element);
    }

    public int dequeue(){
        if(last == -1){
            first = -1;
            return -1;
        }

        int element = list.remove(0);
        last--;

        return element;
    }

    public  int peek(){
        if(list.isEmpty()){
            return -1;
        }
        return list.get(0);
    }

    public void display(){

        if(list.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return list.size();
    }

}
