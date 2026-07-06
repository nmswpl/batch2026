package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    public String header(){
        return "Inventory Details";
    }

    public String body(){
        return " 30 cars are sold";
    }

    public String footer(){
        return "Note good sales";
    }


}
