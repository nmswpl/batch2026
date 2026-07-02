package in.co.nmsworks.training.week3.day3;

import java.io.*;
import java.util.Objects;

public class Candidate {
    private String name;
    private int rollNo;
    private String clgName;
    private String dept;

    public Candidate() {
    }

    public Candidate(String name, int rollNo, String clgName, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.clgName = clgName;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
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
                ", rollNo=" + rollNo +
                ", clgName='" + clgName + '\'' +
                ", dept='" + dept + '\'' +
                '}'+"\n----------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return rollNo == candidate.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
