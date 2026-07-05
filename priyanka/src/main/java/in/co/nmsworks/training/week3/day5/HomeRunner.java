package in.co.nmsworks.training.week3.day5;

public class HomeRunner {

    public static void main(String[] args) {

        Home home = new Home();

        Ac ac = new Ac();
        SmartLight light = new SmartLight();
        Television tv = new Television();

        home.addDevice(ac);
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

        home.showReport();
    }
}