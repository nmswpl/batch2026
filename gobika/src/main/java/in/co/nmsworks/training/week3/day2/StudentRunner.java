package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C");
        Student student1 = new Student(1,"Gobika","IT",subjects);
        Student student2 = new Student(2,"Sibani","CSE",subjects);
        Student student3 = new Student(3,"brathika","IT",subjects);
        Student student4 = new Student(4,"brithika","CSE",subjects);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        printDeptToStudents(students);


    }

    private static void printDeptToStudents(List<Student> subjects) {
        Map<String,List<String>> deptToStudent = new HashMap<>();
        for (Student student : subjects) {
            String dept = student.getDept();
            List<String> studentList = deptToStudent.get(dept);
            if (studentList == null){
                studentList = new ArrayList<>();
                deptToStudent.put(dept,studentList);
            }
            studentList.add(student.getName());

        }
        System.out.println(deptToStudent);
    }
}
