package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<Integer,String> trainees = new HashMap<>();
        trainees.put(21,"farhaan");
        trainees.put(20,"shathees");
        trainees.put(19,"dhoni karthick");
        trainees.put(0,"sanjeev");

        System.out.println(trainees.put(0,"gokul"));
       /* for (Map.Entry<Integer,String> entry : trainees.entrySet()){
            System.out.println("Id : "+entry.getKey()+"  Name : "+entry.getValue());
        }*/

        System.out.println(trainees.get(25));
        trainees.put(25,null);
        System.out.println(trainees.get(25));
        for (Map.Entry<Integer, String> trainee : trainees.entrySet()) {
            System.out.println(trainee.getKey()+trainee.getValue());

        }
    }
}
