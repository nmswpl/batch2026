package in.co.nmsworks.training.week3.day1;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
//        manageMapExercise();
        MapExamples me = new MapExamples();
        Map<Integer,String> students = new HashMap<>();
        me.addStudents(students);
        me.printMapInformation(students);
        me.keyPresentOrNot(students,3);
        me.valuePresentOrNot(students,"Rahul");
        me.takeCopyOfMap(students);
        me.compareTwoMaps(students);
        me.removeKeyAndValues(students,3);
        me.updateValue(students,2,"Starc");
        me.printKeys(students);
        me.printValues(students);
        me.displayMapSize(students);
    }

    private void displayMapSize(Map<Integer, String> students) {
        System.out.println("Size :: "+students.size());
    }

    private void printKeys(Map<Integer, String> students) {
        System.out.println("Printing keys");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }
    }

    private void printValues(Map<Integer, String> students) {
        System.out.println("Print Values");
        for (String value : students.values()) {
            System.out.println(value);
        }

    }

    private void updateValue(Map<Integer, String> students, int key, String newValue) {
        if (students.containsKey(key)) {
            students.put(key,newValue);
            System.out.println("Value Updated Sucessfully");
        }
        else {
            System.out.println("Key is not present in the Map");
        }

    }

    private void removeKeyAndValues(Map<Integer, String> students, int key) {
        if (students.containsKey(key)) {
            students.remove(key);
            printMapInformation(students);
            System.out.println("Deleted Sucessfully");
        }
        else {
            System.out.println("Key is not present in the Map");
        }
    }

    private void compareTwoMaps(Map<Integer, String> students) {
        Map<Integer, String> newStudents = new HashMap<>();
        newStudents.putAll(students);
        if (students.equals(newStudents))
            System.out.println("Two Maps are Equal");
        else
            System.out.println("Two Maps are not Equal");
    }

    private void takeCopyOfMap(Map<Integer, String> students) {
        Map<Integer, String> newStudents = new HashMap<>();
        newStudents.putAll(students);
        printMapInformation(newStudents);
    }

    private void valuePresentOrNot(Map<Integer, String> students, String value) {
        if (students.containsValue(value))
            System.out.println(value+" is present");
        else
            System.out.println(value+" is absent");
    }

    private void keyPresentOrNot(Map<Integer, String> students, Integer key) {
        if (students.containsKey(key))
            System.out.println(key+" is present");
        else
            System.out.println(key+" is absent");
    }

    private void printMapInformation(Map<Integer, String> students) {
        for (Integer key : students.keySet()) {
            System.out.println(key+" "+students.get(key));
        }
    }

    private void addStudents(Map<Integer, String> students) {
        students.put(1,"Siva");
        students.put(2,"Kumar");
        students.put(3,"Axar");
        students.put(4,"Pant");
        students.put(5,"Rahul");
    }

    private static void manageMapExercise() {
        Map<Integer,String> trainees = new HashMap<>();
        trainees.put(16,"Siva");
        trainees.put(15,"Saravana Paiyan");
        trainees.put(17,"Abishek");
        trainees.put(0,"Sanjeev");
        System.out.println(trainees.put(0,"Gokul"));
        System.out.println(trainees.get(25));
        trainees.put(25,null);
        for (Integer key : trainees.keySet()) {
            System.out.println(key+" - "+trainees.get(key));
        }
        for (Map.Entry<Integer, String> trainee : trainees.entrySet()) {
            System.out.println(trainee.getKey()+"--"+trainee.getValue());
        }
    }
}
