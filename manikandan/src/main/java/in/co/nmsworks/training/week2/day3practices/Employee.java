package in.co.nmsworks.training.week2.day3practices;
public class Employee {
    protected String name;
    protected double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary() {
        return salaryPerMonth * 12;
    }

    public String getName() {
        return name;
    }

    public double getSalaryPerMonth() {

        return salaryPerMonth;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }
}