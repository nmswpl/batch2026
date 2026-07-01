package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {


        StudentRunner sr = new StudentRunner();
        List<String> subjects1 = new ArrayList<>();
        subjects1.add("Maths");
        subjects1.add("English");
        subjects1.add("Physics");
        subjects1.add("Chemistry");
        subjects1.add("Computer Science");

        Student student1 = new Student(1, "Gabriella", "IT", subjects1);
        Student student2 = new Student(2, "Student2", "CSE", subjects1);
        Student student3 = new Student(3, "Student3", "IT", subjects1);
        Student student4 = new Student(4, "Student4", "CSE", subjects1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);

        Map<String, List<Student>> studentMap = sr.deptToStudent(studentList);
        System.out.println(studentMap);

    }

    private Map<String, List<Student>> deptToStudent(List<Student> studentList) {
        Map<String, List<Student>> studentsByDepts = new HashMap<>();

        for (Student student : studentList) {
            String dept = student.getDept();
            List<Student> byId = studentsByDepts.get(dept);
            if (byId == null){
                byId = new ArrayList<>();
                studentsByDepts.put(dept, byId);
            }
            byId.add(student);
        }
        return studentsByDepts;
    }
}
