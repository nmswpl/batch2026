package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Drone drone = new Drone();

        printBatteryInfoAfterXHrsForDevice(phone, 4);
        printBatteryInfoAfterXHrsForDevice(drone, 6);

    }
    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        int remainingBattery = device.batteryAfterUse(noOfHrs);
        System.out.println("Battery remaining = " + remainingBattery + "%");
        int remainingHours = remainingBattery / device.batteryUsagePerHour();
        System.out.println("Remaining hours = " + remainingHours + " hours");
    }
}
