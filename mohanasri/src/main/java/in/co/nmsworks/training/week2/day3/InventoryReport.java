package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    @Override
    public String header(){

        return "\nInventory Report";
    }

    @Override
    public String body() {
        return "\nthe body of the inventory report";
    }

    @Override
    public String footer() {
        return "\nroot of the inventory report";
    }

}
