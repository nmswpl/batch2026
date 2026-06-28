package in.co.nmsworks.training.week2.day5.battery;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone ph = new Phone();
        Drone drone = new Drone();

        printBatteryInfoAfterXHrsForDevice(ph, 7);
        printBatteryInfoAfterXHrsForDevice(drone,3);
    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered batteryPowered, int hours) {
        System.out.println("Remaining battery : "+batteryPowered.batteryAfterUse(hours)+ " %");
        System.out.println("Remaining Hours : "+ batteryPowered.batteryAfterUse(hours)/batteryPowered.batteryUsagePerHour());
    }
}
