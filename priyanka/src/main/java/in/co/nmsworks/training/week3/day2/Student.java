package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private String dept;


    private List<String> subject;

    public Student(Integer id, String name, String dept,List<String> subject) {
        this.id = id;
        this.name = name;
        this.dept=dept;
        this.subject = subject;
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

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subject=" + subject +
                '}';
    }
}
