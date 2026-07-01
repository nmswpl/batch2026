package in.co.nmsworks.training.week3.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunnerStudent {
    public static void main(String[] args) {
        List<String> subject=new ArrayList<>();
        subject.add("dbms");
        subject.add("oops");
        subject.add("c++");
        subject.add("java");
        Student studentOne=new Student(1,"Anushri" ,subject,"IT");
        Student studentTwo=new Student(2,"viji" ,subject,"cse");
        Student studentThree=new Student(3,"archana" ,subject,"cse");
        Student studentFour=new Student(4,"tamilselvan" ,subject,"IT");

        List<Student> studentValue=new ArrayList<>();
        studentValue.add(studentOne);
        studentValue.add(studentTwo);
        studentValue.add(studentThree);
        studentValue.add(studentFour);

        System.out.println(studentValue);

        Map<String,List<Integer>>  idToStudent = getPrintMethod(studentValue);
        System.out.println("in using map -------");
        System.out.println(idToStudent);

    }

    private static Map<String, List<Integer>> getPrintMethod(List<Student> studentValue) {
        Map<String, List<Integer>> studentMap = new HashMap<>();
        for (Student stud : studentValue) {
            String studentId = stud.getDept();
            List<Integer> nameList = studentMap.get(studentId);
            if (nameList == null) {
                nameList = new ArrayList<>();
                studentMap.put(studentId, nameList);
            }
            nameList.add(stud.getId());
        }
        for (String i : studentMap.keySet()) {
            List<Integer> names = studentMap.get(i);
            System.out.println("ID: " + i + "  Names: " + names.toString());
        }

        return studentMap;
    }
}
