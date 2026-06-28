package in.co.nmsworks.week2.day5;

public class Phone implements BatteryPowered {
    public int batteryUsagePerHour() {
        return 15;
    }

    public int batteryAfterUse(float hours) {
        int remainingBattery = (int) (100 - (hours * (batteryUsagePerHour())));

        return remainingBattery;
    }


}
