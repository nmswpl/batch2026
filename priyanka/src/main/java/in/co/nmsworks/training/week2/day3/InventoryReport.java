package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    @Override
    public String header() {
        return "Inventory Report";
    }

    @Override
    public String body() {
        return "Total stock: 80";
    }

    @Override
    public String footer() {
        return "Need 20 more";
    }
}
