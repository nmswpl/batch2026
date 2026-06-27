package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {

    public static void main(String[] args) {

        BatteryPowered phone = new Phone();
        BatteryPowered drone = new Drone();

        printBatteryInfoAfterXHrsForDevice(phone,3);
        printBatteryInfoAfterXHrsForDevice(drone,3);

    }
    static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs)
    {
        int value = device.batteryAfterUse(noOfHrs);
        System.out.println("Battery Percentage : " + value + "\nRemaining Hours : " + ((100 / device.batteryUsagePerHour())-noOfHrs));
    }
}
