package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {
        DeviceUsage deviceUsage = new DeviceUsage();

        Phone phone = new Phone();
        Drone drone = new Drone();

        deviceUsage.printBatteryInfoAfterXHrsForDevice(phone, 22);
        deviceUsage.printBatteryInfoAfterXHrsForDevice(drone, 23);

        deviceUsage.printBatteryInfoAfterXHrsForDevice(phone, 2);
        deviceUsage.printBatteryInfoAfterXHrsForDevice(drone, 3);

        deviceUsage.printBatteryInfoAfterXHrsForDevice(phone, 22);
        deviceUsage.printBatteryInfoAfterXHrsForDevice(drone, 23);

        deviceUsage.printBatteryInfoAfterXHrsForDevice(phone, 12);
        deviceUsage.printBatteryInfoAfterXHrsForDevice(drone, 13);
    }

    void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        int batteryAfterUsage = device.batteryAfterUse(noOfHrs);

        if(batteryAfterUsage == -1){
            System.out.println("Insufficient Battery!!!");
            return;
        }

        System.out.println("Battery Info : " + batteryAfterUsage);
        System.out.println("Remaining Hours : " + ((batteryAfterUsage)/device.batteryUsagePerHour()));
    }
}
