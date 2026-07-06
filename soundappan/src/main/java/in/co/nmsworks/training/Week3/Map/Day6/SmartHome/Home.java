package in.co.nmsworks.training.Week3.Map.Day6.SmartHome;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Device> devices;

    public Home() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public int getTotalPower() {
        int total = 0;

        for (Device device : devices) {
            total += device.getPowerUsed();
        }

        return total;
    }

    public void showReport() {

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "Device", "Watts", "Cycles", "Power Used");
        System.out.println("------------------------------------------------------------");

        for (Device device : devices) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    device.getDeviceName(),
                    device.getPowerRating(),
                    device.getCycles(),
                    device.getPowerUsed());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Total Power Consumed : " + getTotalPower() + " Watts");
    }
}
