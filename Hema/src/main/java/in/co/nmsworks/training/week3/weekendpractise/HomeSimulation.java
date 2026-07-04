package in.co.nmsworks.training.week3.weekendpractise;

import java.util.ArrayList;
import java.util.List;

public class HomeSimulation {
    List<ElectonicDevice> devices = new ArrayList<>();

    public static void main(String[] args) {

        HomeSimulation homeSimulation = new HomeSimulation();
        ElectonicDevice ac = new ElectonicDevice("AC","OFF",1500);
        ElectonicDevice smartLight = new ElectonicDevice("Smart Light","OFF",20);
        ElectonicDevice television = new ElectonicDevice("Television","OFF",150);

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

    private void displayDetails(List<ElectonicDevice> devices) {

        System.out.println("\n********************************************************************************************\n");
        System.out.println("DEVICE\t\tWATTS\t\tCYCLES\t\tPOWER USED");
        System.out.println("\n********************************************************************************************\n");
        for (ElectonicDevice device : devices) {
            System.out.println(device.getDeviceName()+"\t\t\t"+device.getPowerRating()+"\t\t\t"+device.getCycle()+"\t\t\t"+(device.getPowerRating() * device.getCycle()));
        }
        System.out.println("\n********************************************************************************************\\n");
        System.out.println("TOTAL ENERGY CONSUMED : "+calculateTotalEnergyConsumed(devices));
        System.out.println("ELECTRICITY BILL : "+(float)((calculateTotalEnergyConsumed(devices)/10))+"\n");
    }

    private Integer calculateTotalEnergyConsumed(List<ElectonicDevice> devices) {

        Integer totalPoweredConsumed = 0;
        for (ElectonicDevice device : devices) {
            totalPoweredConsumed += (device.getPowerRating()*device.getCycle());
        }

        return totalPoweredConsumed;

    }
}
