package in.co.nmsworks.training.week3.day2;

import in.co.nmsworks.training.week2.exercise.LibraryBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        List<String> subject = new ArrayList<>();
        subject.add("Tamil");
        subject.add("English");
        subject.add("Maths");
        subject.add("Science");
        subject.add("Social");

        StudentRunner sr = new StudentRunner();
        Student s1 = new Student(1,"Priyanka","IT",subject);
        System.out.println(s1);
        Student s2 = new Student(2,"Priya","CSE",subject);
        System.out.println(s2);
        Student s3 = new Student(3,"Prathi","IT",subject);
        System.out.println(s3);
        Student s4= new Student(4,"Sunitha","CSE",subject);
        System.out.println(s4);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Map<String, List<Student>> deptToStudents = getDeptToStudents(students);
    }

    private static Map<String, List<Student>> getDeptToStudents(List<Student> students) {
        Map<String,List<Student>> deptToStudents = new HashMap<>();
        for (Student student : students) {
            String dept = student.getDept();
            List<Student> studentList = deptToStudents.get(dept);
            if(studentList == null){
                studentList = new ArrayList<>();
                deptToStudents.put(dept,studentList);
            }
            studentList.add(student);
        }
        System.out.println(deptToStudents);
        return deptToStudents;
    }


}
