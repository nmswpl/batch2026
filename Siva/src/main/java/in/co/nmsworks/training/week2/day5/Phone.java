package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{

    @Override
    public int batteryAfterUse(float hours) {
        int currentUsage = (batteryUsagePerHour() * (int)hours);
        System.out.println("For Phone  ");
        if (100 - currentUsage <= 0) {
            System.out.println("Remaining Hours : 0");
            return 0;
        }
        System.out.println("Remaining Hours : "+ (100 - currentUsage) / batteryUsagePerHour());
        return 100 - currentUsage;
    }

    @Override
    public int batteryUsagePerHour() {
        return 11;
    }
}
