package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> list= new ArrayList<>();


    void display() {

        if(list.isEmpty()){
            System.out.println("NOTHING TO DISPLAY ");
        }

        else{
            System.out.println("DISPLAYING QUEUE");
            for(int i=0;i<= list.size()-1;i++){
                System.out.println(list);
                break;
            }
        }

    }

    int size() {

        if(list.isEmpty()){
            System.out.println("QUEUE IS EMPTY ");
            return 0;
        }
       return list.size();


    }

   int peek() {

        if(list.isEmpty()){
            System.out.println("THE QUEUE IS EMPTY ..  NOTHING TO PEEK ");
        }
        else{
            System.out.println("THE TOP VALUE IS "+list.get(0));
        }

        return list.get(0);
    }

    void dequeue() {

        if(list.isEmpty()){
            System.out.println("THE QUEUE IS EMPTY ..  NOTHING TO REMOVE ");
        }
        else{
            System.out.println("REMOVED FIRST IN VALUE "+list.remove(0));
        }

    }

    void enque(int value) {
        list.add(value);

    }
}