package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{
    int usagePerHour = 10;


    @Override
    public int batteryUsagePerHour() {
        return usagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int afterBatteryPercentage = (int) ( 100-(hours*batteryUsagePerHour()));
        System.out.println("The Phone battery after use: "+afterBatteryPercentage+"%");
        int remainingBatteryPercentage = afterBatteryPercentage/usagePerHour;
        System.out.println("Remaining hours battery can be used "+ remainingBatteryPercentage);
        return 0;
    }
}
