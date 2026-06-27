package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{

    @Override
    public int batteryUsagePerHour() {
        return 25;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int)(100-(hours*batteryUsagePerHour()));
    }
}
