package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {
    public static void main(String[] args) {
        Map<Integer, String > student = new HashMap<>();
        student.putIfAbsent(1, "Hema");
        student.putIfAbsent(2, "Anu");
        student.putIfAbsent(3, "Gabriella");

        System.out.println("Created Map => "+ student);

//        createMap();
        iterateMap(student);
        searchKey(student,5);
        searchValue(student,"Hema");

        Map<Integer, String> student2 = new HashMap<>();

        student2 = copyMap(student2, student);

        compareMaps(student, student2);

        System.out.println("After Compare : \n"+ student+"\n"+student2);

        removePair(student, 2);

        System.out.println("\nAfter Remove : ");
        System.out.println(student);
        System.out.println(student2);

        updatePair(student, 1, "Hema B R");

        printKeysAndValues(student);
        printKeysAndValues(student2);

        countPairs(student2);
        countPairs(student);


    }

    private static void countPairs(Map<Integer, String> map) {
        System.out.println(map.size());
    }

    private static void printKeysAndValues(Map<Integer, String> map) {
        System.out.println("Keys => "+ map.keySet());
        System.out.println("Values => "+ map.values());
    }

    private static void updatePair(Map<Integer, String> map, int key, String value) {
        System.out.println( map.replace(key, value));
    }

    private static void removePair(Map<Integer, String> map, int key) {
        System.out.println(map.remove(key));
    }

    private static void compareMaps(Map<Integer, String> map1, Map<Integer, String> map2) {
        System.out.println(map1);
        System.out.println(map2);
        System.out.println( map1.entrySet().equals( map2.entrySet()));
    }

    /*
        Map<Integer, String> student2 = new HashMap<>();

        student2 = copyMap(student2, student);

     */

    private static Map<Integer, String> copyMap(Map<Integer, String> map2, Map<Integer, String> map1) {
        map2.putAll(map1);
        for (Integer integer : map1.keySet()) {
            map2.put(integer, map1.get(integer));
        }

        System.out.println("\nCopied Map => "+map2);
        return map2;
    }

    private static void searchValue(Map<Integer, String> map, String value) {
        System.out.println( "Search Value => "+ map.containsValue(value) );
    }

    private static void searchKey(Map<Integer, String> map, int key) {
        System.out.println("Search Key => "+map.containsKey(key));
    }

    private static void iterateMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static void createMap() {
        Map<Integer, String > student = new HashMap<>();
        student.putIfAbsent(1, "Hema");
        student.putIfAbsent(2, "Anu");
        student.putIfAbsent(3, "Gabriella");

        System.out.println("Created Map => "+ student);
    }

}
