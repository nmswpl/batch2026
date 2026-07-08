package in.co.nmsworks.training.week2.day3;

public class ReportRunner {
    public static void main(String[] args) {
        SalesReport sale = new SalesReport();
        System.out.println(sale.generate());
        InventoryReport inventory = new InventoryReport();
        System.out.println(inventory.generate());
    }
}
