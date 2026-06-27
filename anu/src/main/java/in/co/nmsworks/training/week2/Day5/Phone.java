package in.co.nmsworks.training.week2.Day5;

public class Phone implements BatteryPowered{
    int usageperHour=15;
     int batteryDrain;
    @Override
    public int batteryUsagePerHour() {
        return usageperHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int result= (int) (hours*batteryUsagePerHour());
        batteryDrain= 100-result;
        return batteryDrain ;
    }
}
