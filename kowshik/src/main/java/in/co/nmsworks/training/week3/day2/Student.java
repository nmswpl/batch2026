package in.co.nmsworks.training.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String dept;
    private List<String> subjects;

    public Student() {
    }

    public Student(Integer id, String name, String dept, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
