package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        MapCollection mapCollection = new MapCollection();
        mapCollection.traineeMap();
    }

    private void traineeMap() {
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(0, "Sanjeev");
        System.out.println(idToName.put(0, "Gokul"));
        idToName.put(9, "Gobika");
        idToName.put(10,"Sibani");
        idToName.put(11, "Priya");
        for(Map.Entry<Integer, String> entry : idToName.entrySet()) {
            System.out.println( "Key : "+ entry.getKey() + " " + " Value : " + entry.getValue());
        }
        System.out.println(idToName.get(25));
        idToName.put(25, null);
        System.out.println(idToName.get(25));
        for (Map.Entry<Integer, String> integerStringEntry : idToName.entrySet()) {
            System.out.println("Key : " + integerStringEntry.getKey() + " " + " Value : " + integerStringEntry.getValue());
        }

    }
}
