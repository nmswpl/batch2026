package in.co.nmsworks.training.week2.Day5;

public class DeviceUsage {

    public static void main(String[] args) {

        BatteryPowered phone=new Phone();
        BatteryPowered drone=new Drone();

        System.out.println("Phone----------");
        printBatteryInfoAfterXHrsForDevice(phone,5);
        System.out.println("Drone--------------");
        printBatteryInfoAfterXHrsForDevice(drone,5);
    }

    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        int remainingbatteryusage=device.batteryAfterUse(noOfHrs);
        System.out.println("remainig : " +remainingbatteryusage);

        float remaininghours=(float) (remainingbatteryusage/device.batteryUsagePerHour());
        System.out.println("remaining hours : " +remaininghours);
    }
}
