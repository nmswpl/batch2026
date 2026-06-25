package in.co.nmsworks.training.week2.day3.report;

public class ReportRunner {
    public static void main(String[] args) {

        SalesReport s = new SalesReport();
        System.out.println(s.generate());

        InventoryReport i = new InventoryReport();
        System.out.println(i.generate());
    }
}
