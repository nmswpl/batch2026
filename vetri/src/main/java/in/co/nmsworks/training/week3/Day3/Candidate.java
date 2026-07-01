package in.co.nmsworks.training.week3.Day3;

import java.util.Objects;

public class Candidate {
    private String name;
    private Integer id;
    private String College;
    private String Department;

    public Candidate() {
    }

    public Candidate(String name, Integer id, String college, String department) {
        this.name = name;
        this.id = id;
        College = college;
        Department = department;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", College='" + College + '\'' +
                ", Department='" + Department + '\'' +
                '}';
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
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name) && Objects.equals(id, candidate.id) && Objects.equals(College, candidate.College) && Objects.equals(Department, candidate.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, College, Department);
    }
}
