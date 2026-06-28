package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone p = new Phone();
        Drone d = new Drone();
        printBatteryInfoAfterXHrsForDevice(p, 2);
        printBatteryInfoAfterXHrsForDevice(d,3);
    }
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        System.out.println("Battery remaining: "+ device.batteryAfterUse(noOfHrs));
        System.out.println("Remaining hrs: "  + device.batteryAfterUse(noOfHrs)/ device.batteryUsagePerHour());
    }
}
