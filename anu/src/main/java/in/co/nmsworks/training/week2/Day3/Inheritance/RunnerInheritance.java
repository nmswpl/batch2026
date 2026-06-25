package in.co.nmsworks.training.week2.Day3.Inheritance;

import sun.security.krb5.internal.PAData;

import java.sql.SQLOutput;

public class RunnerInheritance {
    public static void main(String[] args) {
//        Shape s= new Square(5);
//        s.calculateArea();
//        s.calculatePerimeter();
//
//        Shape r= new Rectangle(4, 5);
//        r.calculateArea();
//        r.calculatePerimeter();
//
//        Shape t = new Triangle(5, 3,2);
//        t.calculateArea();
//        t.calculatePerimeter();

//        car swift=new car();
//        swift.setManufacture("aa");
//        swift.setEngine(new Engine("Petrol",150));
//        swift.setNumberofWheels(4);
//        System.out.println(swift);
//
//        System.out.println();
//        bike bullet=new bike("honda",4);
//        System.out.println(bullet);

        Employee employee = new Employee("Anushri", 70000.00);

        System.out.println(employee);
        System.out.println("Monthly Salary : " + employee.getSalaryPerMonth());
        System.out.println("Annual Salary : " + employee.annualSalary());

        Manager manager = new Manager("viji", 70000.00,1000.00);
        System.out.println(manager);
        System.out.println("bonus Salary : " + manager.getBonus());
        System.out.println("Annual Salary : " + manager.annualSalary());

        SalesReport sp=new SalesReport();
        System.out.println(sp.generate());
        InventoryReport iv=new InventoryReport();
        System.out.println(iv.generate());
    }
}
