package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.HashMap;


public class StudentRunner {
    public static void main(String[] args) {

        List<String> subject=new ArrayList<>();
        subject.add("Tamil");
        subject.add("English");
        subject.add("Maths");
        subject.add("Social");
        Student s1=new Student(1,"Priya",subject,"CSE");


        List<String> subject1=new ArrayList<>();
        subject1.add("Botany");
        subject1.add("Zoology");
        Student s2=new Student(2,"Kavya",subject1,"IT");

        List<String> subject2=new ArrayList<>();
        subject2.add("Cse");
        subject2.add("Cd");
        Student s3=new Student(3,"Ramya",subject2,"CSE");

        List<String> subject3=new ArrayList<>();
        subject3.add("TOC");
        subject3.add("Cn");
        Student s4=new Student(4,"Sibi",subject3,"IT");

        List<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        StudentRunner sr=new StudentRunner();
        Map<String,Student> studentDetails=sr.getStudent(studentList);

        sr.printDetails(studentDetails);

    }

    public Map<String,Student> getStudent(List<Student> student){
        Map<String,Student> map=new HashMap<>();

        for (Student student1 : student) {
            map.put(student1.getDept(),student1);
        }
        return map;
    }

    public void printDetails(Map<String,Student> map){

        for (Map.Entry<String, Student> stringStudentEntry : map.entrySet()) {
            System.out.println(stringStudentEntry.getKey() +" -> "+stringStudentEntry.getValue());
        }
    }
}
