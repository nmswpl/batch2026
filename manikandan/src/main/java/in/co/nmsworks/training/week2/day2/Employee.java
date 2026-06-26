package in.co.nmsworks.training.week2.day2;

import java.util.Objects;



public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private final String COMPANYNAME;





    public Employee(int id, String name, String department, double salary,String COMPANYNAME) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCOMPANYNAME() {
        return COMPANYNAME;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary + " , CompanyName : "+ COMPANYNAME +'\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }




    //    @Override
//    public boolean equals(Object obj) {
//        return id == ((Employee)obj).getId();
//    }

    //    @Override
//    public String toString() {
//        return "ID =  "+this.id+" NAME : "+this.name+" Department: "+this.department+" Salary: "+this.salary ;
//    }
}
