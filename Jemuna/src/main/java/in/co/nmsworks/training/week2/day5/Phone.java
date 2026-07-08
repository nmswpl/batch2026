package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{
    private int usagePerHour = 10;


    @Override
    public int batteryUsagePerHour() {
        return usagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int batteryPercentageAfterUse = (int) ( 100-(hours*batteryUsagePerHour()));
        System.out.println("The Phone battery after use: "+batteryPercentageAfterUse+"%");
        int remainingHours = batteryPercentageAfterUse/usagePerHour;
        System.out.println("Remaining hours battery can be used "+ remainingHours+ " hrs");
        return remainingHours;
    }
}
