package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice practice = new MapPractice();
        Map<Integer, String> student = new HashMap<>();
        student.put(1,"Brathika");
        student.put(2,"Amrutha");
        student.put(3,"Chinthana");
        student.put(4,"Lidwina");
        student.put(5,"Rithika");
        student.put(6,"Kabi");
        student.put(7,"Ramya");
        student.put(8,"Vasu");
        student.put(9,"Nikesh");
        student.put(10,"lokesh");
        practice.createAndPrintMap();
        practice.iterateThroughMap(student);
        practice.searchSpecificKey(student,2);
        practice.searchSpecificValue(student,"Nikesh");
        Map<Integer, String> student2 = new HashMap<>();
        student2.put(11,"Praveen");
        student2.put(12,"Nathish");
        practice.copyFromOneMapToAnother(student,student2);
        practice.compareTwoMap(student,student2);
        practice.removeKeyAndValue(student, 10);
        practice.updateValue(student,8,"Vasu","Vasudevan");
        practice.printkeysAndValuesSeparetly(student);
        practice.countKeyValuePair(student);

    }

    private void countKeyValuePair(Map<Integer, String> student) {
        System.out.println("No of key value pair: "+student.size());
    }

    private void printkeysAndValuesSeparetly(Map<Integer, String> student) {
        System.out.println("Id: "+student.keySet());
        System.out.println("Values: ");
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getValue()+" ");
        }
    }

    private void updateValue(Map<Integer, String> student, int key, String oldname, String newname) {
        System.out.println("Before changing: "+student);
        student.replace(key,oldname,newname);
        System.out.println("After changing: "+student);
    }

    private void removeKeyAndValue(Map<Integer, String> student, int key) {
        System.out.println("Before removing: "+student);
        student.remove(key);
        System.out.println("After removing: "+student);
    }

    private void compareTwoMap(Map<Integer, String> student, Map<Integer, String> student2) {
        if (student.equals(student2)) {
            System.out.println("Both the map are equal");
        }
        else {
            System.out.println("Both the map are not equal");
        }
    }

    private void copyFromOneMapToAnother(Map<Integer, String> student, Map<Integer, String> student2) {
        System.out.println("Before coping: "+student);
        student.putAll(student2);
        System.out.println("After coping: "+student);
    }

    private void searchSpecificValue(Map<Integer, String> student, String value) {
        if (student.containsValue(value)) {
            System.out.println(value+" is found in map");
        }
        else {
            System.out.println(value+" is not found in map");
        }
    }

    private void searchSpecificKey(Map<Integer, String> student, int key) {
        if (student.containsKey(key)) {
            System.out.println(key+" found in map");
        }
        else {
            System.out.println(key+" not found in map");
        }
    }

    private void iterateThroughMap(Map<Integer, String> student) {
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Id: "+entry.getKey()+" Values: "+entry.getValue());
        }
    }

    private void createAndPrintMap() {
        Map<Integer, String> student = new HashMap<>();
        student.put(1,"Brathika");
        student.put(2,"Amrutha");
        student.put(3,"Chinthana");
        student.put(4,"Lidwina");
        student.put(5,"Rithika");
        student.put(6,"Kabi");
        student.put(7,"Ramya");
        student.put(8,"Vasu");
        student.put(9,"Nikesh");
        student.put(10,"Lokesh");
        System.out.println(student);

    }
}
