package in.co.nmsworks.week2.day5;

import org.apache.commons.collections.list.SynchronizedList;

import java.util.ArrayList;

public class DeviceUsage {
    public static void main(String[] args) {
        BatteryPowered bp = new Drone();
        System.out.println("----DRONE----");
        printBatteryInfoAfterXHrsForDevice(bp, 5);
        ArrayList<Integer> l = new ArrayList<>();

        BatteryPowered ph = new Phone();
        System.out.println("----PHONE----");
        printBatteryInfoAfterXHrsForDevice(ph, 5);


    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered bp, int batteryHours) {
        System.out.println("Remaining Battery :" + bp.batteryAfterUse(batteryHours) + " %");
        System.out.println("Remaining Hours :" + bp.batteryAfterUse(batteryHours) / bp.batteryUsagePerHour() + " hour");

    }


}
