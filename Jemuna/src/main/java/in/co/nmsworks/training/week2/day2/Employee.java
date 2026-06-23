package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {
    private int empID;
    private String name;
    private String dept;
    private Double salary;
    private final String companyName;

    public String getCompanyName() {
        return companyName;
    }


    public Employee(int empID, String name, String dept, Double salary, String companyName) {
        this.empID = empID;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.companyName=companyName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empID);
    }

}
