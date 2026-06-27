package in.co.nmsworks.training.week2.day5;

public class DeviceUsage {
    public static void main(String[] args) {

        Phone p = new Phone();
        Drone d = new Drone();
        DeviceUsage du = new DeviceUsage();
        du.printBatteryInfoAfterXHrsForDevice(p, 2);
        du.printBatteryInfoAfterXHrsForDevice(d, 3);
    }

      public void printBatteryInfoAfterXHrsForDevice (BatteryPowered device,int noOfHrs){

            System.out.println("battery percentage: " + device.batteryAfterUse(noOfHrs));
            int remainingTime = (device.batteryAfterUse(noOfHrs)) / device.batteryUsagePerHour();
            System.out.println("Remaining: " + remainingTime + " hrs");
        }
    }

