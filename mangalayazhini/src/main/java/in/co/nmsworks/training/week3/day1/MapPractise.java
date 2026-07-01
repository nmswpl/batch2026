package in.co.nmsworks.training.week3.day1;
import java.util.HashMap;
import java.util.Map;

public class MapPractise {
    public static void main(String[] args) {
        /*
        * 1. Write a Java program to create a map, add some student ID and student name pairs, and print all the entries.
2. Write a Java program to iterate through all the key-value pairs in a map.
3. Write a Java program to search for a specific key in a map.
4. Write a Java program to count the total number of key-value pairs in a map.
a program to search for a specific value in a map.
5. Write a Java program to create a copy of one map into another map.
6. Write a Java program to compare two maps and check whether they contain the same key-value pairs.
7. Write a Java program to remove a specified key and its corresponding value from a map.
8. Write a Java program to update the value associated with a specified key in a map.
9. Write a Java program to print all the keys and all the values of a map separately.
        *
        *
        * */


        MapPractise obj = new MapPractise();
        Map<Integer,String> idAndName = obj.createIdAndNameMap();

        Map<String, Integer> subAndCredits1 = obj.createSubjectsAndCreditsMap();
        subAndCredits1.put("Maths M1",4);
        subAndCredits1.put("Pyhon",3);
        subAndCredits1.put("Java",4);
        subAndCredits1.put("Physics",2);

        Map<String, Integer> subAndCredits2 = obj.createSubjectsAndCreditsMap();
//        subAndCredits1.put("Maths M2",4);
//        subAndCredits1.put("Computer Networks",4);
//        subAndCredits1.put("Web Technology",2);

        subAndCredits2.put("Maths M1",4);
        subAndCredits2.put("Pyhon",3);
        subAndCredits2.put("Java",4);
        subAndCredits2.put("Physics",2);

        obj.printMap(idAndName);
        obj.printSubjectMap(subAndCredits1);
        obj.printSubjectMap(subAndCredits2);


        obj.searchKeyInMap(idAndName, 2);
        obj.searchValueInMap(idAndName, "priya");
        obj.createCopyOfMap(idAndName);
        obj.compareTwoMaps(subAndCredits1, subAndCredits2);
        obj.removeKeyFromMap(idAndName,2);
        obj.updateValueInMap(idAndName,3,"Malar");
        obj.printKeysAndValues(idAndName);



    }

    private void printKeysAndValues(Map<Integer, String> map) {
        System.out.print("Keys in Map : ");
        for(Integer key : map.keySet()){
            System.out.println(key + " ");
        }

        System.out.print("\nValues in Map : ");
        for(String value : map.values()){
            System.out.println(value + " ");
        }

    }

    private void updateValueInMap(Map<Integer, String> map, int key,String updateValue) {
        map.put(key,updateValue);
        System.out.println("Map after updating the value: ");
        printMap(map);
    }

    private void removeKeyFromMap(Map<Integer, String> map, int key) {
        map.remove(key);
        System.out.println("\nMap after removing the specified key: ");
        printMap(map);
    }

    private void compareTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        int count = 0 ;
        if(map1.size() != map2.size()){
            System.out.println("The given two maps are not equal");
        }
        else{
            if((map1.keySet().equals(map2.keySet()))){
                for(String str : map1.keySet()){
                    if(map1.get(str) == map2.get(str)){
                        count++;
                    }
                }
                if(count == map1.size()){
                    System.out.println("The two maps are equal");
                }
                else{
                    System.out.println("The given two maps are not equal");
                }

            }
            else{
                System.out.println("The given two maps are not equal");
            }
        }
    }

    private void createCopyOfMap(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Integer id : map.keySet()){
            newMap.put(id, map.get(id));
        }

        System.out.println("Copied Array : ");
        printMap(newMap);
    }


    private void searchValueInMap(Map<Integer, String> map, String value) {
        if(map.containsValue(value)){
            System.out.println("The given value \'" + value + "\' is present in the Map");
            for(Integer id : map.keySet())
            {
                String val= map.get(id);
                if(val == value){
                    System.out.println(id + " =  " + val );
                }

            }

        }
        else{
            System.out.println("The given key \'" + value + "\' is not present in the Map");
        }
    }

    private void searchKeyInMap(Map<Integer, String> map, int key) {
        if(map.containsKey(key)){
            System.out.println("The given key \'" + key + "\' is present in the Map");
            System.out.println(key + " =  " + map.get(key) );
        }
        else{
            System.out.println("The given key \'" + key + "\' is not present in the Map");
        }
    }

    private void printMap(Map<Integer, String> map) {
       System.out.println("Set Elements : ");
       for(Integer id : map.keySet()){
           System.out.println("id : " + id + " name : " + map.get(id));
       }

    }


    private void printSubjectMap(Map<String, Integer> map) {
        System.out.println("Set Elements : ");
        for(String sub : map.keySet()){
            System.out.println("Subject : " + sub + " Credits : " + map.get(sub));
        }

    }

    private Map<Integer,String> createIdAndNameMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Amizh");
        map.put(2,"Priya");
        map.put(3,"Charu");
        map.put(4,"Abirami");

        printMap(map);
        return map;
    }

    private Map<String,Integer> createSubjectsAndCreditsMap() {
        Map<String, Integer> map = new HashMap<>();
        printSubjectMap(map);
        return map;
    }


}
