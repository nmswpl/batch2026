package in.co.nmsworks.training.week3.exercise;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    public static void main(String[] args) {

        Device television = new Device("Television ", 1400);
        Device light = new Device("Smart light ", 20);
        Device airConditioner = new Device("Air Conditioner ",150);

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(television);
        deviceList.add(light);
        deviceList.add(airConditioner);

        airConditioner.turnOn();
        airConditioner.turnOff();
        light.turnOn();
        light.turnOff();
        airConditioner.turnOn();
        airConditioner.turnOff();
        television.turnOn();
        television.turnOff();

        System.out.println("---------------------------------------------------");
        System.out.println("Device        Watts   Cycles  Power Used"   );
        int totalPower = 0;
        for(Device d : deviceList) {
            System.out.println(d.getName() + "    " + d.getWatts() + "    " + d.getCycle() + "   " + d.getWatts());
            totalPower += d.getWatts();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total power consumed :     " + totalPower );
        System.out.println("Electricity Bill     :     " + totalPower * 0.1);

}
}

