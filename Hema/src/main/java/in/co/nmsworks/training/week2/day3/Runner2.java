package in.co.nmsworks.training.week2.day3;


public class Runner2 {
    public static void main(String[] args) {
        Employee employee =  new Employee("Thanu", 20000);
        Manager manager1 = new Manager("Hema", 50000, 7500);
        System.out.println(employee);
        System.out.println(manager1);

        SalesReport sr = new SalesReport();
        InventoryReport ir = new InventoryReport();
        System.out.println(sr.generate());
        System.out.println(ir.generate());
    }
}
