package in.co.nmsworks.training.Week3.Map.Day6.SmartHome;

public class SmartHomeRunner {
    public static void main(String[] args) {

        Home home = new Home();

        AirConditioner ac = new AirConditioner();
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

        BillGenerator billGenerator = new BillGenerator();

        double bill = billGenerator.calculateBill(home.getTotalPower());

        System.out.println();
        System.out.println("Electricity Bill : ₹" + bill);
    }
}
