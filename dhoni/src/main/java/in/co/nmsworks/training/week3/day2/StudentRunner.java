package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        StudentRunner studentRunner = new StudentRunner();

        List<String> subject = new ArrayList<>();
        subject.add("English");
        subject.add("Maths");
        subject.add("Networks");
        subject.add("Java");
        subject.add("Python");


        Student dhoni = new Student(20,new String("Dhoni"),new String("CSE"),subject);
        Student karthi = new Student(21,new String("Karthik"),new String("CSE"),subject);
        Student soundappan = new Student(22,new String("Soundappan"),new String("IT"),subject);
        Student sathish = new Student(23,new String("Sathish"),new String("IT"),subject);

        System.out.println(dhoni);

        List<Student> list = new ArrayList<>();
        list.add(dhoni);
        list.add(karthi);
        list.add(soundappan);
        list.add(sathish);

        Map<String,List<Student>> map = getDeptWiseStudent(list);
        for (Map.Entry<String,List<Student>> m : map.entrySet()){
            System.out.println(m);
        }
    }

    private static Map<String, List<Student>> getDeptWiseStudent(List<Student> list) {
        Map<String, List<Student>> map = new HashMap<>();

        for (Student student : list){
            String dept = student.getDept();
            if( map.containsKey(dept) ){
                map.get(student.getDept()).add(student);
            }
            else {
                List<Student> studentList = new ArrayList<>();
                studentList.add(student);
                map.put(dept,studentList);
            }
        }
        return map;
    }
}
