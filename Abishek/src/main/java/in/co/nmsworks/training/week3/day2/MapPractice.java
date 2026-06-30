package in.co.nmsworks.training.week3.day2;
import com.sun.javaws.IconUtil;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        printEntries();
        iterateMap();
        searchKey();
        searchValue();
        copyMap();
        compareMap();
        removeKeyAndValue();
        updateValue();
        printKeyAndValue();
        countKeys();
    }

    private static void countKeys() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");
        int count = 0;

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            count++;
        }

        System.out.println("Number of Keys: "+count);
    }

    private static void printKeyAndValue() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        System.out.println("Keys: ");
        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.print(list.getKey()+", ");
        }

        System.out.println("Values: ");

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.print(list.getValue()+", ");
        }
    }

    private static void updateValue() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }

        nameList.put(18,"Pandi");

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }

    }

    private static void removeKeyAndValue() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        nameList.remove(18);
        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }
    }

    private static void compareMap() {

        Map<Integer,String>  nameList1 = new HashMap<>();

        nameList1.put(16,"Siva");
        nameList1.put(17,"Abishek");
        nameList1.put(18,"Mani");

        Map<Integer,String>  nameList2 = new HashMap<>();

        nameList2.put(16,"Siva");
        nameList2.put(17,"Abishek");
        nameList2.put(18,"mani");

        if(nameList2.equals(nameList1))
        {
            System.out.println("True");
        }

        else
        {
            System.out.println("False");
        }

    }

    private static void copyMap() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        Map<Integer,String> cityList = new HashMap<>();
        cityList.put(1,"Chennai");
        cityList.put(2,"Coimbatore");

        nameList.putAll(cityList);

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }
    }

    private static void searchValue() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        if(nameList.containsValue("Mani"))
        {
            System.out.println("Found value");
        }

        else
        {
            System.out.println("Not found");
        }
    }

    private static void searchKey() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        if(nameList.containsKey(17))
        {
            System.out.println("Found key");
        }

        else
        {
            System.out.println("Not found");
        }
    }

    private static void iterateMap() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }
    }

    private static void printEntries() {

        Map<Integer,String>  nameList = new HashMap<>();

        nameList.put(16,"Siva");
        nameList.put(17,"Abishek");
        nameList.put(18,"Mani");

        for (Map.Entry<Integer,String> list : nameList.entrySet())
        {
            System.out.println(list.getKey()+": "+list.getValue());
        }
    }
}
