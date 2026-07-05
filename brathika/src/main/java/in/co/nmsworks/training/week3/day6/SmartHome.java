package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        Device ac = new Device("Air Conditioner",1500);
        Device tv = new Device("Television",500);
        Device light = new Device("Smart Light",160);
        devices.add(ac);
        devices.add(tv);
        devices.add(light);
        ac.turnOn();
        ac.turnOff();

        ac.turnOn();
        ac.turnOff();
        tv.turnOn();
        tv.turnOff();
        light.turnOn();
        light.turnOff();
        generateElectricbill(devices);
    }

    private static void generateElectricbill(List<Device> devices) {
        int totalWatt = 0;
        for (Device device : devices) {
            int power = device.powerConsumed();
            totalWatt += power;
            System.out.println(device.getName()+"  "+device.getWatt()+"   "+device.getCompletedCycle()+"    "+power);

        }
        System.out.println("Total power consumed is: "+totalWatt);
        double electricBill = ((double) totalWatt / 100) * 10;
        System.out.println("Electric bill : Rs."+electricBill);
    }
}
