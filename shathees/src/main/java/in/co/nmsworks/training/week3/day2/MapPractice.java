package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        System.out.println("-----create Map-----");
        create(student);
        System.out.println("-------Iterate map------");
        iterate(student);
        System.out.println("--------search key--------");
        searchKey(student,2);
        System.out.println("------search value-------");
        searchValue(student,"shathees gv");

        Map<Integer,String> student1 = new HashMap<>();
        student1.put(4,"dhoni k");
        student1.put(5,"kl rakul");
        System.out.println("--------copy maps---------");
        mapCopy(student1, student);
        System.out.println("-------remove key-----------");
        removeKey(student,1);
        System.out.println("-------print key value seperately-------");
        printKeyValueSepeartly(student1);
        System.out.println("-------count key value pairs--------");
        countKeyValuePairs(student1);
        System.out.println("--------update key-----------");
        updateKey(student1,4);
        System.out.println("---------compare maps--------");
        checkTwoMapsHasSameKeyValuePairs(student, student1);

    }

    private static void checkTwoMapsHasSameKeyValuePairs(Map<Integer, String> student, Map<Integer, String> student1) {
        for (Integer i : student.keySet()) {
            if (!student1.containsKey(i)){
                System.out.println("keys are different");
                if (student1.containsValue(student.get(i))){
                    System.out.println("values are same");
                    return;
                }else {
                    System.out.println("values are different");
                }
                return;
            } else {
                System.out.println("both have same key value pairs");
            }

        }
    }

    private static void countKeyValuePairs(Map<Integer, String> student1) {
        System.out.println("size of student1 Map :"+student1.size());
    }

    private static void printKeyValueSepeartly(Map<Integer, String> student1) {
        for (Map.Entry<Integer, String> entry : student1.entrySet()) {
            System.out.println("keys of student Map "+entry.getKey());
            System.out.println("value of student Map "+entry.getValue());

        }

    }

    private static void updateKey(Map<Integer, String> student1,Integer key) {
        student1.put(key,"farhaan");
        System.out.println(student1);

    }

    private static void removeKey(Map<Integer, String> student,Integer key) {
        student.remove(key);
        System.out.println(student);
    }

    private static void mapCopy(Map<Integer, String> student1, Map<Integer, String> student) {
        student.putAll(student1);
        System.out.println(student);
    }

    private static void searchValue(Map<Integer, String> student,String value) {
        if (student.containsValue(value)){
            System.out.println("value found ----"+value);
        }else {
            System.out.println("value not found ");
        }

    }

    private static void searchKey(Map<Integer, String> student,int key) {
        if (student.containsKey(key)){
            System.out.println("key found "+key);
        }else {
            System.out.println("key not found");
        }

    }

    private static void iterate(Map<Integer, String> student) {
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("id : "+entry.getKey());
            System.out.println("name : "+entry.getValue());
        }
    }

    private static void create(Map<Integer, String> student) {
        student.put(1,"shathees gv");
        student.put(2,"hari f");
        student.put(3,"raj sekar dk");
        System.out.println(student);

    }
}
