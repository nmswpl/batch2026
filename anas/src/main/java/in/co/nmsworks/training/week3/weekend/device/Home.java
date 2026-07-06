package in.co.nmsworks.training.week3.weekend.device;

import java.util.ArrayList;
import java.util.List;

public class Home {

    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void printReport() {

        int totalPower = 0;

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "Device", "Watts", "Cycles", "Power Used");
        System.out.println("------------------------------------------------------------");

        for (Device device : devices) {

            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    device.getName(),
                    device.getWatts(),
                    device.getCycles(),
                    device.getPowerUsed());

            totalPower += device.getPowerUsed();
        }

        double bill = (totalPower / 100.0) * 10;

        System.out.println("------------------------------------------------------------");
        System.out.println("Total Power Consumed : " + totalPower + " Watts");
        System.out.println("Electricity Bill     : ₹" + bill);
    }
}