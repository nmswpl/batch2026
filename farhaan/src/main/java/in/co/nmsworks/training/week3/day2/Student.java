package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    private String name;
    private Integer id;
    private String dept;
    private List<String> subject;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", subject=" + subject +
                '}';
    }

    public Student(String name, Integer id, String dept, List<String> subject) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }
}
