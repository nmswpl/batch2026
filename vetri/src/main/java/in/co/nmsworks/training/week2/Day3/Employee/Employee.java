package in.co.nmsworks.training.week2.Day3.Employee;

public class Employee {
    String name;
    Double salaryPerMonth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(Double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Employee() {
    }

    public Employee(String name, Double salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public Double  annualSalary(){
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


