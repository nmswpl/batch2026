package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(100);
        s1.push(200);
        s1.display();
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        s1.display();
        System.out.println(s1.isEmpty());
    }

}
