package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{

    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batterAfterUse(float hours) {
        float usedAmount = hours*batteryUsagePerHour();
        return (int) usedAmount;
    }
}
