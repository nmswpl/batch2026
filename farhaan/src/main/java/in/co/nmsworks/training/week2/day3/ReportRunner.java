package in.co.nmsworks.training.week2.day3;

public class ReportRunner {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate();

        SalesReport sales = new SalesReport();
        sales.generate();

        InventoryReport inventory = new InventoryReport();
        inventory.generate();
    }
}
