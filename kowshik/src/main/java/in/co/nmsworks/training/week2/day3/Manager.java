package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + bonus;
    }

}
