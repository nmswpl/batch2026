package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        printMap(getStudentMap());
        iterateMap(getStudentMap());
        searchUsingKey(getStudentMap(), 10);
        searchUsingValue(getStudentMap(), "kowshik");
        createCopyOfMapIntoAnother(getStudentMap());
        compareMaps(getStudentMap(), getCityMap());
        compareMaps(getStudentMap(), getStudentMap());
        removeElement(getStudentMap());
        updateElement(getStudentMap());
        printKeysAndValuesSeperately(getStudentMap());
        printCountOfKeyValuePairsInMap(getStudentMap());
    }

    private static void printCountOfKeyValuePairsInMap(Map<Integer, String> studentMap) {
        System.out.println("Total count : " + studentMap.size());
    }


    private static void printKeysAndValuesSeperately(Map<Integer, String> studentMap) {
        System.out.println("Keys : ");
        for (Integer key : studentMap.keySet()) {
            System.out.println("Key : " + key);
        }

        System.out.println("Values : ");
        for (String value : studentMap.values()) {
            System.out.println("Value : " + value);
        }
    }

    private static void updateElement(Map<Integer, String> studentMap) {
        System.out.println("Before update : " + studentMap);
        studentMap.put(1, "Kowshik Senthil Murugan");
        System.out.println("After update : " + studentMap);
    }


    private static void removeElement(Map<Integer, String> studentMap) {
        System.out.println("Before remove : " + studentMap);
        studentMap.remove(1);
        System.out.println("After remove : " + studentMap);
    }

    private static void compareMaps(Map<Integer, String> map1, Map<Integer, String> map2) {
        if (map1.size() != map2.size()) {
            System.out.println("Map 1 and Map 2 are not equal");
            return;
        }

        if(map1.equals(map2)) {
            System.out.println("Map 1 and Map 2 are equal");
        }
        else {
            System.out.println("Map 1 and Map 2 are not equal");
        }
    }

    private static void createCopyOfMapIntoAnother(Map<Integer, String> studentMap) {
        System.out.println("Input map : " + studentMap);

        Map<Integer, String> copiedMap = new HashMap<>(studentMap);

        System.out.println("Copied map : " + copiedMap);
    }

    private static void searchUsingValue(Map<Integer, String> studentMap, String value) {
        if (studentMap.containsValue(value)) {
            System.out.println(value + " present in map.");
        }
        else {
            System.out.println(value + " not present in map");
        }
    }

    private static void searchUsingKey(Map<Integer, String> studentMap, int key) {
        if (studentMap.containsKey(key)) {
            String value = studentMap.get(key);
            System.out.println("Element in " + key + " is : " + value);
        }
        else {
            System.out.println("Key not present");
        }
    }

    private static void iterateMap(Map<Integer, String> studentMap) {
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID : " + entry.getKey() + " | " + "Name : " + entry.getValue());
        }
    }

    private static void printMap(Map<Integer, String> studentMap) {
        System.out.println(studentMap);
    }

    private static Map<Integer, String> getStudentMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kowshik");
        map.put(2, "Anas");
        map.put(3, "Vetri");

        return map;
    }

    private static Map<Integer, String> getCityMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Chennai");
        map.put(2, "Bangalore");
        map.put(3, "Hyderabad");

        return map;
    }

}
