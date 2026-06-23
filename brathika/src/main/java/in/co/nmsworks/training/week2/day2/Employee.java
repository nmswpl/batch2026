package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {
    private int empId;
    private String name;
    private String dept;
    private long salary;
    private final String COMPANYNAME;


    public Employee(int empId, String name, String dept, long salary, String companyName) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.COMPANYNAME = companyName;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", companyName='" + COMPANYNAME + '\'' +
                '}';
    }

    public String getCompanyName() {
        return COMPANYNAME;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empId);
    }
}
