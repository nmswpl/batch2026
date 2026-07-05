package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> list=new ArrayList<>();

    public void push(int element){
        list.add(element);
    }
    public int pop() {
        return list.remove(list.size() - 1);
    }
    public int peek(){
        return list.get(list.size()-1);
    }
    public void display(){
        for(int i= list.size()-1;i>=0;i--) {
            System.out.print(list.get(i)+" ");
        }
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }
}
