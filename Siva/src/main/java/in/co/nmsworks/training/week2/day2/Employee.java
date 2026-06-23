package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {
    private final String COMPANYNAME;
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary,String COMPANYNAME) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.COMPANYNAME = COMPANYNAME;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "companyName='" + COMPANYNAME + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
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

    public String getCompanyName() {
        return COMPANYNAME;
    }

}
