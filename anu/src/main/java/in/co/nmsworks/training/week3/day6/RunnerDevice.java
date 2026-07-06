package in.co.nmsworks.training.week3.day6;

import java.util.Arrays;
import java.util.List;

public class RunnerDevice {
    public static void main(String[] args) {

        Device ac = new Device("Air Conditioner", 1500);
        Device fan = new Device("Fan", 75);
        Device light = new Device("Smart Light", 20);
        Device tv = new Device("Television", 150);

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

        List<Device> devices = Arrays.asList(ac, fan, light, tv);

        int totalPower = 0;

        for (Device d : devices) {
            int power = d.getPowerUsed();
            totalPower += power;

            System.out.println(d.name+" " + d.watts + " " +d.cycles + " " +power);
        }

        System.out.println("Total Power Consumed : " + totalPower + " Watts");

        double bill = (totalPower / 100.0) * 10;

        System.out.println("Electricity Bill:" + bill);
    }
}
