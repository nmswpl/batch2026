package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    double bonus;

    public Manager(Double bonus,String name,Double salary) {
        this.bonus = calcBonus(bonus);
        setName(name);
        setSalaryPerMonth(salary);
    }
    public Double calcBonus(double bonus){
        return super.annualSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
