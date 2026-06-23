package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {

    private int id ;
    private String name ;
    private String dept ;
    private float salary ;
    private final String COMPANYNAME ;


    public Employee(int id, String name, String dept, float salary, String COMPANYNAME) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.COMPANYNAME = COMPANYNAME ;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public String getCompanyName() {
        return COMPANYNAME;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Float.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(COMPANYNAME, employee.COMPANYNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, salary, COMPANYNAME);
    }
}

