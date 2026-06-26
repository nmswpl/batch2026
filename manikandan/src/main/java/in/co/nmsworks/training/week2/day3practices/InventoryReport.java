package in.co.nmsworks.training.week2.day3practices;

public class InventoryReport extends Report{
    @Override
    String generate() {
        return  "Inventory Report "+ super.generate();
    }
}
