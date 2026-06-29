package in.co.nmsworks.training.week2.day5.battery;

public class DeviceUsage {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Drone drone = new Drone();
        DeviceUsage deviceUsage= new DeviceUsage();

        deviceUsage.batteryInfoAfterUse(phone,5);
        deviceUsage.batteryInfoAfterUse(drone,4);
    }


    void batteryInfoAfterUse(BatteryPowered device, int noOfHrs){
        device.batteryUsagePerHour();
        int remaining = device.batteryAfterUse(noOfHrs);
        int remainingHours = device.batteryAfterUse(noOfHrs) / device.batteryUsagePerHour();

        System.out.println("remaining battery : " + remaining + "\n" + "remaining hours : " + remainingHours);
    }
}
