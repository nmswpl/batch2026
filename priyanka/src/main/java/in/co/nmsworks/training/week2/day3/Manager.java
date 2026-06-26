package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    private double bonus = 1000;

    public Manager(double salaryPerMonth, String name) {
        super(salaryPerMonth, name);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                "bonus=" + bonus +
                '}';
    }
}
