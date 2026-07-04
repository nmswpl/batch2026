package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    List<Integer> list = new ArrayList<>();

    public MyStack() {
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public MyStack(List<Integer> list) {
        this.list = list;
    }

    void push(int i){
        list.add(i);
        System.out.println(i + " Pushed into stack");
    }

    void pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
        } else {

            System.out.println("Popped element : " + list.remove(list.size() - 1));
        }
    }

    void peak(){
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
        System.out.println("Peak element : "+list.get(list.size()-1));
       }
    }

    void size() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Size of the stack : " + (list.size()));
        }
    }
    void printStack() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elemnts : ");
            for (int i = list.size(); i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
