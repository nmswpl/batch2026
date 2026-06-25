package in.co.nmsworks.training.week2.day3.report;

public class SalesReport extends Report{

    @Override
    public String header() {
        return "chromepet sales";
    }

    @Override
    public String body() {
        return "car sold : 5";
    }

    @Override
    public String footer() {
        return "note : 5 cars sold";
    }
}
