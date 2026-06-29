package in.co.nmsworks.training.week2.day3.inheritance;

public class Manager extends Employee{
    private Double bonus;

    public Manager(Double bonus) {
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double annualSalary() {
        return super.annualSalary()+ bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}' + super.toString();
    }
}
