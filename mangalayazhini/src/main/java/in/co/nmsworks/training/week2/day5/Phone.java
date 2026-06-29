package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{
    private int batteryUsagePerHr;
    private int batteryPercentage;

    Phone(int batteryPercentage , int batteryUsagePerHr){
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
        return "Phone{" +
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

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
