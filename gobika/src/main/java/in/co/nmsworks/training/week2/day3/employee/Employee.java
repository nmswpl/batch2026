package in.co.nmsworks.training.week2.day3.employee;

public class Employee {


    private String name;
    private double salaryPerMonth;

    public Employee(String name, double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public  double annualSalary(double salaryPerMonth){
        return salaryPerMonth * 12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }


}
