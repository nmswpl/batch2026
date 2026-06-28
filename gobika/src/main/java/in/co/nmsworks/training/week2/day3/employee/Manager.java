package in.co.nmsworks.training.week2.day3.employee;

public class Manager extends  Employee{

    private Double bonus;

    public Manager(String name, double salaryPerMonth, Double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }


    public double annualSalary(double bonus){
        return super.annualSalary(this.getSalaryPerMonth()) + bonus;
    }

}
