package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    int currentBattery=100;
    @Override
    public int batteryUsagePerHour() {
        return 20;
    }

    @Override
    public int batteryAfterUse(float hrs) {
        int usedBattery= (int) (hrs*batteryUsagePerHour());
        int remainingBattery=currentBattery - usedBattery;
        System.out.println("Remaining hrs can use :"+remainingBattery/batteryUsagePerHour());
        return remainingBattery;
    }
}
