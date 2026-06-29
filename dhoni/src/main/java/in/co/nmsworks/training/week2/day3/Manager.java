package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{

    private  double bonus = 0.5F;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, float salaryPerMonth) {
        super(name, salaryPerMonth);
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + (super.annualSalary() * bonus);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
