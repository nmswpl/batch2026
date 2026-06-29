package in.co.nmsworks.training.week2.day3;

public class Employee {
    private String name;
    private float salaryPerMonth;
    public Employee(String name, float salaryPerMonth) {
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(float salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
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
