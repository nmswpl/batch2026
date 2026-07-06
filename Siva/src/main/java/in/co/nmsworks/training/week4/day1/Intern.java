package in.co.nmsworks.training.week4.day1;

public class Intern {
    private String name;
    private Double salary;

    public Intern() {
    }

    public Intern(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
