package in.co.nmsworks.training.week2.Day3.Report;

public class SalesReport extends Report{

    @Override
    public String header() {
        return "Sales of Villupuram Shop";
    }

    @Override
    public String body() {
        return "Completed the 100% sales ";
    }

    @Override
    public String footer() {
        return "this is end of sales report";
    }

}
