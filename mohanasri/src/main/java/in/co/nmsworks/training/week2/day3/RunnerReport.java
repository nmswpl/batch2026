package in.co.nmsworks.training.week2.day3;

public class RunnerReport {
    public static void main(String[] args) {

        SalesReport sr = new SalesReport();
        System.out.println(sr.generate());
        InventoryReport ir = new InventoryReport();
        System.out.println(ir.generate());
    }
}
