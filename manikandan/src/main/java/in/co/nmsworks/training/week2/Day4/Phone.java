package in.co.nmsworks.training.week2.Day4;

public class Phone implements BatteryPowered {

    private int batteryLevel = 100;
    private int usageRate = 12;

    @Override
    public int batteryUsagePerHour() {
        return usageRate;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int drained = (int) (hours * usageRate);
        batteryLevel = batteryLevel - drained;
        if (batteryLevel < 1) {
            batteryLevel = 1;
        }
        return batteryLevel;
    }
}