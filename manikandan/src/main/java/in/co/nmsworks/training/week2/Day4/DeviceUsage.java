package in.co.nmsworks.training.week2.Day4;


public class DeviceUsage {

    public void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs) {

        int remainingBattery = device.batteryAfterUse(noOfHrs);
        int usagePerHour = device.batteryUsagePerHour();

        int remainingHours = 0;
        if (usagePerHour > 0) {
            remainingHours = remainingBattery / usagePerHour;
        }

        System.out.println("Battery percentage: " + remainingBattery + "%");
        System.out.println("Remaining hours: " + remainingHours + " hours");
    }
}