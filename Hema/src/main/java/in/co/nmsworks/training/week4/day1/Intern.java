package in.co.nmsworks.training.week4.day1;

public class Intern {
    private String name;
    private Integer salary;

    public Intern(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
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
