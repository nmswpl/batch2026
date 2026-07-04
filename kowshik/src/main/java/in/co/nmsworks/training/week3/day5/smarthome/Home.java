package in.co.nmsworks.training.week3.day5.smarthome;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Device> devices;
    private List<String> energyConsumptions;

    public Home() {
        this.devices = new ArrayList<>();
        this.energyConsumptions = new ArrayList<>();
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<String> getEnergyConsumptions() {
        return energyConsumptions;
    }

    public void setEnergyConsumptions(List<String> energyConsumptions) {
        this.energyConsumptions = energyConsumptions;
    }

    public void switchDeviceON(Device device) {
        if (device.isDeviceOn()) {
            System.out.println("Already device is ON");
            return;
        }

        device.setDeviceOn(true);
        energyConsumptions.add(device.getDeviceName() + " turned ON");
    }

    public void switchDeviceOFF(Device device) {
        if (!device.isDeviceOn()) {
            System.out.println("Already device is OFF");
            return;
        }

        device.setDeviceOn(false);
        device.setNoOfCycles(device.getNoOfCycles()+1);
        energyConsumptions.add(device.getDeviceName() + " turned OFF");
    }

    public void generateElectricityBill() {

        for (String energyConsumption : energyConsumptions) {
            System.out.println(energyConsumption);
        }

        printLine();
        System.out.println("Device \t\t\t Watts \t\t\t Cycles \t\t\t Power used");

        int totalEnergyConsumed = 0;
        for (Device device : devices) {
            totalEnergyConsumed += (device.getNoOfCycles()*device.getPowerRating());
            System.out.println(device.getDeviceName() + "\t\t\t" + device.getPowerRating() + "\t\t\t" + device.getNoOfCycles() + "\t\t\t" + (device.getPowerRating()*device.getNoOfCycles()));
        }

        printLine();

        System.out.println("Total power consumed : " + totalEnergyConsumed);

        double amount = ((double) totalEnergyConsumed / 100) * 10;
        System.out.println("Electricity Bill : " + amount);
    }

    private void printLine() {
        for (int i = 0; i < 75; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
