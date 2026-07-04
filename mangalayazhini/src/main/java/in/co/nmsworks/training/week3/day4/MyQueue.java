package in.co.nmsworks.training.week3.day4;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    Integer front = -1;
    Integer rear = -1;

    Integer[] queue = new Integer[10];

   void enqueue(Integer value){
       if(front == -1 && rear == -1){
           front++;
           rear++;
       }else{
           rear++;
       }
       queue[rear] = value;
       System.out.println("front : " + front + " rear : " + rear);
   }

   Integer dequeue(){
       if(front == -1 && rear == -1){
           System.out.println("Queue is empty !");
           return null;
       }else{
           Integer dequeuedVal = null;
           if(front == rear){
               dequeuedVal = queue[front];
               front = -1;
               rear = -1;
           }
           else{
               dequeuedVal = queue[front];
               front++;
           }
           return dequeuedVal;
       }
   }

   void top(){
       if(front == -1 && rear == -1){
           System.out.println("The queue is empty");
       }
       else{
           System.out.println("Top : " + queue[front]);
       }
   }

   void display(){
       if(front == -1 && rear == -1){
           System.out.println("The queue is empty");
       }
       else{
           System.out.println("Queue : ");
           for (int i = front; i <= rear; i++) {
               System.out.println(queue[i] +" ");
           }

       }
   }
}
