package in.co.nmsworks.training.week2.day3.report;

public class SalesReport extends Report {
    @Override
    public String header() {
        return "Guindy Car Sales Report ";
    }

    @Override
    public String body() {
        return "Car : 10";
    }

    @Override
    public String footer() {
        return "Note : good sales";
    }


}
