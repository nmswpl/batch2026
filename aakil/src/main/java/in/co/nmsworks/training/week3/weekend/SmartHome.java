package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public static void main(String[] args) {
        SmartHome myHome = new SmartHome();

        List<ElectricalDevice> devices = new ArrayList<>();

        devices.add(new AirConditioner(1500));
        devices.add(new Television(150));
        devices.add(new SmartLight(20));
        devices.add(new Fan(50));

        /* SIMULATING ELECTRICAL DEVICE USAGE */
        for (ElectricalDevice device : devices) {
            for (int j = 0; j < Math.random() * 6; j++) {
                device.turnOn();
                device.turnOff();
            }
        }

        myHome.generateElectricityBall(devices);
    }

    private void generateElectricityBall(List<ElectricalDevice> devices) {
        System.out.println("-----------------------------------------------------------\n" +
                "Device               Watts      Cycles     Power Used\n" +
                "------------------------------------------------------------");
        devices.forEach(d -> {
            System.out.printf("%-20s %-10s %-10s %-15s%n", d.getName(), d.getPowerRating(), d.getCycles(), d.getPowerUsed());
        });
        int totalPowerUsed = devices.stream().mapToInt(ElectricalDevice::getPowerUsed).sum();
        System.out.println("------------------------------------------------------------");
        System.out.println("TOTAL POWER CONSUMED = " + totalPowerUsed);
        System.out.println("ELECTRICITY BILL = ₹" + (double)(totalPowerUsed / 10));
    }
}
