package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<Integer> pushList = new ArrayList<>();

    public void pop() {
        if (!pushList.isEmpty()) {
            System.out.println("Poped Element : "+ pushList.remove(pushList.size()-1));
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void size() {
        if(pushList.isEmpty()){
            System.out.println("Size : 0");
        }
        else{
            System.out.println(pushList.size());
        }
    }

    public void top() {
        if (!pushList.isEmpty()) {
            System.out.println("Top Element : " +pushList.get(pushList.size()-1));
        } else {
            System.out.println("MyStack is empty");
        }
    }

    public void print() {
        for (int i = pushList.size(); i >0; i--) {
            System.out.println(pushList.get(i));
        }
    }

    public void push(Integer num) {
        pushList.add(num);
    }
}
