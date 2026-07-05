package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> list=new ArrayList<>();
    public void push(int element){
        list.add(element);
    }
  public void display(){
      System.out.println(list);
      System.out.println();
  }
  public int top(){
       return list.get(0);
  }
  public int size(){
        return list.size();
  }
  public int peek(){

        return list.get(list.size()-1);
  }
  public int pop(){
      if(list.isEmpty()){
          System.out.println("Is Empty");
          return -1;
      }
        return list.remove(0);
  }
}
