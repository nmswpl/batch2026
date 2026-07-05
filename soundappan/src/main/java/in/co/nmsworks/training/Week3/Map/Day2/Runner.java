package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        List<String> subject=new ArrayList<>();
        Student s1=new Student(101,"Soundappan",subject,"IT");
        Student s2=new Student(102,"GunaSundaram",subject,"CSE");
        Student s3=new Student(103,"DhoniKarthik",subject,"IT");
        Student s4=new Student(104,"Madhu",subject,"IT");

        List<Student>student=new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

                subject.add("Maths");
                subject.add("Tamil");
                subject.add("English");
                Map<String,List<Student>>department=listOfDepartment(student);
                printDepartment(department);

    }

    private static void printDepartment(Map<String, List<Student>> department) {
        for(Map.Entry<String,List<Student>>ent:department.entrySet()){
            System.out.println(ent);
        }
    }

    private static Map<String, List<Student>> listOfDepartment(List<Student> student) {
        Map<String,List<Student>>department=new HashMap<>();
        for(Student dep:student){
            String depart=dep.getDepartment();
            List<Student>val=department.get(depart);
            if(val==null){
                val=new ArrayList<>();
                department.put(depart,val);
            }
            val.add(dep);
        }
        return department;
    }
}
