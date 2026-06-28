package in.co.nmsworks.training.week2.day3.report;

public class Runner {
    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        System.out.println(s.generate());
        InventoryReport inventoryReport = new InventoryReport();
        System.out.println(inventoryReport.generate());
    }

}
