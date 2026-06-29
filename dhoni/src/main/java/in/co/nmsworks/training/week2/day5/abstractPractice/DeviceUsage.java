package in.co.nmsworks.training.week2.day5.abstractPractice;

public class DeviceUsage {
    public static void main(String[] args) {

        Phone phone = new Phone(100);
        Drone drone = new Drone(100);

        printBatteryInfoAfterXHrsForDevice(phone,7);
        printBatteryInfoAfterXHrsForDevice(drone,2);
    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs) {
        System.out.println("Battery level after " + noOfHrs + " hr : " + device.batteryAfterUse(noOfHrs));
        System.out.println("Remaining hours : " + device.batteryAfterUse(0)/ device.batteryUsagePerHour() );
    }

}
