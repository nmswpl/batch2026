package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(19,"Soundappan");
        map.put(20,"Dhoni");
        map.put(21,"Sathish");
        map.put(0,"Sanjeev");
        map.put(25,null);

        System.out.println(map.put(0,"Gokul"));
        System.out.println(map.get(25));
        System.out.println(map.containsKey(25));

        for (int key : map.keySet()){
            System.out.println("id : " + key + " name : "+ map.get(key));
        }

        System.out.println();

        for (Map.Entry<Integer,String> trainee : map.entrySet()){
            System.out.println("id : " + trainee.getKey() + " name : " + trainee.getValue());
        }

    }
}
