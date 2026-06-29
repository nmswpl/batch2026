package in.co.nmsworks.training.week2.day5;

public class DeviceRunner {

    public static void main(String[] args) {

        DeviceRunner runner = new DeviceRunner();

        Phone myPhone = new Phone(90, 10);
        runner.printBatteryInfoAfterXHrsForDevice(myPhone,5);

        Drone drone = new Drone(100, 30);
        runner.printBatteryInfoAfterXHrsForDevice(drone,3);

    }

    public void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHours){

        System.out.println("\n"+device);
        System.out.println("The Battery percentage after " + noOfHours + " hours of using the device is : "+ device.batteryAfterUse(noOfHours) +"%");
    }

}
