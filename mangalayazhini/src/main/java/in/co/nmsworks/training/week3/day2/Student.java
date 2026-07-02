package in.co.nmsworks.training.week3.day2;

import java.util.List;
import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private List<String> subjects;
    private List<Integer> marks;

    public Student(Integer id, String name, List<String> subjects, List<Integer> marks, String department) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        this.department = department;
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(Integer id, String name,String department,  List<String> subjects) {
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
