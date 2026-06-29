package in.co.nmsworks.training.week2.Day5.Interface;

public class Drone  implements BatteryPowered{
    float hours;
    int batteryUsagePerHour = 20;
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
        System.out.println("Drone Battery usage After Usage is:"+ remainingPercentAfterUse);
        int usable = remainingPercentAfterUse /batteryUsagePerHour;
        System.out.println("Drone Can be used for about :"+usable + " Hours");
        return remainingPercentAfterUse;
    }

}


