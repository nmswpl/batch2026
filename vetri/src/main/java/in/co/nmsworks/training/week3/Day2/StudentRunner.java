package in.co.nmsworks.training.week3.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        List<String> subjects=new ArrayList<>();
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Social");

        Student vetri=new Student();
        vetri.setId(1);
        vetri.setName("vetri");
        vetri.setDepartment("IT");
        vetri.setSubjects(subjects);

        System.out.println(vetri);

        Student selvan=new Student(2,"selvan","cse",subjects);
        System.out.println(selvan);
        Student Anas=new Student(3,"Anas","cse",subjects);
        System.out.println(Anas);
        Student Sinthanai=new Student(4,"Sinthanai","IT",subjects);
        System.out.println(Sinthanai);
        Student kowshik=new Student(5,"kowshik","IT",subjects);
        System.out.println(kowshik);

        List<Student> students = getStudents(vetri, selvan, Anas, Sinthanai, kowshik);
        System.out.println(students);
        getDeptToStudentDept(students);



    }

    private static List<Student> getStudents(Student vetri, Student selvan, Student Anas, Student Sinthanai, Student kowshik) {
        List<Student> students=new ArrayList<>();
        students.add(vetri);
        students.add(selvan);
        students.add(Anas);
        students.add(Sinthanai);
        students.add(kowshik);
        return students;
    }

    private static void getDeptToStudentDept(List<Student> students){
        Map<String,List<Student>> map=new HashMap<>();

        for (Student student:students) {
            String dept = student.getDepartment();
            Student studentList = student;

            if (!map.containsKey(dept)){
                map.put(dept,new ArrayList<>());
            }
            map.get(dept).add(studentList);

        }

        System.out.println(map);
    }

    }

