package in.co.nmsworks.training.week3.day6.electricbill;

import java.util.Map;

public class SmartHome {

    private Map<String,Device> map;

    public SmartHome(Map<String, Device> map) {
        this.map = map;
    }

    public void deviceUse(String deviceName){
        map.get(deviceName).setCycles( map.get(deviceName).getCycles()+1 );
        System.out.println(deviceName + " is ON");
        System.out.println(deviceName + " is OFF");
    }

    public float calculatePowerUsed(String deviceName){
        return map.get(deviceName).getWatts() * map.get(deviceName).getCycles();
    }

    public void printBill(){

        float totalWatts = 0;
        System.out.printf("%-20s %-10s %-10s %-15s%n", "Device", "Watts", "Cycles", "Power Used");
        for(Map.Entry<String,Device> device : map.entrySet()){
            System.out.printf("%-20s %-10d  %-10d  %.2f %n",
                    device.getKey(),
                    device.getValue().getWatts(),
                    device.getValue().getCycles(),
                    calculatePowerUsed(device.getKey()) );
            totalWatts = totalWatts + device.getValue().getWatts();
        }
        float totalBill = totalWatts/100;
        System.out.println("Total Power Consumed : " + Math.round(totalWatts) + " Watts");
        System.out.println("Electricity Bill : " + Math.round(totalBill));
    }

    public Map<String, Device> getMap() {
        return map;
    }

    public void setMap(Map<String, Device> map) {
        this.map = map;
    }
}
