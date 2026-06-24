package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    @Override
    public String header() {
        return "InventoryReport - Header";
    }
    @Override
    protected String body(){
        return "InventoryReport - Body";
    }
    @Override
    protected String footer(){
        return "InventoryReport - Footer";
    }
}
