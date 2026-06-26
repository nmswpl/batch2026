package in.co.nmsworks.training.week2.day3;

public class Manager extends CompanyEmployee{
    private double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
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
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
