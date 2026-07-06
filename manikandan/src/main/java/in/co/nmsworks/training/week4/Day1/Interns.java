package in.co.nmsworks.training.week4.Day1;

public class Interns {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Interns() {
    }

    public Interns(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

