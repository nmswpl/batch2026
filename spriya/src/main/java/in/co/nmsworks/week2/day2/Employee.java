package in.co.nmsworks.week2.day2;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    int salary;
    private String companyName="NMSWorks";

    public String getCompanyName() {
        return companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    Employee(int id, String name, int salary, String companyName){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.companyName=companyName;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public int getSalary(){
        return salary;
    }
    public void setid(int salary){
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                "company name:"+companyName+
//                '}';
//    }

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
