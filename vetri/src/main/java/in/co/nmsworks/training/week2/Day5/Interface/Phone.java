package in.co.nmsworks.training.week2.Day5.Interface;

public class Phone implements BatteryPowered{
    float hours;
    int batteryUsagePerHour = 10;
    int fullCharge=100;

    @Override
    public int batteryUsagePerHour() {
        return batteryUsagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int TotalPercentageUsed = batteryUsagePerHour * (int)hours;
        //System.out.println(TotalPercentageUsed);
        int remainingPercentAfterUse = fullCharge- TotalPercentageUsed;
        System.out.println("Phone Battery usage After Usage is:"+ remainingPercentAfterUse);
        int usable = remainingPercentAfterUse /batteryUsagePerHour;
        System.out.println("Phone Can be used for about :"+usable + " Hours");
        return remainingPercentAfterUse;
    }

}


