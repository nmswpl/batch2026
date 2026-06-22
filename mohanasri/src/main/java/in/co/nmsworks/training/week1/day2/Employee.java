package in.co.nmsworks.training.week1.day2;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private long salary;
    private boolean isFullTime;

    public Employee() {
        // Default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String newDept) {
        this.dept = newDept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long newSalary) {
        this.salary = newSalary;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(boolean newUpdate) {
        this.isFullTime = newUpdate;
    }
}
