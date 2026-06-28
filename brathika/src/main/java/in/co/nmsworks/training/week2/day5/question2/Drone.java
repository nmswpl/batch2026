package in.co.nmsworks.training.week2.day5.question2;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 30;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int remainingBattery = 100 - batteryUsagePerHour() * (int)hours;
        return  remainingBattery;
    }
}
