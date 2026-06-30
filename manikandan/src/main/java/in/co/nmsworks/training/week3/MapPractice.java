package in.co.nmsworks.training.week3;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer,String> student= new HashMap<>();
        createMap();
        iterateMap();
        searchKey();
        searchValue();
        copyMap();
        compareMap();
        updateValues();
        removetheElement();
        printKeyAndValue();
        countPairs();


    }

    private static void countPairs() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("10.count Pairs");
        System.out.println(student.size());
    }

    private static void printKeyAndValue() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");

        System.out.println(student.keySet());
        System.out.println(student.values());

    }

    public static void removetheElement() {
         Map<Integer,String> student= new HashMap<>();
         student.put(1,"MADS");
         student.put(2,"MANS");
         student.put(3,"PRI");
         student.put(4,"DHIVS");
         System.out.println("8.REMOVE ");
         System.out.println( student.remove(4));

    }

    private static void updateValues() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("7.UPDATE");
        System.out.println(student.put(4,"SHAN"));

    }

    private static void compareMap() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1,"MANE");
        newMap.put(2,"SAN");
        System.out.println("6.IS EQUALS");
        System.out.println( newMap.equals(student));
    }

    private static void copyMap() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        Map<Integer, String> newMap = new HashMap<>();
        newMap.putAll(student);
        System.out.println("5.COPY MAP");
        System.out.println(newMap);

    }

    private static void searchValue() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("4.CONTAINS VALUES ");
        System.out.println(student.containsValue("MADS"));

    }

    private static void searchKey() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("3.CONTAINS KEY");
        System.out.println(student.containsKey(1));



    }

    private static void iterateMap() {


        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("2.Iterate");
        for(Map.Entry<Integer,String>entry: student.entrySet()){
            System.out.println("ID "+entry.getKey()+" "+"Name "+entry.getValue());
        }
    }

    private static void createMap() {
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"MADS");
        student.put(2,"MANS");
        student.put(3,"PRI");
        student.put(4,"DHIVS");
        System.out.println("1.create");
        System.out.println(student);

    }

}
