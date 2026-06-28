package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int battery = batteryUsagePerHour();
        return 100 - battery*(int)hours;

    }
}
