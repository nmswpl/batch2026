package in.co.nmsworks.training.week3.day2;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {
        StudentRunner sr=new StudentRunner();
        List<String> sub=new ArrayList<>();
        sub.add("Tamil");
        sub.add("english");
        sub.add("science");
        sub.add("maths");
        sub.add("social");
        Student st=new Student(1,"Pandi","IT",sub);
        System.out.println(st);

        Student stu1=new Student(2,"siva","IT");

        Student stu2=new Student(3,"anas","CSE",sub);

        Student stu3=new Student(4,"abi","CSE",sub);

        List<Student> studentList=new ArrayList<>();
        studentList.add(st);
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        Map<String,List<Student>> deptStuMap=sr.deptToStudent(studentList);
        System.out.println(deptStuMap);
    }

    private Map<String, List<Student>> deptToStudent(List<Student> studentList) {
        Map<String,List<Student>> depMap=new HashMap<>();

        for (Student student : studentList) {
            String dept=student.getDept();
            List<Student> deptList=depMap.get(dept);

            if(deptList==null)
            {
                deptList=new ArrayList<>();
                depMap.put(dept,deptList);
            }
            deptList.add(student);
        }
        return depMap;
    }
}
