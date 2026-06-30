package in.co.nmsworks.training.week3.day2;

import java.util.Map;

import java.util.*;


public class MapPractice{
    public static void main(String[] args) {
//        mapPractice();
        mapCreation();
        mapIteration();
        searchKey();
        searchValue();
        compareMap();
        removeByKey();
        updateMap();
        printKeysValuesSeparately();
        count();



    }

    public static void count() {
        Map<Integer, String> map = mapContent();
        System.out.println("The count of key value pairs in map is: "+ map.size());
    }

    public static void printKeysValuesSeparately() {
        Map<Integer, String> map = mapContent();
        System.out.println("Keys...");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey());
        }
        System.out.println("Values....");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getValue());
        }
    }

    public static void updateMap() {
        System.out.println("update..");
        Map<Integer, String> map = mapContent();
        map.replace(1,"Priyanka","Sharmila");
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }

    public static void removeByKey() {
        System.out.println("Remove by key..");
        Map<Integer, String> map = mapContent();
        map.remove(2);
        for (Integer i : map.keySet()) {
            System.out.println(i + " "+map.get(i));
        }
    }

    public static void compareMap() {
        System.out.println("compare...");
        Map<Integer, String> map1 = mapContent();
        Map<Integer, String> map2 = mapContent();
        map2.replace(3,"Sunitha","Gayathri");

        for (Integer i : map2.keySet()) {
            System.out.println(i+" "+map2.get(i));
        }
        boolean isEqualValue = true;
        if(map1.size() != map2.size()){
            System.out.println("Not same maps");
            return;
        }
        else{
            for (Integer i : map1.keySet()) {
                if(map1.get(i).equals(map2.get(i))){
                    isEqualValue = true;
                }
                else{
                    isEqualValue=false;
                    break;
                }
            }
        }
        if(isEqualValue){
            System.out.println("Same maps");
        }
        else{
            System.out.println("Not same maps");
        }

    }

    public static void searchValue() {
        System.out.println("Search value..");
        Map<Integer, String> map = mapContent();
        String searchValue = "Sunitha";
        if(map.containsValue(searchValue)){
            System.out.println(searchValue + " is present");
        }
        else {
            System.out.println(searchValue + " not present");
        }
    }

    public static void searchKey() {
        System.out.println("Search key...");
        Map<Integer, String> map = mapContent();
        int searchKey = 2;
        if(map.containsKey(searchKey)){
            System.out.println("Key " + searchKey + " present, value: " + map.get(searchKey));
        }
        else {
            System.out.println("Key not present");
        }

    }

    public static void mapIteration() {
        Map<Integer, String> map = mapContent();
        System.out.println("Map iteration..");
        for (Integer i : map.keySet()) {
            System.out.println(i + "--->" + map.get(i));
        }

    }

    public static void mapCreation() {
        Map<Integer, String> map = mapContent();
        System.out.println(map);
    }

    private static Map<Integer, String> mapContent() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Priyanka");
        map.put(2,"Prathi");
        map.put(3,"Sunitha");
        return map;
    }

    public static void mapPractice(){
        Map<Integer, String> trainee = new HashMap<>();
        trainee.put(0,"sanjeev");
        System.out.println(trainee.put(0,"gokul"));
        trainee.put(1,"Priyanka");
        trainee.put(2,"Mohanasri");
        trainee.put(23,"aakil");
        System.out.println(trainee.get(25));
        System.out.println(trainee.put(25,null));
        System.out.println(trainee.get(25));
        for (Map.Entry<Integer, String> integerStringEntry : trainee.entrySet()) {
//            integerStringEntry.getKey();
            System.out.println(integerStringEntry.getKey()+"---->"+integerStringEntry.getValue());

        }
        trainee.getOrDefault(45,null);

    }
}
