package in.co.nmsworks.training.week2.Day1.Day2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    private final String COMPANYNAME;

    public String getCompanyName() {
        return COMPANYNAME;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "companyName='" + COMPANYNAME+ '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Employee(int id, String name, String dept , double salary,String COMPANYNAME) {
        this.salary = salary;
        this.dept = dept;
        this.name = name;
        this.id = id;
        this.COMPANYNAME=COMPANYNAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
