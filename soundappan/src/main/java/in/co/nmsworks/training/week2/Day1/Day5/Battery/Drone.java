package in.co.nmsworks.training.week2.Day1.Day5.Battery;

public class Drone implements BatteryPowered {
    private int drone_level = 90;

    public int batteryUsagePerHour() {
        return 7;
    }

    public int batteryAfterUse(float hours) {
        drone_level = (int) (drone_level - batteryUsagePerHour() * hours);
        return drone_level;

    }
}
