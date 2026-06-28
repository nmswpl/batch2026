package in.co.nmsworks.training.week2.day3;

public class Employee {
    private String name;
    private Double salaryPerMonth;

    public Employee() {
    }

    public Employee(String name, Double salaryPerMonth) {
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

    public void setSalaryPerMonth(Double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }

    public Double annualSalary(){
        return 12 * getSalaryPerMonth();
    }
}
