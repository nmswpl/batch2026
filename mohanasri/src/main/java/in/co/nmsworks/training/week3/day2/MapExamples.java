package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {
    public static void main(String[] args) {
        mapExamples();
    }

    private static void mapExamples() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"Sanjeev");
        map.put(1, "Priyanka");
        map.put(2, "Mohanasri");
        map.put(3, "Gabrella");
        System.out.println(map.put(0, "gokul"));
        System.out.println(map.get(25));
        System.out.println(map.put(25, null));
        System.out.println(map.get(25));
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.getKey();
            entry.getValue();
        }
//        for (Integer map : map.keySet()){
//            System.out.println(map + " : " + map.get(map));
//        }
//        System.out.println(map);


    }
}
