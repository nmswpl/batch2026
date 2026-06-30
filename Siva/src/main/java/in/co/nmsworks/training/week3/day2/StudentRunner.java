package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        StudentRunner sr = new StudentRunner();
        List<String> subjects = sr.getSubjectNames();
        List<Student> students = new ArrayList<>();
        students.add(new Student(16,"Siva","CSE",subjects));
        students.add(new Student(15,"Pandi","IT",subjects));
        students.add(new Student(17,"Abishek","IT",subjects));
        students.add(new Student(14,"Anas","CSE",subjects));
        students.add(new Student(13,"Kowshik","CSE",subjects));
        System.out.println(students);
        Map<String, List<Student>> deptToStudentMap = sr.createDeptToStudentMap(students);
        System.out.println(deptToStudentMap);

    }

    private Map<String, List<Student>> createDeptToStudentMap(List<Student> students) {
        Map<String, List<Student>> deptToStudentMap = new HashMap<>();
        for (Student student : students) {
            List<Student> stud = deptToStudentMap.get(student.getDepartment());
            if (stud == null) {
                stud = new ArrayList<>();
                deptToStudentMap.put(student.getDepartment(),stud);
            }
            stud.add(student);
        }
        return deptToStudentMap;
    }

    private List<String> getSubjectNames() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Social Science");
        return subjects;
    }
}
