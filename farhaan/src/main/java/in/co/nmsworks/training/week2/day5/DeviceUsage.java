package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone = new Phone();
        printBatteryInfoAfterXHrsForDevice(phone, 3);
        Drone drone = new Drone();
        printBatteryInfoAfterXHrsForDevice(drone, 6);
    }
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        System.out.println("The Remaining Battery Percentage is " + device.batteryAfterUse(noOfHrs) + " :: The remaining hours is : " + (float) device.batteryAfterUse(noOfHrs)/device.batteryUsagePerHour());
    }
}
