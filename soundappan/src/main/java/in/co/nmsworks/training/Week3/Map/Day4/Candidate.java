package in.co.nmsworks.training.Week3.Map.Day4;

public class Candidate {

    private String name;
    private Integer rollNo;
    private String college;
    private String department;

    public Candidate(Integer rollNo,String name,  String college, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", college='" + college + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
