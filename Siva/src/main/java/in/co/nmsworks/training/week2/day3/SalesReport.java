package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report {

    @Override
    public String header() {
        return "SalesReport - Header";
    }

    @Override
    protected String body() {
        return "SalesReport - Body";
    }

    @Override
    protected String footer() {
        return "SalesReport - Footer";
    }

}
