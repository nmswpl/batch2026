package in.co.nmsworks.training.week2.Day3.Inheritance;

public class SalesReport extends Report {
    @Override
    public String header() {
        return "sales";
    }

    @Override
    public String body() {
        return "sales 10";
    }

    @Override
    public String footer() {
        return "sales okay";
    }
}
