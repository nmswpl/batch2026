package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    private int batteryUsagePerHr;
    private int batteryPercentage;

    Drone(int batteryPercentage , int batteryUsagePerHr){
        this.batteryPercentage = batteryPercentage;
        this.batteryUsagePerHr = batteryUsagePerHr;
    }

    @Override
    public int batteryUsagePerHour() {
        return batteryUsagePerHr;
    }

    @Override
    public int batteryAfterUse(float hrs) {
        batteryPercentage = batteryPercentage - (int)(batteryUsagePerHr*hrs);
        return batteryPercentage;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "batteryUsagePerHr=" + batteryUsagePerHr +
                ", batteryPercentage=" + batteryPercentage +
                '}';
    }

    public int getBatteryUsagePerHr() {
        return batteryUsagePerHr;
    }

    public void setBatteryUsagePerHr(int batteryUsagePerHr) {
        this.batteryUsagePerHr = batteryUsagePerHr;
    }
}
