package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void showReport() {

        int totalPower = 0;

        System.out.println("-----------------------------------------------");
        System.out.println(" Device "+" Watts "+" Cycles "+" Power Used ");
        System.out.println("-----------------------------------------------");

        for (Device device : devices) {

            System.out.println(
                    device.getName()+" "+
                    device.getWatts()+" "+
                    device.getCycles()+" "+
                    device.getPowerUsed());

            totalPower += device.getPowerUsed();
        }

        System.out.println("-----------------------------------------------");

        double bill = totalPower / 10;

        System.out.println("Total Power Consumed : " + totalPower + " Watts");
        System.out.println("Electricity Bill     : " + bill);
    }
}
