package in.co.nmsworks.training.week2.day3.inheritance;

public class Employee {
    private String name;
    private Double salaryPerMonth;
    private  Double annualSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salaryPerMonth;
    }

    public void setSalary(Double salary) {
        this.salaryPerMonth = salary;
    }
    public Double getAnnualSalary() {
        return annualSalary = 12 * salaryPerMonth;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(Double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double annualSalary(){
        annualSalary = 12 * salaryPerMonth;
        return annualSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                ", annualSalary=" + getAnnualSalary() +
                '}';
    }
}
