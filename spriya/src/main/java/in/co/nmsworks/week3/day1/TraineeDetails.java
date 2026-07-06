package in.co.nmsworks.week3.day2;

import java.util.*;

public class TraineeDetails {


    public static void main(String[] args) {
        Map<Integer, String> trainee = new HashMap<>();

//        trainee.put(10, "SibaniSelvi");
////        System.out.println();
//    trainee.put(11, "Priyadharshini");
//        trainee.put(12, "VetriSelvan");

        trainee.put(0, "Priya");
        trainee.put(0, "Gokul");

        for (Map.Entry<Integer, String> e : trainee.entrySet()) {
            System.out.println(e.getKey() + "," + e.getValue());
        }
        System.out.println(trainee.get(25));
        trainee.put(25,null);
        System.out.println(trainee.get(25));
    }

}

