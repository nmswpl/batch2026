package in.co.nmsworks.training.week2.day3;

public class Employee {
    private String name;
    private Double salaryPerMonth;

    Employee(){

    }

    Employee(String name, Double salaryPerMonth){
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }


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


    public double annualSalary(){

        double annualSal = salaryPerMonth * 12;
        System.out.println("Employee Annual salary : " + annualSal);
        return annualSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
