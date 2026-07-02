package in.co.nmsworks.week3.day3;

import java.io.*;

public class Candidate {


    private String name;
    private Integer id;
    private String collegeName;
    private String dept;

    public Candidate(String name, Integer id, String collegeName, String dept) {
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
