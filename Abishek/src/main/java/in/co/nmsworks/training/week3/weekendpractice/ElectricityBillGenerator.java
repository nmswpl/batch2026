package in.co.nmsworks.training.week3.weekendpractice;
import java.util.*;
public class ElectricityBillGenerator {

    public static void main(String[] args) {
            ElectricityBillGenerator eb = new ElectricityBillGenerator();
            setValuesInWattsInfo();
            eb.run();
        }

        private void run() {
            List<String> homeUsageData = getHomeUsageData();
            Map<String, Integer> deviceUsageCycle = getDeviceUsageCycle(homeUsageData);
            billGenerator(deviceUsageCycle);

        }

        private void billGenerator(Map<String, Integer> deviceUsageCycle) {
            Integer totalPowerConsumed = 0;
            Map<String, Integer> deviceToWatts = WattsInfo.deviceToWatts;
            System.out.println("------------------------------------------");
            System.out.println("Device\t Watts\t Cycles\t Power used");
            System.out.println("------------------------------------------");
            for (String device : deviceToWatts.keySet()) {
                totalPowerConsumed += deviceToWatts.get(device)*deviceUsageCycle.get(device);
                System.out.println(device+"\t\t"+deviceToWatts.get(device)+"\t\t"+deviceUsageCycle.get(device)+"\t\t"+deviceToWatts.get(device)*deviceUsageCycle.get(device));
            }
            System.out.println("------------------------------------------");
            System.out.println("Total Power Consumed : "+totalPowerConsumed+" Watts");
            System.out.println("Electicity Bill : Rs."+(totalPowerConsumed/10));
        }

        private static void setValuesInWattsInfo() {
            WattsInfo.deviceToWatts.put("Air Conditioner", 1500);
            WattsInfo.deviceToWatts.put("Smart Light", 20);
            WattsInfo.deviceToWatts.put("Television", 150);
        }

        private Map<String, Integer> getDeviceUsageCycle(List<String> homeUsageData) {
            Map<String, Integer> deviceUsageCycle = new HashMap<>();
            for (String usageData : homeUsageData) {
                if (usageData.endsWith("OFF")){
                    String deviceName = usageData.substring(0,usageData.indexOf(" is "));
                    deviceUsageCycle.put(deviceName, deviceUsageCycle.getOrDefault(deviceName,0)+1);
                }
            }
            return deviceUsageCycle;
        }

        private List<String> getHomeUsageData() {
            List<String> homeUsageData = new ArrayList<>();
            homeUsageData.add("Air Conditioner is ON");
            homeUsageData.add("Air Conditioner is OFF");
            homeUsageData.add("Air Conditioner is ON");
            homeUsageData.add("Air Conditioner is OFF");
            homeUsageData.add("Smart Light is ON");
            homeUsageData.add("Smart Light is OFF");
            homeUsageData.add("Television is ON");
            homeUsageData.add("Television is OFF");
            homeUsageData.add("Television is ON");
            homeUsageData.add("Television is OFF");
            homeUsageData.add("Television is ON");
            homeUsageData.add("Television is OFF");
            return homeUsageData;
        }
    }
