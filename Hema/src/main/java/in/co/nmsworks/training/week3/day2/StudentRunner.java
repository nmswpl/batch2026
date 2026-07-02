package in.co.nmsworks.training.week3.day2;

import java.awt.*;
import java.util.*;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {


        List<String> subjects = new ArrayList<>();
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("SocialScience");

        Student student1 = new Student(1, "Hema" ,subjects,"IT");
        Student student2 = new Student(2, "Thanu" ,subjects,"CSE");
        Student student3 = new Student(3, "Sri" ,subjects,"IT");
        Student student4 = new Student(4, "Bala" ,subjects,"EEE");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Map<String,List<Student>> map = deptToStudentMap(studentList);
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
            System.out.println(entry);
        }


    }

    private static Map<String,List<Student>> deptToStudentMap(List<Student> studentList) {

        Map<String,List<Student>> map = new HashMap<>();

        for (Student student : studentList) {

            String key = student.getDept();
            List<Student> value = map.get(key);

            if( value == null )
            {
                value = new ArrayList<>();
                map.put(key,value);
            }

            value.add(student);

        }

        return map;
    }
}
