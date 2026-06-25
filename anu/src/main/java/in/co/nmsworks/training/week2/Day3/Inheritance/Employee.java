package in.co.nmsworks.training.week2.Day3.Inheritance;

public class Employee {

    protected String name;
    protected double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public double annualSalary() {
        return salaryPerMonth * 12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}

