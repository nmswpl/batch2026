package in.co.nmsworks.training.week3.day1;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<Integer,String> studentMap=new HashMap<>();

        addValuesToMap(studentMap);     //1

        printMap(studentMap);       //2

        searchForKey(studentMap,4);       //3
        checkKeyIsPresent(studentMap,3);

        searchForValue(studentMap,"Pandi");     //4


        Map <Integer,String> sMap=new HashMap<>();
        sMap.putAll(studentMap);
        printMap(sMap);                         //5


        checkMapsAreEqual(studentMap, sMap);        //6

        removeId(studentMap,3);
        printMap(studentMap);           //7

//        printMap(sMap);
        replaceValueForId(studentMap,2,"Sivakumar");        //8

        printMapKeyAndValues(studentMap);


        mapSize(studentMap);            //9

    }

    private static void printMapKeyAndValues(Map<Integer, String> studentMap) {
        System.out.println("Print key");
        for (Integer id : studentMap.keySet())
        {
            System.out.println(id);
        }

        System.out.println("Print Values");
        for (String value :studentMap.values())
        {
            System.out.println(value);
        }
    }

    private static void mapSize(Map<Integer, String> studentMap) {
        System.out.println("map size "+studentMap.size());
    }

    private static void replaceValueForId(Map<Integer, String> studentMap,Integer id,String name) {
        studentMap.replace(id,name);
        printMap(studentMap);
    }

    private static String removeId(Map<Integer, String> studentMap,Integer id) {
        return studentMap.remove(id);
    }

    private static void checkMapsAreEqual(Map<Integer, String> studentMap, Map<Integer, String> sMap) {
        if(studentMap.equals(sMap)) {
            System.out.println("Both maps are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }

    private static void checkKeyIsPresent(Map<Integer, String> studentMap,Integer id) {
        System.out.println("Key present : "+studentMap.containsKey(id));
    }

    private static void searchForValue(Map<Integer, String> studentMap,String name) {
        System.out.println("Contains value in map "+studentMap.containsValue(name));
    }

    private static void searchForKey(Map<Integer, String> studentMap,Integer id) {
        System.out.println("Key value is "+studentMap.get(id));
    }

    private static void printMap(Map<Integer, String> studentMap) {
        System.out.println("Map :" );
        for (Integer key : studentMap.keySet()) {
            System.out.println(key+" ==>"+ studentMap.get(key));
        }
    }

    private static void addValuesToMap(Map<Integer, String> studentMap) {
        studentMap.put(1,"Pandi");
        studentMap.put(2,"Siva");
        studentMap.put(3,"Abishek");
    }
}
