package in.co.nmsworks.training.week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        MapPractice mapPractice = new MapPractice();
        mapPractice.printMap();
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sibani");
        students.put(2, "Gobika");
        students.put(3, "Priya");
        students.put(4, "Brathika");
        mapPractice.iterateMap(students);
        mapPractice.searchKey(students, 2);
        mapPractice.searchValue(students, "Gobika");
        mapPractice.copyMap(students);
        Map<Integer, String> trainees = new HashMap<>();
        trainees.putAll(students);
        mapPractice.compareMap(students, trainees);
        mapPractice.removeKeyValue(students, 1, "Sibani");
        mapPractice.updateValue(students, 3, "Anushri");
        mapPractice.printKeysAndValues(students);
        mapPractice.countKeyValuePais(students);
    }

    private void countKeyValuePais(Map<Integer, String> students) {
        System.out.println("Count of Key Value Pairs : " + students.size());
    }

    private void printKeysAndValues(Map<Integer, String> students) {
        System.out.println("Keys : " + students.keySet());
        System.out.println("Values : " + students.values());
    }

    private void updateValue(Map<Integer, String> students, int key, String newVal) {
        System.out.println("Replaced Value : " + students.replace(key, newVal));
    }

    private void removeKeyValue(Map<Integer, String> students, int i, String value) {
        System.out.println("Removed Key Value : " + students.remove(i, value));
    }

    private void compareMap(Map<Integer, String> students, Map<Integer, String> trainees) {
        System.out.println("Maps are equal : " + students.equals(trainees));
        trainees.put(7, "Hema");
        System.out.println("Maps are equal : " + students.equals(trainees));
    }

    private void copyMap(Map<Integer, String> students) {
        Map<Integer, String> trainees = new HashMap<>();
        trainees.putAll(students);
        for (Map.Entry<Integer, String> trainee : trainees.entrySet()) {
            System.out.println("Trainee ID : " + trainee.getKey() + " " + "Name : " + trainee.getValue());
        }
    }

    private void searchValue(Map<Integer, String> students, String value) {
        System.out.println("Contains Value : " + students.containsValue(value) );
    }

    private void searchKey(Map<Integer, String> students, Integer i) {
        System.out.println("Contains Key : " + students.containsKey(i));
    }

    private void iterateMap(Map<Integer, String> students) {
        System.out.println();
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(" Student ID : " + student.getKey() + " " + "Name : " + student.getValue());
        }
    }

    private void printMap() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sibani");
        students.put(2, "Gobika");
        students.put(3, "Priya");
        students.put(4, "Brathika");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(" Student ID : " + student.getKey() + " " + "Name : " + student.getValue());
        }
    }
}
