package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Tamil");
        subjects.add("Maths");
        subjects.add("Social Science");
        subjects.add("Science");

        Student kowshik = new Student();
        kowshik.setId(1);
        kowshik.setName("Kowshik");
        kowshik.setDept("IT");
        kowshik.setSubjects(subjects);

//        System.out.println(kowshik);

        Student anas = new Student();
        anas.setId(2);
        anas.setName("Anas");
        anas.setDept("CSE");
        anas.setSubjects(subjects);

//        System.out.println(anas);

        Student vetri = new Student();
        vetri.setId(3);
        vetri.setName("Vetri");
        vetri.setDept("IT");
        vetri.setSubjects(subjects);

//        System.out.println(vetri);

        Student pandi = new Student();
        pandi.setId(4);
        pandi.setName("Pandi");
        pandi.setDept("CSE");
        pandi.setSubjects(subjects);

//        System.out.println(pandi);

        List<Student> students = new ArrayList<>();
        students.add(kowshik);
        students.add(anas);
        students.add(vetri);
        students.add(pandi);

        Map<String, List<Student>> deptToStudentMap = getDeptToStudentMap(students);
        System.out.println(deptToStudentMap);
    }

    private static Map<String, List<Student>> getDeptToStudentMap(List<Student> students) {
        Map<String, List<Student>> deptToStudentMap = new HashMap<>();

        for (Student student : students) {
            String dept = student.getDept();
            List<Student> studentList = deptToStudentMap.get(dept);

            if(studentList == null) {
                studentList = new ArrayList<>();
                deptToStudentMap.put(dept, studentList);
            }

            deptToStudentMap.get(dept).add(student);
        }

        return deptToStudentMap;
    }
}
