package in.co.nmsworks.training.week2.day3;

public class Employee {
    private int id;
    private String empName;
    private double salaryPerMonth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double calculateAnnualSalary(){
        return salaryPerMonth * 12;
    }

}
