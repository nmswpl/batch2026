package in.co.nmsworks.training.week3.day4;

import java.util.*;

public class MyStack {

    Integer top = -1;
    Integer MAX_LIMIT = 100;
    Integer[] stack = new Integer[MAX_LIMIT];

    public void push(Integer value){
        if(top < MAX_LIMIT-1){
            top++;
            stack[top] = value;
        }
        else{
            System.out.println("Stack Overflow !");
        }
    }

    public Integer pop(){
        if(top == -1){
            System.out.println("No element is present in the stack");
            return null;
        }
        else{
            Integer topValue = stack[top];
            top --;
            return topValue;
        }
    }

    public void peek(){
        if(top == -1){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The peek element is : " + stack[top]);
        }

    }

    public void size(){
        System.out.println("The size of stack = " + (top+1));
    }

    public void printStack(){
        System.out.println("Elements : ");
        for (int i = top; i >= 0 ; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
