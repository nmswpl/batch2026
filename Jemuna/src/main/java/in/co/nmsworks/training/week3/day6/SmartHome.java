package in.co.nmsworks.training.week3.day6;
public class SmartHome {
    public static void main(String[] args) {

        HomeAppliance ac = new HomeAppliance("Air Conditioner",1500,0);
        HomeAppliance tv = new HomeAppliance("Television",20,0);
        HomeAppliance smartLight = new HomeAppliance("Smart Light",150,0);

        ac.turnOn();
        ac.turnOff();
        tv.turnOn();
        tv.turnOff();
        smartLight.turnOn();
        smartLight.turnOff();
        ac.turnOn();
        ac.turnOff();

        HomeAppliance[] devices = {ac, tv, smartLight};

        int totalPower = 0;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Device      Watts     Cycle     Powers Used");
        for (HomeAppliance device : devices) {

            int powerUsed = device.getPowerUsed();
            totalPower += powerUsed;

            System.out.printf("%-20s %-10d %-10d %-10d%n", device.getName(), device.getWatts(), device.getCycles(), powerUsed);
        }

        double bill = (totalPower / 100.0) * 10;
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Power Consumed : " + totalPower + " Watts");
        System.out.println("Electricity Bill     : ₹" + bill);
    }
}