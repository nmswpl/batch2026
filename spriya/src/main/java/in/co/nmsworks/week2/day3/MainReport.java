package in.co.nmsworks.week2.day3;

public class MainReport {

    public static void main(String[] args) {

        Report report = new Report();
        SalesReport sr = new SalesReport();
        InventoryReport ir=new InventoryReport();

        System.out.println("Report");
        report.generte();

        System.out.println();

        System.out.println("Sales Report");
        sr.generte();

        System.out.println("Inventory Report");
        ir.generte();
    }
}