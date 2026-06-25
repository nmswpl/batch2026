package in.co.nmsworks.training.week2.day3.emp;

public class Manager extends Employee {

    public double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
