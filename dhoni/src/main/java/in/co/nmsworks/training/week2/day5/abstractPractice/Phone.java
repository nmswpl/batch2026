package in.co.nmsworks.training.week2.day5.abstractPractice;

public class Phone implements BatteryPowered{
    private int batteryLevel;

    public Phone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batteryAfterUse(float hours) {

        batteryLevel = (int) (batteryLevel - batteryUsagePerHour() * hours);
        return batteryLevel;
    }

}
