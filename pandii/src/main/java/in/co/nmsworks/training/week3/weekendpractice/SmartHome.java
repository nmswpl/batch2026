package in.co.nmsworks.training.week3.weekendpractice;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public static void main(String[] args) {
        SmartHome smartHome=new SmartHome();
        smartHome.runner();
    }

    private void runner() {
        Device device=new Device("Air Conditioner",1500,2);
        Device device1=new Device("Electronic Light",20,2);
        Device device2=new Device("Television",150,3);
        List<Device> deviceList=new ArrayList<>();
        deviceList.add(device);
        deviceList.add(device1);
        deviceList.add(device2);
        int totalConsumption=calculateConsumption(deviceList);
        calculateAmt(totalConsumption);
    }

    private void calculateAmt(int totalConsumption) {
        int ebBillAmt=totalConsumption/10;
        System.out.println("Electricity Bill : "+(float)ebBillAmt);
    }

    private int calculateConsumption(List<Device> deviceList) {
        int totalConsumption=0;
        for (Device device : deviceList) {
            for(int i=0;i<device.getCycles();i++)
            {
                System.out.println(device.getDeviceName()+" is ON");
                System.out.println(device.getDeviceName()+" is OFF");

            }
            totalConsumption+=device.getWatts()*device.getCycles();
        }
        System.out.println("------------------------------------------");
        System.out.println("Device  Watts  Cycle PowerUsed");
        System.out.println("------------------------------------------");
        for (Device device : deviceList) {
            System.out.println(device.getDeviceName()+" "+device.getWatts()+" "+device.getCycles()+" "+(device.getWatts()*device.getCycles()));
        }
        System.out.println("==========================================");
        System.out.println("Total power Consumed : "+totalConsumption);
        return totalConsumption;
    }
}
