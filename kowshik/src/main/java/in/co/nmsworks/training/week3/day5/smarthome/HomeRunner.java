package in.co.nmsworks.training.week3.day5.smarthome;

public class HomeRunner {
    public static void main(String[] args) {

        Home home = new Home();

        Device ac = new Device("Air Conditioner", 750);
        Device tv = new Device("Television", 50);
        Device light = new Device("Smart Light", 20);

        home.getDevices().add(ac);
        home.getDevices().add(tv);
        home.getDevices().add(light);

        home.switchDeviceON(ac);
        home.switchDeviceON(tv);
        home.switchDeviceON(light);
        home.switchDeviceOFF(light);
        home.switchDeviceON(light);
        home.switchDeviceOFF(tv);
        home.switchDeviceOFF(ac);
        home.switchDeviceOFF(light);
        home.switchDeviceON(ac);
        home.switchDeviceOFF(ac);

        home.generateElectricityBill();
    }

}
