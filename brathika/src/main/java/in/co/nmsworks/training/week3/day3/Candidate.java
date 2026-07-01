package in.co.nmsworks.training.week3.day3;

public class Candidate {
    private String name;
    private Integer id;
    private String college;
    private String department;

    public Candidate() {
    }

    public Candidate(String name, Integer id, String college, String department) {
        this.name = name;
        this.id = id;
        this.college = college;
        this.department = department;
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
                ", id=" + id +
                ", college='" + college + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
