package in.co.nmsworks.training.week3.day1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        mapDemo();
    }

    private static void mapDemo() {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Gabriella");
        map.put(4, "Hema");
        System.out.println(map.put(5, "AnuSri"));

        map.put(0, "Sanjeev");
        System.out.println(map.put(0, "Gokul"));

        System.out.println(map.entrySet());

        System.out.println(map.get(25));
        map.put(25, null);
        System.out.println(map.get(25));



    }
}
