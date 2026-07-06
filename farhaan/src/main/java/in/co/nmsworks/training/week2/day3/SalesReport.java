package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report {
    @Override
    public String header() {
        return "This is a Sales Report Header";
    }

    @Override
    public String body() {
       return "This is a Sales Report Body";
    }

    @Override
    public String footer() {
        return "This is a Sales Report Footer";
    }

}

