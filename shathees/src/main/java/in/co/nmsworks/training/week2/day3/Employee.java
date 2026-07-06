package in.co.nmsworks.training.week2.day3;

public class Employee {
    private String name;
    private Double salaryPerMonth;

    public Employee(String name, Double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public Employee() {
    }

    public double annualSalary() {
        return salaryPerMonth * 12;
    }

    public String getName() {
        return name;
    }

    public Double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryPerMonth(Double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
