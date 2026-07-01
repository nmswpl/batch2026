package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("python");
        subjects.add("cpp");

        Student s1 = new Student(1,"anas","ct",subjects);
        Student s2 = new Student(2,"kowshik","it", subjects);
        Student s3 = new Student(3,"vetri","ct", subjects);
        Student s4 = new Student(4,"siva","it", subjects);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Map<String, List<Student>> deptWiseStudentMap = new HashMap<>();
        for (Student student : studentList) {
            String dept = student.getDept();
            List<Student> StudentsList = deptWiseStudentMap.get(dept);
            if (StudentsList == null){
                StudentsList = new ArrayList<>();
                deptWiseStudentMap.put(dept, StudentsList);
            }
            StudentsList.add(student);
        }




        System.out.println(deptWiseStudentMap);

    }
}
