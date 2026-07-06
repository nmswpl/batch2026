package in.co.nmsworks.training.week3.day3;

public class Candidate{
    private String name;
    private Integer id;
    private String university;
    private String dept;

    public Candidate() {
    }

    public Candidate(String name, Integer id, String university, String dept) {
        this.name = name;
        this.id = id;
        this.university = university;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Candidate :: " +
                "name = " + name;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
