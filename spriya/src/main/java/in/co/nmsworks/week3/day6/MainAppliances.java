package in.co.nmsworks.week3.day6;

import java.util.ArrayList;
import java.util.List;

public class MainAppliances {
    public static void main(String[] args) {

        MainAppliances appliances = new MainAppliances();

        List<HomeAppliances> devices = appliances.getAppliancesDetails();
        appliances.printBill(devices);


    }

    private void printBill(List<HomeAppliances> devices) {

        for (int i = 0; i < devices.size(); i++) {
            int cycles = devices.get(i).getNoOfCycles();
            for (int j = 0; j < cycles; j++) {
                System.out.println(devices.get(i).getName() + " is ON");
                System.out.println(devices.get(i).getName() + " is OFF");

            }
        }

        int totalPowerConsumed = 0;
        System.out.println("----------------------------------------------------------");
        System.out.println("Devices" + "    " + "Watts" + "    " + "Cycles" + "    " + "Power used");
        System.out.println("----------------------------------------------------------");
        for (HomeAppliances device : devices) {
            int powerUsed = device.getNoOfCycles() * device.getWatts();
            System.out.print(device.getName() + "    ");
            System.out.print(device.getWatts() + "    ");
            System.out.print(device.getNoOfCycles() + "    ");

            System.out.print(powerUsed);
            totalPowerConsumed += powerUsed;
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Total Power Used :" + totalPowerConsumed);
        System.out.println("Electricity Bill :" + totalPowerConsumed / 10);


    }

    private List<HomeAppliances> getAppliancesDetails() {
        HomeAppliances airConditioner = new HomeAppliances("Air Conditioner", 2000, 2);
        HomeAppliances fan = new HomeAppliances("Fan", 1500, 2);
        HomeAppliances smartLight = new HomeAppliances("Smart Light", 500, 4);
        HomeAppliances tv = new HomeAppliances("TV", 1000, 1);

        List<HomeAppliances> list = new ArrayList<>();
        list.add(airConditioner);
        list.add(fan);
        list.add(smartLight);
        list.add(tv);
        return list;

    }
}
