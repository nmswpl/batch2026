package in.co.nmsworks.training.week3.day3;

public class Candidate {
    private String name;
    private Integer rollNo;
    private String college;
    private String dept;


    public Candidate() {
    }

    public Candidate(String name, Integer rollNo, String college, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
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
                ", rollNo=" + rollNo +
                ", college='" + college + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
