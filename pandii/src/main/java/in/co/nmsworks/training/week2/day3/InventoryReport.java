package in.co.nmsworks.training.week2.day3;

public class InventoryReport extends Report{
    @Override
    String header() {
        return "Inventory head";
    }

    @Override
    String body() {
        return "Inventory body";
    }

    @Override
    String footer() {
        return "Inventory footer";
    }
}
