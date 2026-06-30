package in.co.nmsworks.training.week3.day2;

import java.util.Map;
import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Student1");
        students.put(2, "Student2");
        students.put(3, "Student3");
        System.out.println(students);

        for (Integer i : students.keySet()) {
            System.out.println(i + " : " + students.get(i));
        }

        int key = 3;
        String student = "Student4";
        System.out.println("Contains key " + key + ": " + students.containsKey(key));
        System.out.println("Contains value " + student + ": " + students.containsValue(student));

        Map<Integer, String> students2 = new HashMap<>();
        students2.put(5, "Student5");
        students2.put(6, "Student6");
        students2.put(7, "Student7");
        System.out.println(students2);

        for (int i : students2.keySet()){
            students.put(i, students2.get(i));
        }
        System.out.println("Copied students2 into students: " + students);

        if (students.entrySet().equals(students2.entrySet())) System.out.println("Equal");
        else System.out.println("Not equal");

        students.remove(2, "Student2");
        System.out.println("After removing student 2: " + students);

        students.replace(1, "First Student");
        System.out.println("After replacing: " + students);

        System.out.println(students.keySet());
        System.out.println(students.values());

        System.out.println("No.of key-value pairs: " + students.size());

    }

}
