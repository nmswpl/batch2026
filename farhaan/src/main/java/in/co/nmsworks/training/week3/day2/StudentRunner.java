package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        StudentRunner sr = new StudentRunner();
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Tamil");
        Student student1 = new Student("Farhaan", 1,"CS", subjects);
        Student student2 = new Student("Aakil", 2, "CS", subjects);
        Student student3 = new Student("Dhoni", 3, "IT", subjects);
        Student student4 = new Student("Sathish", 4, "IT", subjects);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

//        sr.studentByDepartment(students);
    }

//    private Map<String, List<Student>> studentByDepartment(List<Student> list){
//        Map<String, List<Student>> students = new HashMap<>();
//        List<String> studentList = new ArrayList<>();
//        for (Student student : list) {
//            studentList = students.get(student.getDept());
//            if( studentList == null){
//                studentList = new ArrayList<>();
//            }
//
//        }
//    }
}
