package in.co.nmsworks.training.week2.day3.inheritance;

public class Runner {
    public static void main(String[] args)
    {
        report();
        employee();
    }

    public static void report(){
        SalesReport sr = new SalesReport();
        System.out.println(sr.generate());
        InventoryReport ir = new InventoryReport();
        System.out.println(ir.generate());
    }

    public static void employee()
    {
        Manager m1 = new Manager(100005.0,"Abishek",80000.0);
        Manager m2 = new Manager(50007.0,"Shek",90000.0);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.annualSalary());
        System.out.println(m2.annualSalary());
    }
}
