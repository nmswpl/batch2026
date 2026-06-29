package in.co.nmsworks.training.week2.Day3.Report;

public class InventoryReport extends Report{

    @Override
    public String header() {
        return "Inventory of Villupuram Shop";
    }

    @Override
    public String body() {
        return "Inventory 100% empty  ";
    }

    @Override
    public String footer() {
        return "this is end ";
    }
}
