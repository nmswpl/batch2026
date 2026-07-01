package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    Integer id;
    String name;
    List<String> subjectList;
    String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(Integer id, String name, List<String> subjectList, String dept) {
        this.id = id;
        this.name = name;
        this.subjectList = subjectList;
        this.dept = dept;
    }

    public Student() {
    }

    public Student(Integer id, String name, List<String> subjectList) {
        this.id = id;
        this.name = name;
        this.subjectList = subjectList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
