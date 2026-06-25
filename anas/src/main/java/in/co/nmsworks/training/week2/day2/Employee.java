package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    private final String COMPANYNAME;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return COMPANYNAME;
    }



    public Employee(int id, String name, String dept, double salary, String companyname) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.COMPANYNAME = companyname;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDept() {
        return dept;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", companyname='" + COMPANYNAME + '\'' +
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
}
