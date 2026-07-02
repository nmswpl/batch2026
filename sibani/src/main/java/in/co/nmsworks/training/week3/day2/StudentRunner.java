package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {
        List<String> subject = new ArrayList<>();
        subject.add("Tamil");
        subject.add("English");
        subject.add("Maths");
        subject.add("Science");
        subject.add("Social");
        Student student1 = new Student(1, "Sibani",subject , "CSE");
        Student student2 = new Student(2, "Gobika",subject , "IT");
        Student student3 = new Student(3, "Priya",subject , "IT");
        Student student4 = new Student(4, "Brathika",subject , "CSE");


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);

        StudentRunner studentRunner = new StudentRunner();
        studentRunner.deptToStudent(students);
    }

    private void deptToStudent(List<Student> students) {
        Map<String, List<Student>> deptToStudentMap = new HashMap<>();
        for (Student student : students) {
            String department = student.getDept();
            List<Student> studentList = deptToStudentMap.get(department);
            if (studentList == null) {
                studentList = new ArrayList<>();
                deptToStudentMap.put(department, studentList);
            }
            studentList.add(student);
        }
        System.out.println(deptToStudentMap);
    }
}
