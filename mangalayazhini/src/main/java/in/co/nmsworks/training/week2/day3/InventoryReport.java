package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{

    @Override
    public String header() {
        return "Inventory Report of Velachery Branch";
    }

    public String body(){
        return "Total Quantity: 500";
    }


    public String footer(){
        return "Ordered items for next month: 650";
    }
}
