package in.co.nmsworks.training.week3.day1;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(14, "anas");
        names.put(13, "kowshik");
        names.put(15, "pandi");
        names.put(0,"sanjeev");
        System.out.println(names.put(0,"gokul"));
        System.out.println(names.get(25));
        names.put(25, null);
        System.out.println(names.get(25));

        for (Map.Entry<Integer,String> data : names.entrySet()){
            System.out.println("key : " + data.getKey() + "---" + "value : " + data.getValue());
        }
    }
}
