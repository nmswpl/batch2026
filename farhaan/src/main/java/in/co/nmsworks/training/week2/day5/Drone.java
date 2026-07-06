package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int usage = (int) (100 - batteryUsagePerHour()*hours);
        if(usage <= 0) return 0;
        return usage;
    }

}
