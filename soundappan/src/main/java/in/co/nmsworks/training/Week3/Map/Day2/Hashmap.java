package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void addElements(Map<Integer,String>map){
System.out.println("1. ");
        map.put(101,"Soundappan");
        map.put(102,"Dhoni");
        map.put(103,"Mani");
        map.put(104,"Sathish");
        System.out.println(map);
    }
    public static void iterateThroughElement(Map<Integer,String>map){
        System.out.println("2. ");
        for(Map.Entry<Integer,String>ent: map.entrySet()){
            System.out.println(" User ID : " +ent.getKey()+ " User Name : "+ent.getValue());
        }
    }
    public static void containsKey(Map<Integer,String>map,Integer key) {
        System.out.println("3. ");
        for (Map.Entry<Integer, String> ent : map.entrySet()) {
          if(ent.getKey()==key){
                System.out.println(ent.getValue()+" Contains ");
                return;
            }
        }
        System.out.println("Not Contains");
    }
    public static void containsValue(Map<Integer,String>map,String value) {
        System.out.println("4. ");
        for (Map.Entry<Integer, String> ent : map.entrySet()) {
            if (ent.getValue().contains(value)) {
                System.out.println(ent.getKey());
                return;
            }
        }
        System.out.println("Not Contains");
    }

        public static void copyElement(Map<Integer,String>map,Map<Integer,String>map1){
            System.out.println("5. ");
            map1.putAll(map);
            System.out.println(map1);
        }
        public static void containsAllElement(Map<Integer,String>map,Map<Integer,String>map1){
            System.out.println("6. ");
       boolean value=map.values().containsAll(map1.values());
       System.out.println("Contains All element : "+value);
        }
        public static void removeSpecificElement(Map<Integer,String>map){
            System.out.println("7. ");
        map.remove(102);
            System.out.println(map);
        }
        public static void updateTheValue(Map<Integer,String>map){
            System.out.println("8. ");
        map.replace(101,"Guna");
            System.out.println(map);
        }
        public static void printElement(Map<Integer,String>map){
            System.out.println("9. ");
            for(Map.Entry<Integer,String>ent: map.entrySet()){
                System.out.println(" User ID : " +ent.getKey()+ " User Name : "+ent.getValue());
            }
        }
    public static void countElement(Map<Integer,String>map){
        System.out.println("10. ");
        System.out.println(map.size());
    }



    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        Map<Integer,String>map1=new HashMap<>();
        addElements(map);
        System.out.println();
        iterateThroughElement(map);
        System.out.println();
        containsValue(map,"Soundappan");
        System.out.println();
        copyElement(map,map1);
        System.out.println();
        removeSpecificElement(map);
        System.out.println();
        updateTheValue(map);
        System.out.println();
        printElement(map);
        System.out.println();
        countElement(map);
        System.out.println();
        containsKey(map,101);
        System.out.println();
    }
}
