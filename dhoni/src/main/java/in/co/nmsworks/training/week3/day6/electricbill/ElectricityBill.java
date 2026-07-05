package in.co.nmsworks.training.week3.day6.electricbill;

import java.util.HashMap;
import java.util.Map;

public class ElectricityBill {
    public static void main(String[] args) {

        Map<String, Device> map = getStringDeviceMap();
        SmartHome smartHome = new SmartHome(map);

        smartHome.deviceUse("Air Conditioner");
        smartHome.deviceUse("Smart Light");
        smartHome.deviceUse("Television");
        
        smartHome.printBill();
    }

    private static Map<String, Device> getStringDeviceMap() {
        Map<String, Device> map = new HashMap<>();
        map.put("Air Conditioner", new Device("Air Conditioner",15000));
        map.put("Smart Light", new Device("Smart Light",20));
        map.put("Television", new Device("Television",150));
        return map;
    }
}
