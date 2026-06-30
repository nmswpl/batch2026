package in.co.nmsworks.training.week2.day5;

public class Phone implements  BatteryPowered{

    @Override
    public int batteryUsagePerHour() {
        return 5;
    }

    @Override
    public int batterAfterUse(float hours) {
        float usedAmount = hours*batteryUsagePerHour();
        return (int) usedAmount;
    }
}
