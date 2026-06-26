package in.co.nmsworks.training.week2.Day4;

import javax.sound.midi.Soundbank;

public class AbstractRunner {

        public static void main(String[] args) {

            DeviceUsage usageTracker = new DeviceUsage();

            BatteryPowered myPhone = new Phone();
            BatteryPowered myDrone = new Drone();

            System.out.println("Phone Status");
            usageTracker.printBatteryInfoAfterXHrsForDevice(myPhone, 3);

            System.out.println();

            System.out.println("Drone Status");
            usageTracker.printBatteryInfoAfterXHrsForDevice(myDrone, 2);
        }
    }



