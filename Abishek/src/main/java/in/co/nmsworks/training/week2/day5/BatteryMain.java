package in.co.nmsworks.training.week2.day5;

public class BatteryMain {

    public static void main(String[] args) {

        DeviceUsage device = new DeviceUsage();
        BatteryPowered phone = new Phone();
        BatteryPowered drone = new Drone();
        System.out.println("For phone: ");
        device.printBatteryInfoAfterXHrsForDevice(phone,5);
        System.out.println("For drone: ");
        device.printBatteryInfoAfterXHrsForDevice(drone,3);

    }
}
