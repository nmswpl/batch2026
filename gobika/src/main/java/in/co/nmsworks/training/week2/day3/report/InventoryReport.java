package in.co.nmsworks.training.week2.day3.report;

public class InventoryReport extends Report{
    @Override
    public String header() {
        return "Car inventory report";
    }

    @Override
    public String body() {
        return "Remaining : 5";
    }

    @Override
    public String footer() {
        return "Note : order given for 10 cars";
    }
}
