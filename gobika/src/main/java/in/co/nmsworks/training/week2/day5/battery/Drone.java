package in.co.nmsworks.training.week2.day5.battery;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 20;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int remaining = (int) (100 - (hours * batteryUsagePerHour()));
        return remaining;
    }
}
