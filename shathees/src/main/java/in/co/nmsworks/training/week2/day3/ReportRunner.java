package in.co.nmsworks.training.week2.day3;

public class ReportRunner {
    public static void main(String[] args) {
        InventoryReport ir = new InventoryReport();
        SalesReport sr = new SalesReport();
        System.out.println(sr.generate());
        System.out.println(ir.generate());

    }
}
