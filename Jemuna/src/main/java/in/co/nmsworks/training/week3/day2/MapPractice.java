package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        studentDetails();
        listingStudents();
        specificKey();
        specificValue();
        copyMap();
        compareMap();
        removeKeyValue();
        updateValue();
        keyValuesDisplay();
        countKeyValue();
    }

    private static void countKeyValue() {
        Map<Integer, String> mapStudent=studentDetails();
        System.out.println("Size of the Key value pairs : " +mapStudent.size());

    }

    private static void keyValuesDisplay() {
        Map<Integer, String> mapStudent=studentDetails();
        System.out.println("Displaying the key and values Seperatedly :: ");
        for(Map.Entry<Integer, String> entry : mapStudent.entrySet()){
            System.out.println("Student Id : "+entry.getKey()+" Student Name : "+entry.getValue());
        }
    }

    private static void updateValue() {
        Map<Integer, String> mapStudent=studentDetails();
        mapStudent.replace(1,"Raji");
        System.out.println("List of Students : "+ mapStudent);

    }

    private static void removeKeyValue() {
        Map<Integer, String> mapStudent=studentDetails();
        System.out.println("Remove element from map : "+ mapStudent.remove(2) );
    }

    private static void compareMap() {
        Map<Integer, String> mapStudent=studentDetails();
        Map<Integer, String> mapStudent2= new HashMap<>();
        mapStudent2.putAll(mapStudent);
        System.out.println("Comparing Two maps : "+ mapStudent.equals(mapStudent2));

    }

    private static void copyMap() {
        Map<Integer, String> mapStudent=studentDetails();
        Map<Integer, String> mapStudent2= new HashMap<>();
        System.out.println("Copy Map : ");
        mapStudent2.putAll(mapStudent);
        for(Map.Entry<Integer, String> entry : mapStudent2.entrySet()){
            System.out.println("Student Id : "+entry.getKey()+" Student Name : "+entry.getValue());
        }

    }

    private static void specificValue() {
        Map<Integer, String> mapStudent=studentDetails();
        System.out.println("Searching student with name Jemuna : "+mapStudent.containsValue("Jemuna"));

    }

    private static void specificKey() {
        Map<Integer, String> mapStudent=studentDetails();
        System.out.println("Searching student with id 1 : "+mapStudent.get(1));

    }

    private static void listingStudents() {
        Map<Integer, String> mapStudent=studentDetails();
        for(Map.Entry<Integer, String>entry : mapStudent.entrySet()){
            System.out.println("Student Id : "+entry.getKey()+" Student Name : "+entry.getValue());
        }
    }

    private static Map<Integer, String> studentDetails() {
        Map<Integer, String> mapStudent= new HashMap<>();
        mapStudent.put(1,"Jemuna");
        mapStudent.put(2,"Anu");
        mapStudent.put(3,"Yaazhini");
        return mapStudent;

    }
}
