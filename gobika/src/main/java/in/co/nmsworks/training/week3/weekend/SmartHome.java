package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    static List<String> logs = new ArrayList<>();
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        List<DeviceDetails> devices = new ArrayList<>();
        DeviceDetails device1 = new DeviceDetails("Air Conditioner",1500);
        DeviceDetails device2 = new DeviceDetails("Television",150);
        DeviceDetails device3 = new DeviceDetails("Smart Light",20);

        devices.add(device1);
        devices.add(device2);
        devices.add(device3);

        smartHome.toggleDeviceState(device1);
        smartHome.toggleDeviceState(device2);
        smartHome.toggleDeviceState(device1);
        smartHome.toggleDeviceState(device3);
        smartHome.toggleDeviceState(device1);
        smartHome.toggleDeviceState(device2);
        smartHome.toggleDeviceState(device1);
        smartHome.toggleDeviceState(device3);

        smartHome.generateElectricityBill(devices);
    }

    private void generateElectricityBill(List<DeviceDetails> devices) {
        Integer totalEnergyConsumed = 0;
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("____________________________________________________________________________");
        System.out.println("Devices    Watts   Cycles   Power Used");
        for (DeviceDetails device : devices) {
            System.out.println(device.getDeviceName() +" "+device.getPowerRating()+" "+device.getUsageCycle()+" "+device.getEnergyConsumed());
            totalEnergyConsumed += device.getEnergyConsumed();
        }
        System.out.println("____________________________________________________________________________");
        System.out.println("Total Energy Consumed : "+ totalEnergyConsumed);
        System.out.println("Electricity Bill : "+ totalEnergyConsumed/10);
    }


    private void toggleDeviceState(DeviceDetails device) {
        if (!device.isOn()){
            device.setOn(true);
            logs.add(device.getDeviceName()+" is ON");

        }
        else {
            device.setOn(false);
            device.setUsageCycle(device.getUsageCycle()+1);
            device.setEnergyConsumed(device.getPowerRating() * device.getUsageCycle());
            logs.add(device.getDeviceName()+" is OFF");
        }
    }
}
