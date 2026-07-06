package in.co.nmsworks.training.week2.day5;
public class DeviceUsage{
    public static void main(String[] args) {
        Phone p =new Phone();
        Drone d= new Drone();
        printBatteryInfoAfterXHrsForDevice(p,5);
        printBatteryInfoAfterXHrsForDevice(d,10);


    }

    public  static void printBatteryInfoAfterXHrsForDevice(BatteryPowered  b,int h){
        System.out.println("Remaing battery percenatge after "+h+" hours "+b.batteryAfterUse(h));


    }
}