package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapPractice {
    public static void main(String[] args) {

        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(19,"Soundappan");
        studentMap.put(20,"Dhoni");
        studentMap.put(21,"Sathish");
        studentMap.put(0,"Sanjeev");

        Map<Integer,String> studentMap2 = new HashMap<>();
        studentMap2.put(11,"karthi");

        printMap(studentMap);
        iterateMap(studentMap);
        searchKey(19, studentMap);
        searchValue("Dhoni",studentMap);
        copyMap(studentMap,studentMap2);
        compareMap(studentMap,studentMap2);
        removePairMap(19, studentMap);
        updateValueMap(20, "karthi",studentMap);
        printKeysAndValues(studentMap);
        sizeOfMap(studentMap);

    }

    private static void sizeOfMap(Map<Integer, String> studentMap) {
       Set<Integer> keys =  studentMap.keySet();
       String[] values = studentMap.values().toArray(new String[0]);

        System.out.println("keys size : " + keys.size());
        System.out.println("values size : " + values.length);
    }

    private static void printKeysAndValues(Map<Integer, String> studentMap) {
        System.out.println("keys : " + studentMap.keySet());
        System.out.println("values : " + studentMap.values());
    }

    private static void updateValueMap(int key, String value, Map<Integer, String> studentMap) {

        if(studentMap.containsKey(key)){
            studentMap.replace(key,value);
        }
        else {
            System.out.println("does not contains key : " + key);
            System.out.println("add new pair : " + key + "  " + value);
            studentMap.put(key,value);
        }
        System.out.println(studentMap);
    }

    private static void removePairMap(int key, Map<Integer, String> studentMap) {
        System.out.println("remove : " + studentMap.remove(key));
    }

    private static void compareMap(Map<Integer, String> map, Map<Integer, String> map2) {
        System.out.println("map1 : " + map);
        System.out.println("map2 : " + map2);

        if(map.size() != map2.size()){
            System.out.println("Not equal");
            return;
        }

        for(Map.Entry<Integer,String> pair : map.entrySet() ){

            if( !(map2.containsKey(pair.getKey()) && pair.getValue().equals(map2.get(pair.getKey()))) ){
                System.out.println("Not equal");
                return;
            }
        }
        System.out.println("Equal");
    }

    private static void copyMap(Map<Integer, String> studentMap, Map<Integer, String> studentMap2) {
        System.out.println("map1 : " + studentMap);
        studentMap2.putAll(studentMap);
        System.out.println("map1 copy to map2 : " + studentMap2);
    }

    private static void searchValue(String value, Map<Integer, String> studentMap) {
        for(String name : studentMap.values()){
            if(name.equals(value)){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }

    private static void searchKey(int key, Map<Integer, String> studentMap) {
        System.out.println("contains : " + studentMap.containsKey(key));
    }

    private static void iterateMap(Map<Integer, String> studentMap) {
        System.out.println("Iterate map ");
        for (Map.Entry<Integer,String> student : studentMap.entrySet()){
            System.out.println("id : " + student.getKey() + " name : " + student.getValue());
        }
    }

    private static void printMap(Map<Integer, String> studentMap) {
        System.out.println("Print students");
        for (Integer key : studentMap.keySet()){
            System.out.println("id : " + key + " name : " + studentMap.get(key));
        }
    }
}
