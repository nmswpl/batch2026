package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<String> subjects;
    private String dept;

    public Student(Integer id, String name, List<String> subjects, String dept) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
