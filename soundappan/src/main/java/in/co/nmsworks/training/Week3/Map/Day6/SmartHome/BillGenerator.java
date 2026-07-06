package in.co.nmsworks.training.Week3.Map.Day6.SmartHome;

public class BillGenerator {

    public double calculateBill(int totalPower) {
        return (totalPower / 100.0) * 10;
    }
}