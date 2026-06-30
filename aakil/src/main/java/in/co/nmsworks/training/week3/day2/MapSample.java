package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<Integer, String> trainees = new HashMap<>();
        Map<Integer, String> freshers = new HashMap<>();
        freshers.put(1,"Gokul");
        traineeMap(trainees);
        iterateMap(trainees);

        int targetKey = 2;
        String targetValue = "Aakil";

        searchKey(trainees, targetKey);
        searchValue(trainees, targetValue);
        copyInto(trainees, freshers);
        compareMaps(trainees, freshers);
        removeEntry(trainees, targetKey);
        updateEntry(trainees, 20, "Virat");
        printKeysAndValues(trainees);
        countEntries(trainees);
    }

    private static void countEntries(Map<Integer, String> map) {
        System.out.println("NO OF KEY-VALUE PAIRS :: " + map.entrySet().size());
    }

    private static void printKeysAndValues(Map<Integer, String> map) {
        System.out.println("KEYS :: \n_______");
        map.keySet().forEach(System.out::println);
        System.out.println("VALUES :: \n______");
        map.values().forEach(System.out::println);
        System.out.println("----------");
    }

    private static void updateEntry(Map<Integer, String> map, int key, String value) {
        map.replace(key, value);
    }

    private static void removeEntry(Map<Integer, String> map, int targetKey) {
        String removedValue = map.remove(targetKey);
        if (removedValue != null)
            System.out.println("REMOVED :: {" + targetKey + ", \"" + removedValue + "\"}" );
        else
            System.out.println(targetKey + " has 'null' as value & removed");
    }

    private static void compareMaps(Map<Integer, String> mapOne, Map<Integer, String> mapTwo) {
        if(mapOne.size() != mapTwo.size()){
            System.out.println("NOT EQUAL maps");
            return;
        }
        for (Map.Entry<Integer, String> mapOneEntry : mapOne.entrySet()) {
            if (!mapTwo.get(mapOneEntry.getKey()).equals(mapOneEntry.getValue())){
                System.out.println("NOT EQUAL maps");
                return;
            }
        }
        System.out.println("EQUAL MAPS");
    }

    private static void copyInto(Map<Integer, String> source, Map<Integer, String> dest) {
        System.out.println("SOURCE :: " + source);
        System.out.println("DESTINATION :: " + dest);
        dest.putAll(source);
        System.out.println("COPIED INTO :: " + dest);
    }

    private static void searchValue(Map<Integer, String> map, String targetValue) {
        System.out.println((map.containsValue(targetValue)) ? "VALUE " + targetValue + " FOUND" : " VALUE NOT FOUND");

    }

    private static void searchKey(Map<Integer, String> map, int targetKey) {
        System.out.println((map.containsKey(targetKey)) ? "KEY " + targetKey + "FOUND" : "KEY NOT FOUND");
    }

    private static void iterateMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("--------");
        for (Integer id : map.keySet()) {
            System.out.println(id + "-->" + map.get(id));
        }
    }

    private static void traineeMap(Map<Integer, String> map) {
        map.put(23, "Aakil");
        map.put(22, "Farhaan");
        map.put(21, "Dhoni");
        map.put(2, "Max");


        for (Map.Entry<Integer, String> trainee : map.entrySet()) {
            System.out.println(trainee.getKey() +  " ----- > " + trainee.getValue());
        }
    }
}
