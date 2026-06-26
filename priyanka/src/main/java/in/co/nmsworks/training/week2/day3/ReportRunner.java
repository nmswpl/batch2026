package in.co.nmsworks.training.week2.day3;

public class ReportRunner {
    public static void main(String[] args) {
        salesReport sale = new salesReport();
        System.out.println(sale.generate());
        InventoryReport inventory = new InventoryReport();
        System.out.println(inventory.generate());
    }
}
