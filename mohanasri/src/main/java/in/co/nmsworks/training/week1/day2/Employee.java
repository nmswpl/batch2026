package in.co.nmsworks.training.week1.day2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private long salary;
    private final String companyName = "NMSWorks";

    public Employee() {

    }

    public String getCompanyName() {
        return companyName;
    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//private boolean isFullTime;

//    public Employee(String companyName) {
//        this.companyName = companyName;
//    }
//    public Employee(String str){
//        this.name =str;
//    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String newDept) {
        this.dept = newDept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dept='" + dept + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return id == ((Employee)obj).getId();
//    }


    //    public boolean isFullTime() {
//        return isFullTime;
//    }
//
//    public void setIsFullTime(boolean newUpdate) {
//        this.isFullTime = newUpdate;
//    }
}
