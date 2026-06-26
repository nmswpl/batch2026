package in.co.nmsworks.training.week2.day3;

public class CompanyEmployee {
    private String name;
    double salaryPerMonth;

    public CompanyEmployee(String name, double salaryPerMonth) {
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

    public double annualSalary(){
        double annualSalary;
        annualSalary = salaryPerMonth * 12;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "CompanyEmployee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
