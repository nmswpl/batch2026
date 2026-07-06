package in.co.nmsworks.training.week2.day5;

public class RunnerBattery {
    public static void main(String[] args) {
        Phone p = new Phone();
        Drone d = new Drone();
        printBatteryInfoAfterXHrsForDevice(p,10);
    }
    static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        System.out.println("No of Hours:"+noOfHrs+ "After battery usage :"+device.batteryAfterUse(noOfHrs));
    }
}
