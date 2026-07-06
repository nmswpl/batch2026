package in.co.nmsworks.week3.day2;


import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<String> subject;

    public Student(Integer id, String name, List<String> subject, String dept) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.dept = dept;
    }

    private String dept;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Student(int id, String name, List<String> subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
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
}
