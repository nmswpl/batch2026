package in.co.nmsworks.training.week2.Day3.Employee;

public class Manager extends Employee{
    Double bonues;

    public Manager(String name, Double salaryPerMonth) {
        super(name, salaryPerMonth);
    }

    public Manager(String name, Double salaryPerMonth, Double bonues) {
        super(name, salaryPerMonth);
        this.bonues = bonues;
    }

    @Override
    public Double annualSalary() {
        return super.annualSalary()+ bonues;
    }

    public Double getBonues() {
        return bonues;
    }

    public void setBonues(Double bonues) {
        this.bonues = bonues;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salaryPerMonth=" + salaryPerMonth +
                ", bonues=" + bonues +
                ", name='" + name + '\'' +
                '}';
    }
}
