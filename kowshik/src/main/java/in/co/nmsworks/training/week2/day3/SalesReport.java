package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{

    @Override
    public String header() {
        return "Sales Report Header";
    }

    @Override
    public String body() {
        return "Sales Report Body";
    }

    @Override
    public String footer() {
        return "Sales Report Footer";
    }

}
