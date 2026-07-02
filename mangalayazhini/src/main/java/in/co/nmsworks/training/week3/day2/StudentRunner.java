package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRunner {
    public static void main(String[] args) {

        StudentRunner stdRunner = new StudentRunner();
        List<String> subjectsGroup1 = new ArrayList<>();
        subjectsGroup1.add("Java");
        subjectsGroup1.add("C++");
        subjectsGroup1.add("Python");


        List<String> subjectsGroup2 = new ArrayList<>();
        subjectsGroup2.add("Digital Electronics");
        subjectsGroup2.add("Discrete Maths");

        List<String> subjectsGroup3 = new ArrayList<>();
        subjectsGroup3.add("CPC");
        subjectsGroup3.add("MO");
        subjectsGroup3.add("Intro to Chemical Engineering");
        subjectsGroup3.add("CRE");



        Student std1 = new Student(1,"Priya" , "CSE", subjectsGroup1);
        Student std2 = new Student(2,"Abi", "IT",subjectsGroup2);
        Student std3 = new Student(3,"Charu", "IT",subjectsGroup2);
        Student std4 = new Student(4,"Amizh", "CSE",subjectsGroup3);
        Student std5 = new Student(5,"Geetha", "CSE",subjectsGroup2);



        System.out.println(std1);
        List<Student> studentsList = new ArrayList<>();

        studentsList.add(std1);
        studentsList.add(std2);
        studentsList.add(std3);
        studentsList.add(std4);
        studentsList.add(std5);

        System.out.println("Students List : ");
        System.out.println(studentsList);

        Map<String, List<String>> deptToStudentMap = stdRunner.createDeptToStdMapping(studentsList);
        System.out.println("Mapping of Department to students : ");
        for(String key : deptToStudentMap.keySet()){
            System.out.println(key + " : " + deptToStudentMap.get(key));
        }

        Map<String, List<String>> stdToSubjectsMap = stdRunner.createStdToSubjectsMapping(studentsList);
        System.out.println("Mapping of students to subjects : ");
        for(String key : stdToSubjectsMap.keySet()){
            System.out.println(key + " : " + stdToSubjectsMap.get(key));
        }

    }

    private Map<String, List<String>> createStdToSubjectsMapping(List<Student> studentsList) {

        Map<String, List<String>> stdToSubjectsMap = new HashMap<>();
        for(Student std: studentsList){
            String stdName = std.getName();
            List<String> stdSubjectsList = stdToSubjectsMap.get(stdName);
            if(stdSubjectsList == null){
                stdToSubjectsMap.put(stdName, std.getSubjects());
            }
        }
        return stdToSubjectsMap;
    }

    private Map<String, List<String>> createDeptToStdMapping(List<Student> studentsList) {
        Map<String, List<String>> deptToStdMap = new HashMap<>();
        for (Student std : studentsList){
            String department = std.getDepartment();

            List<String> stdList = deptToStdMap.get(department);
            if(stdList == null){
                stdList = new ArrayList<>();
                deptToStdMap.put(department, stdList);
            }
            stdList.add(std.getName());

        }

        return deptToStdMap;
    }


}


