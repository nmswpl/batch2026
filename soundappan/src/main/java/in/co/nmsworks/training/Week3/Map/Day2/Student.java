package in.co.nmsworks.training.Week3.Map.Day2;

import java.util.List;

public class Student {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(Integer id, String name, List<String> subject, String department) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.department = department;
    }

    private Integer id;
    private String name;
    private List<String> subject;
    private String department;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", department='" + department + '\'' +
                '}';
    }
}
