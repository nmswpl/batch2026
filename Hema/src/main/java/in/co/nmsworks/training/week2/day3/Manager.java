package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{

    double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary()+bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name="+getName()+
                ", Salary Per Month="+getSalaryPerMonth()+
                ", bonus=" + bonus +
                ", Annual Salary="+annualSalary()+
                '}';
    }
}
