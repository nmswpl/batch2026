package in.co.nmsworks.training.week3.weekendpractise;

import java.util.ArrayList;
import java.util.List;

public class HomeSimulation {
    List<ElectronicDevice> devices = new ArrayList<>();

    public static void main(String[] args) {

        HomeSimulation homeSimulation = new HomeSimulation();
        ElectronicDevice ac = new ElectronicDevice("AC","OFF",1500);
        ElectronicDevice smartLight = new ElectronicDevice("Smart Light","OFF",20);
        ElectronicDevice television = new ElectronicDevice("Television","OFF",150);

        ac.setState("ON");
        ac.setState("OFF");
        ac.setState("ON");
        ac.setState("OFF");
        smartLight.setState("ON");
        smartLight.setState("ON");
        television.setState("ON");
        television.setState("OFF");
        television.setState("ON");
        television.setState("OFF");
        television.setState("ON");
        television.setState("OFF");

        homeSimulation.devices.add(ac);
        homeSimulation.devices.add(smartLight);
        homeSimulation.devices.add(television);

        homeSimulation.displayDetails(homeSimulation.devices);

    }

    private void displayDetails(List<ElectronicDevice> devices) {

        System.out.println("\n********************************************************************************************\n");
        System.out.println("DEVICE\t\tWATTS\t\tCYCLES\t\tPOWER USED");
        System.out.println("\n********************************************************************************************\n");
        for (ElectronicDevice device : devices) {
            System.out.println(device.getDeviceName()+"\t\t\t"+device.getPowerRating()+"\t\t\t"+device.getCycle()+"\t\t\t"+(device.getPowerRating() * device.getCycle()));
        }
        System.out.println("\n********************************************************************************************\\n");
        System.out.println("TOTAL ENERGY CONSUMED : "+calculateTotalEnergyConsumed(devices));
        System.out.println("ELECTRICITY BILL : "+(float)((calculateTotalEnergyConsumed(devices)/10))+"\n");
    }

    private Integer calculateTotalEnergyConsumed(List<ElectronicDevice> devices) {

        Integer totalPoweredConsumed = 0;
        for (ElectronicDevice device : devices) {
            totalPoweredConsumed += (device.getPowerRating()*device.getCycle());
        }

        return totalPoweredConsumed;

    }
}
