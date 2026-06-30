package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1,"anas");
        student.put(2,"vetri");
        student.put(3,"kowshik");
        student.put(4,"siva");
        student.put(5,"pandi");

        Map<Integer, String> staff = new HashMap<>();
        staff.put(1,"krishna");
        staff.put(2,"sanjeev");

        elementsOfMap(student);
        iterateMap(student);
        findKeyMap(student);
        findValueMap(student);
        copyMap(student,staff);
        checkSameKeyValue(student,staff);
        removeKeyValue(student);
        updateValueByKey(student);
        printKeyValue(student);
        countOfKeyValue(student);

    }

    private static void countOfKeyValue(Map<Integer, String> student) {
        System.out.println("count of keys and values : " + student.size());
    }

    private static void printKeyValue(Map<Integer, String> student) {
        for (Map.Entry<Integer,String> data : student.entrySet()){
            System.out.println("keys \n" + data.getKey());
            System.out.println("values \n" + data.getValue());
        }
    }

    private static void updateValueByKey(Map<Integer, String> student) {
        Integer key = 1;
        String value = "abishek";
        student.replace(key, value);
        System.out.println("after replacing key " + key + "with value " + value + " : " + student);
    }

    private static void removeKeyValue(Map<Integer, String> student) {
        Integer key = 2;
        String value = "vetri";
        System.out.println("removing specific key value : " + student.remove(key,value));
    }

    private static void checkSameKeyValue(Map<Integer, String> student, Map<Integer, String> staff) {
        System.out.println("Same values in two maps : " + student.equals(staff));
    }

    private static void copyMap(Map<Integer, String> student, Map<Integer, String> staff) {
        student.putAll(staff);
        System.out.println("after copying one map to another : " + student);
    }

    private static void findValueMap(Map<Integer, String> student) {
        String value = "siva";
        System.out.println("find value in map : " + value + "---" + student.containsValue(value));
    }

    private static void findKeyMap(Map<Integer, String> student) {
        Integer key = 3;
        System.out.println("find key in the map : " + key + "---" +student.containsKey(key));
    }

    private static void iterateMap(Map<Integer, String> student) {
        for (Map.Entry<Integer,String> data : student.entrySet()){
            System.out.println(data.getKey() + "---" + data.getValue());
        }
    }

    private static void elementsOfMap(Map<Integer, String> student) {
        System.out.println("elements in map : " + student);
    }
}
