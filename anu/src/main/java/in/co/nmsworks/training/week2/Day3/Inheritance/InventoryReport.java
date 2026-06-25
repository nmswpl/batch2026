package in.co.nmsworks.training.week2.Day3.Inheritance;

public class InventoryReport extends Report {
    @Override
    public String header() {
        return "inventory";
    }

    @Override
    public String body() {
        return "in 100";
    }

    @Override
    public String footer() {
        return "good" ;
    }
}
