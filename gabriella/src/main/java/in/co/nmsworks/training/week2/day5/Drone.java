package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    private int battery = 100;
    @Override
    public int batteryAfterUse(float hours) {
        battery = (int) (battery - (batteryUsagePerHour()*hours));
        return battery;

    }

    @Override
    public int batteryUsagePerHour() {
        return 4;
    }
}
