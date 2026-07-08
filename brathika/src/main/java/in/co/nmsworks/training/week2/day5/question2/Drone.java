package in.co.nmsworks.training.week2.day5.question2;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 30;
    }

    @Override
    public int batteryAfterUse(float hours) {
        double remainingBattery = 100 - batteryUsagePerHour() * hours;
        return  (int) remainingBattery;
    }
}
