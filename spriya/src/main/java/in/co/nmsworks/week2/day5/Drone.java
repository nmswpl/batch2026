package in.co.nmsworks.week2.day5;

public class Drone implements BatteryPowered {

    public int batteryUsagePerHour() {
        return 10;
    }

    public int batteryAfterUse(float hours) {
        return (int) (100 - (hours * batteryUsagePerHour()));
    }
}
