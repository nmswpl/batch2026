package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Social");
        subjects.add("Tamil");
        subjects.add("Science");
        Student student1 = new Student(1,"Brathika",subjects,"cse");
        Student student2 = new Student(2,"Vasudevan",subjects,"cse");
        Student student3 = new Student(3,"Nikesh",subjects,"cse");
        Student student4 = new Student(4,"Amrutha",subjects,"it");
        Student student5 = new Student(5,"Rithika",subjects,"it");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);
        mapToDepartment(studentList);
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//        System.out.println(student5);
    }

    private static void mapToDepartment(List<Student> studentList) {
        Map<String, List<Student>> departmentMap = new HashMap<>();
        for (Student student : studentList) {
            String dept = student.getDepartment();
            List<Student> studentList1 = departmentMap.get(dept);
            if (studentList1 == null ) {
                studentList1 = new ArrayList<>();
                departmentMap.put(dept,studentList1);
            }
            studentList1.add(student);

        }
        System.out.println(departmentMap);

    }
}
