package in.co.nmsworks.training.week3.day6;

import java.util.ArrayList;
import java.util.List;

public class DeviceRunner {
    public static void main(String[] args) {
        AC ac = new  AC("AC",false,0,1500);
        Tv tv = new Tv("Tv",false,0,150);
        List<Device>devices = new ArrayList<>();
        devices.add(ac);
        devices.add(tv);
        ac.toggleOn();
        ac.toggleOff();
        tv.toggleOn();
        tv.toggleOff();
        int totalPowerConsumed = 0 ;
        System.out.print("device"+"\t");
        System.out.print("watts"+"\t");
        System.out.print("cycles"+"\t");
        System.out.print("powerused"+"\t");
        System.out.println();
        System.out.println("--------------");
        for (Device device : devices) {
            System.out.print(device.getDeviceName()+"\t");
            System.out.print(device.getWattsPerCycle()+"\t");
            System.out.print(device.getCount()+"\t");
            System.out.println(device.powerUsage()+"\t");
            totalPowerConsumed += device.powerUsage();
            System.out.println("--------------");

        }
        System.out.println("total PowerConsumed :"+totalPowerConsumed);
        System.out.println("electricity bill : "+totalPowerConsumed*0.10);




    }
}
