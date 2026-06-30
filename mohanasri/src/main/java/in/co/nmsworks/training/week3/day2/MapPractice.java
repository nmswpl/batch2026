package in.co.nmsworks.training.week3.day2;

import in.co.nmsworks.training.week1.exam.SetOne;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        MapPractice mp = new MapPractice();
        Map<Integer, String> studentsMap = new HashMap<>();
        Map<Integer, String> studentsMap2 = new HashMap<>();


        mp.addData(studentsMap);
        mp.iterateStudents(studentsMap);
        mp.searchKey(studentsMap, 3);
        mp.searchValue(studentsMap, "Mohana");
        mp.copyMap(studentsMap2, studentsMap);
        mp.compareTwoMap(studentsMap, studentsMap2);
        mp.remove(studentsMap, 1, "Mohana");
        mp.update(studentsMap, "Vimala", "Vital");
        mp.printKeysAndValues(studentsMap2);
        mp.count(studentsMap2);
    }

    private void count(Map<Integer, String> studentsMap2) {
        int count = 0;
        for (Integer i : studentsMap2.keySet()){
            count++;
        }
        System.out.println("\nCount : " + count);
    }

    private void printKeysAndValues(Map<Integer, String> studentsMap2) {
        System.out.println("Keys ");
            for (Map.Entry<Integer, String> entry : studentsMap2.entrySet()) {
                System.out.print(entry.getKey() + " ");
            }
//                System.out.println("Key : " +  entry.getKey() + "," + " Value : " + entry.getValue());
        System.out.println("\nValues");
        for (Map.Entry<Integer, String> entry : studentsMap2.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    private void update(Map<Integer, String> studentsMap, String vimala, String vital) {
        System.out.println("updating vimala to vimal");
        studentsMap.replace(2, "Vimala", "Vimal");
        System.out.println(studentsMap);
    }

    private void remove(Map<Integer, String> studentsMap, int key ,String name) {
        System.out.println("removing 0 : mohana");
        studentsMap.remove(key, name);
        System.out.println(studentsMap);
    }



    private void compareTwoMap(Map<Integer, String> studentsMap, Map<Integer, String> studentsMap2) {
        boolean compare = false;
        for (Integer i : studentsMap.keySet()) {
            if (studentsMap.size() == studentsMap2.size()) {
                if (studentsMap.get(i).equals(studentsMap2.get(i))){
                    compare = true;
                }
            }
        } System.out.println("comparison : "+compare);
    }

    private void copyMap(Map<Integer, String> studentsMap2, Map<Integer, String> studentsMap) {
        studentsMap2.putAll(studentsMap);
        System.out.println("Displaying 2nd Map : " + studentsMap2);
    }

    private void searchValue(Map<Integer, String> studentsMap, String name) {
        System.out.println("Contains " + name + " ? " +studentsMap.containsValue(name));
    }

    private void searchKey(Map<Integer, String> studentsMap, Integer n) {
        System.out.println("Contains " + n + " ? " +studentsMap.containsKey(n));

    }

    private void iterateStudents(Map<Integer, String> studentsMap) {
        for (Integer i : studentsMap.keySet()){
            System.out.println(i + " : " + studentsMap.get(i));

        }

    }

    private void addData(Map<Integer, String> studentsMap) {
        studentsMap.put(1, "Mohana");
        studentsMap.put(2, "Vimala");
        studentsMap.put(3, "Sam");
        studentsMap.put(4, "Nandy");

        System.out.println(studentsMap);
    }
}
