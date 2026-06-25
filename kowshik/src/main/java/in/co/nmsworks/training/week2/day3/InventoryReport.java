package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report {
    @Override
    public String header() {
        return "Inventory Report Header";
    }

    @Override
    public String body() {
        return "Inventory Report Body";
    }

    @Override
    public String footer() {
        return "Inventory Report Footer";
    }
}
