package in.co.nmsworks.training.week2.day3.report;

public class InventoryReport extends Report{
    @Override
    public String header() {
        return "chromepet inventory";
    }

    @Override
    public String body() {
        return "car remaining : 15";
    }

    @Override
    public String footer() {
        return "note : 15 cars remaining";
    }
}
