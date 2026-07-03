package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> listInteger = new ArrayList<>();

    public void push(Integer number){

        listInteger.add(number);
    }

    public void pop()
    {
        if(listInteger.size() <= 0)
        {
            System.out.println("Sorry stack has no elements");
        }
        else {
            Integer number = listInteger.get(listInteger.size() - 1);
            listInteger.remove(listInteger.size() - 1);
            System.out.println(number);
        }
    }

    public void peek()
    {
        if(listInteger.size()<=0)
        {
            System.out.println("Sorry stack has no elements");

        }
        else {
            Integer number = listInteger.get(listInteger.size() - 1);
            System.out.println(number);
        }
    }

    public int size(){
        int size = listInteger.size();
        return size;
    }

    public void print(){
        System.out.println(listInteger);
    }
}
