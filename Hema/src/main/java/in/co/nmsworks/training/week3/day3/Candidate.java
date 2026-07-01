package in.co.nmsworks.training.week3.day3;

public class Candidate {
    private String name;
    private Integer rollNo;
    private String collegeName;
    private String dept;

    public Candidate(String name, Integer rollNo, String collegeName, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
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

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
