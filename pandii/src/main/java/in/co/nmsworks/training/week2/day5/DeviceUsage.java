package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone=new Phone();
        Drone drone=new Drone();

        printBatteryInfoAfterXHrsForDevice(phone,6);
        printBatteryInfoAfterXHrsForDevice(drone,2.5F);

    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered batteryPowered,float noOfHrs) {
        System.out.println("Battery usage per hr : "+batteryPowered.batteryUsagePerHour());
        System.out.println("Remaining battery after use : "+batteryPowered.batteryAfterUse(noOfHrs));
    }
}
