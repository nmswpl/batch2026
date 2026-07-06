package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    public double bonus;

    @Override
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
