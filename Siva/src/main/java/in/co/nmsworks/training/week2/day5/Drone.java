package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 25;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int currentUsage = (batteryUsagePerHour() * (int)hours);
        System.out.println("For Drone ");
        if (100 - currentUsage <= 0) {
            System.out.println("Remaining Hours : 0");
            return 0;
        }
        System.out.println("Remaining Hours : "+ (100 - currentUsage) / batteryUsagePerHour());
        return 100 - currentUsage;
    }
}
