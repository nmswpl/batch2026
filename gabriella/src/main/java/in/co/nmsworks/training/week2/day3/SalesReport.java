package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{
    @Override
    public String header() {
        return "---SALES REPORT---";
    }

    @Override
    public String body() {
        return "Sales report body";
    }

    @Override
    public String footer() {
        return "---SALES REPORT END---";
    }
}
