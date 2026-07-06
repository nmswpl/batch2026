package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    @Override
    public String header() {
        return "This is an Inventory Report Header";
    }

    @Override
    public String body() {
        return "This is an Inventory Report Body";
    }

    @Override
    public String footer() {
        return "This is an Inventory Report Footer";
    }

}
