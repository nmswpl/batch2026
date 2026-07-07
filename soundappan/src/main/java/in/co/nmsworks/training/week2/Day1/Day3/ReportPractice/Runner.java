package in.co.nmsworks.training.week2.Day1.Day3.ReportPractice;

public class Runner {
    public static void main(String[] args) {
        Report r1=new InventoryReport();
        Report r2=new SalesReport();
        r1.generate();
        r2.generate();
    }
}
