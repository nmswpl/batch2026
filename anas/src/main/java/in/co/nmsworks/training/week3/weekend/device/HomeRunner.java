package in.co.nmsworks.training.week3.weekend.device;

public class HomeRunner {

    public static void main(String[] args) {

        Device ac = new Device("Air Conditioner", 1500);
        Device fan = new Device("Fan", 75);
        Device light = new Device("Smart Light", 20);
        Device tv = new Device("Television", 150);

        Home home = new Home();

        home.addDevice(ac);
        home.addDevice(fan);
        home.addDevice(light);
        home.addDevice(tv);

        ac.turnOn();
        ac.turnOff();
        ac.turnOn();
        ac.turnOff();

        light.turnOn();
        light.turnOff();

        tv.turnOn();
        tv.turnOff();
        tv.turnOn();
        tv.turnOff();
        tv.turnOn();
        tv.turnOff();

        home.printReport();
    }
}
