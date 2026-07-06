package in.co.nmsworks.week2.day3;

public class Employee {
    String name;
    double salaryPerMonth;

    public double annualSalary(){
        return salaryPerMonth*12;
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
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
