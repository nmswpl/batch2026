package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeRunner {
    public static void main(String[] args) {
        List<Device> homeDevices = new ArrayList<>();
        Device AirConditioner = new Device("Ac", 1500);
        homeDevices.add(AirConditioner);
        AirConditioner.on();
        AirConditioner.off();
        AirConditioner.on();
        AirConditioner.off();

        int totalPowerConsumed = 0;

        for (Device homeDevice : homeDevices) {
            int powerUsed = homeDevice.getPowerRating()*homeDevice.getCycles();
            totalPowerConsumed += powerUsed;
            System.out.println(homeDevice.getName() + " " + homeDevice.getPowerRating() + " " + homeDevice.getCycles() + " " + powerUsed);
        }
        double electricityBill = totalPowerConsumed * 0.1;
        System.out.println("Electricity bill:"+electricityBill);
        System.out.println("Total Current Used:"+totalPowerConsumed);
    }
}
