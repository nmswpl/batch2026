package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {

        BatteryPowered drone = new Drone();
        BatteryPowered phone = new Phone();

        printBatteryInfoAfterXHrsForDevice(drone,2);
        printBatteryInfoAfterXHrsForDevice(phone, 1);

    }

    static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        device.batteryAfterUse(noOfHrs);
        device.batteryUsagePerHour();


    }
}
