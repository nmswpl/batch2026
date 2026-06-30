package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractices {
    public static void main(String[] args) {
        Map<Integer, String> trainees = new HashMap<>();
        trainees.put(22, "Farhaan");
        trainees.put(21, "Shathees");
        trainees.put(23, "Aakil");
        trainees.put(0, "Sanjeev");
        Map<Integer, String> backupMap = new HashMap<>();

        printElements(trainees);
        iterateMapElements(trainees);
        searchElementValue(trainees,"Aakil");
        searchElementKey(trainees,21);
        copyTwoMaps(trainees, backupMap);
        checkKeyValueOfTwoMaps(trainees,backupMap);
        removeSpecificKeyAndValue(trainees,21);
        updateValueInMap(trainees, 21 ,"Shathees");
        printKeyAndValueSeperately(trainees);
        countKeyValuePairs(trainees);
    }

    private static void countKeyValuePairs(Map<Integer, String> map) {
        Integer count =0;
        for (Integer i : map.keySet()) {
            count++;
        }
        System.out.println("The total count of key value pairs are :: " + count);
        System.out.println("__________________________________________________________________________________");

    }

    private static void printKeyAndValueSeperately(Map<Integer, String> map) {
        System.out.println();
        System.out.print(" Ids are :: ");
        for (Integer i : map.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Values are :: ");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("__________________________________________________________________________________");
    }

    private static void updateValueInMap(Map<Integer, String> map, int index, String updateValue) {
        System.out.println("The value has been updated from :: " + map.put(index, updateValue) + " to :: " + updateValue);
        System.out.println("__________________________________________________________________________________");
    }

    private static void removeSpecificKeyAndValue(Map<Integer, String> map, int index) {
        System.out.println("The Key and Value has been removed for :: " + map.remove(index));
        System.out.println("__________________________________________________________________________________");
    }

    private static void checkKeyValueOfTwoMaps(Map<Integer, String> mapOne, Map<Integer, String> mapTwo) {
        System.out.println("The Equalling of Two Maps are " + mapOne.equals(mapTwo));
        System.out.println("__________________________________________________________________________________");
    }

    private static void copyTwoMaps(Map<Integer, String> mapOne, Map<Integer, String> mapTwo) {
        mapTwo.putAll(mapOne);
        System.out.println("The Map has been copied");
        System.out.println("__________________________________________________________________________________");
    }

    private static void searchElementKey(Map<Integer, String> map, int index) {
        System.out.println("The key to search is :: " + map.containsKey(index));
        System.out.println("__________________________________________________________________________________");
    }

    private static void searchElementValue(Map<Integer, String> map, String element) {
        System.out.println("The element to search is :: " + map.containsValue(element));
        System.out.println("__________________________________________________________________________________");
    }

    private static void iterateMapElements(Map<Integer,String> map) {
        for (Integer i : map.keySet()) {
            System.out.println(" Id :: " + i + "  Value :: " + map.get(i));
        }
        System.out.println("__________________________________________________________________________________");
    }

    private static void printElements(Map<Integer, String> map) {
        System.out.println("__________________________________________________________________________________");

        System.out.println(map);
        System.out.println("__________________________________________________________________________________");
    }
}
