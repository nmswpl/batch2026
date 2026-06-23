package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private float price;
    private final String COMPANY;

    public String getCOMPANY() {
        return COMPANY;
    }

    public Employee(int id, String name, String dept, float price,String company) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.price = price;
        this.COMPANY =company;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", price=" + price +
                ", company='" + COMPANY + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object obj) {
//      return this.id==((Employee)obj).getId(); // or id==((Employee)obj).getId()
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
