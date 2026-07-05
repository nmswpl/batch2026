package in.co.nmsworks.training.week3.day6;

public class SmartHome {
    public static void main(String[] args) {
        HomeAppliance ac = new HomeAppliance("Air Conditioner", 1700, 0);
        HomeAppliance  light = new HomeAppliance("Smart Light", 20, 0);
        HomeAppliance tv = new HomeAppliance("Television", 150, 0);
        ac.turnOn();
        ac.turnOff();
        ac.turnOn();
        ac.turnOff();
        light.turnOn();
        light.turnOff();
        tv.turnOn();
        tv.turnOff();
        tv.turnOn();
        tv.turnOff();
        tv.turnOn();
        tv.turnOff();
        HomeAppliance[] devices = {ac, light, tv};
        Integer totalPower = 0;
        System.out.println("------------------------------------------------------------");
        System.out.println("Device               Watts      Cycles     Power Used");
        System.out.println("------------------------------------------------------------");
        for (HomeAppliance device : devices) {
            Integer powerUsed = device.powerConsumed();
            totalPower += powerUsed;
            System.out.println(device.getName()      + "       " +device.getWatts()+        "          " +     device.getCycles()  +  "            "    +powerUsed);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Power used : " + totalPower + " Watts");
        double billAmount = (totalPower /100) * 10 ;
        System.out.println("Electricity Bill : ₹" + billAmount);
    }
}
