package in.co.nmsworks.training.week2.day4;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone = new Phone();

        Drone drone = new Drone();

        printBatteryInfoAfterXHrsForDevice(drone,7);
        printBatteryInfoAfterXHrsForDevice(phone,6);

    }
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs) {
        int remainingBattery = device.batteryAfterUse(noOfHrs);
        System.out.println("Battery Percentage Remaining : " + remainingBattery);
        System.out.println(" Remining Hours Battery can be used : " + (remainingBattery/device.batteryUsagePerHour()));

    }
}
