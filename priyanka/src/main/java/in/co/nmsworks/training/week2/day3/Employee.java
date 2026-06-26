package in.co.nmsworks.training.week2.day3;

public class Employee {
    private String name;
    private double salaryPerMonth;

    public Employee(double salaryPerMonth, String name) {
        this.salaryPerMonth = salaryPerMonth;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        return salaryPerMonth*12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                ", annual=" + annualSalary() +
                '}';
    }


}
