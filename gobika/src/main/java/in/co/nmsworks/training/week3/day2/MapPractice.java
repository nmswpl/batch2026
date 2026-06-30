package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        createMap();
        iterateMap();
        searchKey();
        searchValue();
        copyMap();
        compareMaps();
        removeKeyValue();
        updateValue();
        printKeysAndValues();
        countKeyValuePairs();
    }

    private static void countKeyValuePairs() {
        System.out.println("Count Key and Value Pairs .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");
        System.out.println("Size : "+ student.size());
    }

    private static void printKeysAndValues() {
        System.out.println("Print Key and Value .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        System.out.println("Keys : "+student.keySet());
        System.out.println("Values : "+ student.values());

    }

    private static void updateValue() {
        System.out.println("Update Value .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        System.out.println(student.replace(3,"Jemuna"));
    }

    private static void removeKeyValue() {
        System.out.println("Remove Key and Value .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        System.out.println(student.remove(1));
    }

    private static void compareMaps() {
        System.out.println("Compare Map .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        Map<Integer,String> employee = new HashMap<>();
        employee.put(1,"Gobika");
        employee.put(2,"Sibani");

        System.out.println(student.equals(employee));


    }

    private static void copyMap() {
        System.out.println("Copy Map .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        Map<Integer,String> employee = new HashMap<>();
        employee.putAll(student);
        for (Map.Entry<Integer, String> employeeEntry : employee.entrySet()) {
            System.out.println("Key : " +employeeEntry.getKey()+ " Values : " + employeeEntry.getValue());
        }
    }

    private static void searchValue() {
        System.out.println("Search Value .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        System.out.println("Search Value : "+ student.containsValue("Gobika"));
    }

    private static void searchKey() {
        System.out.println("Search Key .....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        System.out.println("Search key : "+ student.containsKey(3));
    }

    private static void iterateMap() {

        System.out.println("Iterate Map");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        for (Map.Entry<Integer, String> studentEntry : student.entrySet()) {
            System.out.println("Key : " +studentEntry.getKey()+ " Values : " + studentEntry.getValue());
        }
    }

    private static void createMap() {
        System.out.println("Create Map ....");
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Gobika");
        student.put(2,"Sibani");
        student.put(3,"Brathika");
        student.put(4,"Hema");

        for (Map.Entry<Integer, String> studentEntry : student.entrySet()) {
            System.out.println("Key : " +studentEntry.getKey()+ " Values : " + studentEntry.getValue());
        }
    }
}
