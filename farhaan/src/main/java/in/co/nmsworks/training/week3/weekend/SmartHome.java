package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public static void main(String[] args) {
        ElectricalDevice ac = new AirConditioner();
        ElectricalDevice fan = new Fan();
        ElectricalDevice light = new SmartLight();
        ElectricalDevice tv = new Television();

        List<ElectricalDevice> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(tv);
        devices.add(light);
        devices.add(fan);

        ac.turnOn();
        ac.turnOff();
        ac.turnOn();
        ac.turnOff();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
        light.turnOn();
        light.turnOff();

        tv.turnOn();
        tv.turnOff();

        int totalPower = 0;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-15s%n", "Device", "Watts", "Cycles", "Power Used");
        System.out.println("-----------------------------------------------------------------------------");
        for (ElectricalDevice device : devices) {
            System.out.printf("%-20s %-10s %-10s %-15s%n", device.getName(), device.getPowerRating(), device.getCycleCount(), device.getPowerUsed());
            totalPower += device.getPowerUsed();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Total Power Consumed :: " + totalPower + " Watts " );
        System.out.println("Electricity Bill :: " + (double) totalPower/10);
    }
}
