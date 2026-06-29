package in.co.nmsworks.training.week2.day4;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 8;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) (100 - (hours * batteryUsagePerHour()));
    }
}
