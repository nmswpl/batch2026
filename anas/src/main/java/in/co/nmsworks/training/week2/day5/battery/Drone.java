package in.co.nmsworks.training.week2.day5.battery;

public class Drone implements BatteryPowered{

    private int remaining;
    private int remainingHours;

    @Override
    public int batteryUsagePerHour() {
        return 20;
    }

    /*@Override
    public int batteryAfterUse(float hours) {
        remaining = 100 - (batteryUsagePerHour() * (int) hours);
        return  remaining;
    }*/
}
