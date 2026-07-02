package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Student {
    Integer id;
    String Name;
    String dept;
    List<String> subject;

    public Student() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(Integer id, String name, String dept, List<String> subject) {
        this.id = id;
        Name = name;
        this.dept = dept;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
                ", Name='" + Name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
