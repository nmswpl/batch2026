package in.co.nmsworks.training.week4.day1.intern;

public class Intern {
    private String name;
    private float salary;

    public Intern(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
