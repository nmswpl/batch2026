package in.co.nmsworks.training.week2.Day3.Report;

public class ReportRunner {
    public static void main(String[] args) {
        SalesReport s1=new SalesReport();
        s1.header();
        s1.footer();
        s1.body();
        s1.generate();
    }
}
