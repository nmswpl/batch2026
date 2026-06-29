package in.co.nmsworks.training.week2.Day5.Interface;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone samsung=new Phone();
        printBatteryInfoAfterXHrsForDevice(samsung,2);

        Drone azrx=new Drone();
        printBatteryInfoAfterXHrsForDevice(azrx,3);


    }

    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){

        device.batteryAfterUse(noOfHrs);
    }
}
