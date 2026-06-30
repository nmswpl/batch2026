package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {

    public void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs)
    {
        int usedAmount = device.batterAfterUse(noOfHrs);
        System.out.println("After Usage: ");
        int afterUse = 100 - usedAmount;
        System.out.println(afterUse);
        System.out.println("Remaining Hours: ");
        System.out.println(afterUse/device.batteryUsagePerHour());
    }
}
