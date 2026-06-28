package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    private Double bonus;

    public Manager(String name, Double salaryPerMonth, Double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }

    @Override
    public Double annualSalary() {
        return super.annualSalary() + this.bonus;
    }

}
