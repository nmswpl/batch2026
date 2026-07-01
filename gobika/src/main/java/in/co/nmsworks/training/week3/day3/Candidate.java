package in.co.nmsworks.training.week3.day3;

import java.io.BufferedReader;

public class Candidate {
    private String name;
    private Integer id;
    private String college;
    private String dept;

    public Candidate() {

    }

    public Candidate(String name, Integer id, String college, String dept) {
        this.name = name;
        this.id = id;
        this.college = college;
        this.dept = dept;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", college='" + college + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
