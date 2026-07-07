package in.co.nmsworks.Week4.Day1.AverageSalaryOfInterns;

import java.util.Objects;

public class Intern {
    private String name;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Intern intern = (Intern) o;
        return Double.compare(salary, intern.salary) == 0 && Objects.equals(name, intern.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

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

    public Intern(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
