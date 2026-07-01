package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tamil");
        list.add("English");
        list.add("Maths");
        list.add("Social");
        Student stu = new Student(1,"Mohana", list);
        System.out.println(stu);

        Student s1 = new Student(1,"Ami",list,"CSE");
        Student s2 = new Student(2,"Amilaa",list,"CSE");
        Student s3 = new Student(3,"Anitha",list,"IT");
        Student s4 = new Student(4,"Ashmi",list,"IT");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList);

        Map<String, List<Student>> map = new HashMap<>();
        for (Student std : studentList) {
            String dept = std.getDept();
            List<Student> sList =  map.get(dept);
            if ((sList == null)) {
                sList = new ArrayList<>();
                map.put(std.dept, sList);
            }
            sList.add(std);
        }

        System.out.println(map);
    }
}


