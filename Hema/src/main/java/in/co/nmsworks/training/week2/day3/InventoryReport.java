package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{

    @Override
    public String header() {
        return "InventoryReport's Header";
    }

    @Override
    public String body() {
        return "InventoryReport's Body";
    }

    @Override
    public String footer() {
        return "InventoryReport's Footer";
    }

//    @Override
//    public String generate() {
//        return "For InventoryReport => "+super.generate();
//    }
}
