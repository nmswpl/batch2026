package in.co.nmsworks.training.week2.day3.emp;

public class Employee {

    private String name;
    private double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        return (12 * salaryPerMonth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
