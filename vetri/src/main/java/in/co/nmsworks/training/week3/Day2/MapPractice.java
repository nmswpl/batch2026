package in.co.nmsworks.training.week3.Day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        createMapAndDisply();
        iterateTheMap();
        serachSpecificKey();
        serachSpecificValue();
        copyOfOneToAnother();
        compareTwoMaps();
        removeKeyValue();
        updateSpecificKeyValue();
        displyKeysAndValues();
        countKeyValuePairs();



    }

    private static void countKeyValuePairs() {
        Map<Integer,String> studentData=getStudents();
        Set<Integer> key=studentData.keySet();


        System.out.println("Size of the key in the map is: "+key.size());
        System.out.println("Size of the Value in the map is: "+studentData.size());
    }

    private static void displyKeysAndValues() {

        Map<Integer,String> studentData= getStudents();
        System.out.println(studentData.keySet());
        System.out.println(studentData.values());
    }

    private static void updateSpecificKeyValue() {
        Map<Integer,String> student=getStudents();
        student.put(2,"Vetriselvan G");
        System.out.println(student);
    }

    private static void removeKeyValue() {
        Map<Integer,String> student=getStudents();
        student.remove(1);
        System.out.println(student);
    }

    private static void compareTwoMaps() {
        Map<Integer,String> student=getStudents();
        Map<Integer,String> city=getCity();

        if (student.size()!=city.size()){
            System.out.println("Not Equal");
            return;
        }

        for (int i = 0; i < student.size(); i++) {
            Map<Integer,String> studentData= (Map<Integer, String>) student.entrySet();
            Map<Integer,String> cityData= (Map<Integer, String>) city.entrySet();
            if(studentData.get(i)!= city.get(i) && studentData.values()!=cityData.values()){
                System.out.println("Not Equal");
                return;
            }
            System.out.println("Equal");

        }
    }

    private static void copyOfOneToAnother() {
        Map<Integer,String> student=getStudents();
        Map<Integer,String> city=getCity();

        student.putAll(city);
        System.out.println(student);

    }

    private static Map<Integer, String> getCity() {
        Map<Integer,String> city=new HashMap<>();
        city.put(101,"Bangalore");
        city.put(102,"Chennai");
        city.put(103,"Cuddalore");
        city.put(104,"Vellore");
        return city;
    }


    private static void serachSpecificValue() {
        Map<Integer,String> student=getStudents();
        System.out.println(student.containsValue("vetri"));
    }

    private static void serachSpecificKey() {
        Map<Integer,String> student=getStudents();
        System.out.println(student.containsKey(2));
    }

    private static void iterateTheMap() {
        for (Map.Entry<Integer,String> studentData:getStudents().entrySet()){
            System.out.println("Student keys are: "+studentData.getKey());
            System.out.println("Student values are: "+studentData.getValue());
        }
    }

    private static void createMapAndDisply() {
        System.out.println(getStudents());
    }

    private static Map<Integer, String> getStudents() {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"vetri");
        student.put(2,"sinthanai");
        student.put(3,"selvan");
        student.put(4,"anas");
        student.put(5,"kowshik");
        return student;
    }
}
