package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.*;

public class StudentMain {
    public static void main(String[] args) {
        Integer id = 1;
        String dept = "CSE";
        String name = "Abishek";
        List<String> subject = new ArrayList<>();
        subject.add("Tamil");
        subject.add("English");
        subject.add("Maths");
        subject.add("Science");
        subject.add("Social");

        Integer id1 = 2;
        String dept1 = "IT";
        String name1 = "Shek";
        Integer id2 = 3;
        String dept2 = "CSE";
        String name2 = "Abi";
        Integer id3 = 4;
        String dept3 = "CSE";
        String name3 = "Raj";

        Student stu = new Student(id,name,dept,subject);
        Student stu1 = new Student(id1,name1,dept1,subject);
        Student stu2 = new Student(id2,name2,dept2,subject);
        Student stu3 = new Student(id3,name3,dept3,subject);
        List<Student> list = new ArrayList<>();
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        mapDepartment(list);
    }

    private static void mapDepartment(List<Student> list) {

        Map<String, List<Student>> deptvise = new HashMap<>();
        for (Student stu: list)
        {
            List<Student> stuNames;
            if (deptvise.containsKey(stu.getDept()))
            {
                stuNames = deptvise.get(stu.getDept());
            }
            else
            {
                stuNames = new ArrayList<>();
                deptvise.put(stu.getDept(), stuNames);
            }
            stuNames.add(stu);
        }
        for( Map.Entry<String,List<Student>> entry : deptvise.entrySet())
        {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
    }
}
