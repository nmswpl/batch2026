package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {

        Map<Integer, String> trainee = new HashMap<>();
        trainee.put(8,"Brathika");
        trainee.put(9,"Gobika");
        trainee.put(10,"Sibani");
        trainee.put(0,"Sanjeev");
        System.out.println(trainee.putIfAbsent(0,"gokul"));
        System.out.println(trainee.get(25));
        trainee.put(25,null);

        System.out.println(trainee.get(25));
        for (Map.Entry<Integer, String> integerStringEntry : trainee.entrySet()) {
            System.out.println("Key : " +integerStringEntry.getKey()+ " Values : " +integerStringEntry.getValue());
        }




    }
}
