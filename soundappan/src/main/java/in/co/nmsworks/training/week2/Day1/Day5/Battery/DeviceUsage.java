package in.co.nmsworks.training.week2.Day1.Day5.Battery;

public class DeviceUsage  {
    public static void main(String[] args) {
        BatteryPowered phone=new Phone();
        BatteryPowered drone=new Drone();
        printBatteryInfoAfterXhrsForDevice(phone,7);
        printBatteryInfoAfterXhrsForDevice(drone,7);
    }
    private static void printBatteryInfoAfterXhrsForDevice(BatteryPowered device,float hours) {
        System.out.println("Battery Usage Per Hour : "+ device.batteryUsagePerHour());
        System.out.println("Battery After "+hours+" Hours : "+device.batteryAfterUse(hours));
    }
}
