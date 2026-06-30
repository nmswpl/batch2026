package in.co.nmsworks.training.week3.day2;

import java.util.*;

public class Student {
    private Integer id;
    private String name;
    private String department;
    private List<String> subjects;

    public Student() {
    }

    public Student(Integer id, String name, String department, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.subjects = subjects;
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
