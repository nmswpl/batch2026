package in.co.nmsworks.training.week2.day3.inheritance;

public class Manager extends Employee {
    private Double bonus;

    public Manager(Double bonus,String name,Double salary) {
        setName(name);
        setSalaryPerMonth(salary);
        this.bonus = bonus;
    }


    public Manager() {
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +"bonus=" + bonus + " "+ super.toString() +'}';
    }

    @Override
    public Double annualSalary() {
        return super.annualSalary() + bonus;
    }
}
