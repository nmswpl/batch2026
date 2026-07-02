package in.co.nmsworks.training.week3.day4;

public class Candidate {


    private String name;
    private int id;
    private String clgName;
    private String dept;

    public Candidate(String name, int id, String clgName, String dept) {
        this.name = name;
        this.id = id;
        this.clgName = clgName;
        this.dept = dept;
    }

    public Candidate() {
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getClgName() { return clgName; }
    public void setClgName(String clgName) { this.clgName = clgName; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", clgName='" + clgName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }


}
