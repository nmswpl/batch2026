package in.co.nmsworks.training.week2.Day3.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee v1=new Employee("vetri",40000.0);
        System.out.println(v1.annualSalary());

        Manager m1=new Manager("Sinthanai",10000.0,200.0);
        System.out.println(m1.annualSalary());
    }




}
