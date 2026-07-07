package in.co.nmsworks.training.week2.day5.question2;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Drone drone = new Drone();
        System.out.println("Phone Battery");
        printBatteryInfoAfterXHrsForDevice(phone, 2);
        System.out.println("Drone Battery");
        printBatteryInfoAfterXHrsForDevice(drone,3);
    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered batteryPowered, int noOfHours) {
        int usagePerHour = batteryPowered.batteryUsagePerHour();
        System.out.println("Battery Used Per Hour: "+usagePerHour+"%");
        int batteryUsed = noOfHours * usagePerHour;
        System.out.println("Battery Drained : "+batteryUsed+"%");
        float remainingBattery = batteryPowered.batteryAfterUse(noOfHours);
        System.out.println("Battery Remaining After Usage: "+remainingBattery+"%");
        System.out.println("Remaining time the battery can be used is "+(remainingBattery/usagePerHour)+" hours");
    }
}
