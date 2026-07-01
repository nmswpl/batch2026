package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<String> subjects;
    private String department;

    public Student() {
    }

    public Student(Integer id, String name, List<String> subjects, String department) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.department = department;
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
                ", subjects=" + subjects +
                '}';
    }
}
