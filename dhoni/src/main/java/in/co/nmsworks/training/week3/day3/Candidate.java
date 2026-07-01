package in.co.nmsworks.training.week3.day3;

public class Candidate {
    private String name;
    private Integer id;
    private String College;
    private String dept;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Candidate(String name, Integer id, String college, String dept) {
        this.name = name;
        this.id = id;
        College = college;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", College='" + College + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
