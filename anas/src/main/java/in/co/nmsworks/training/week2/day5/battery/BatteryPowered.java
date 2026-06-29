package in.co.nmsworks.training.week2.day5.battery;

public interface BatteryPowered {

    int batteryUsagePerHour();

    default int batteryAfterUse(float hours){
        int remaining = 100 - (batteryUsagePerHour() * (int) hours);
        return  remaining;
    }
}
