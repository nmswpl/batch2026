package in.co.nmsworks.training.week3.day3;

public class Candidate {
    private int id;
    private String name;
    private String college;
    private String dept;

    public Candidate(String name, Integer id, String college, String dept) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.dept = dept;
    }

    public int getId() {
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
}
