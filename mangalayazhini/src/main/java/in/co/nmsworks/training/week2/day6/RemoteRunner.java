package in.co.nmsworks.training.week2.day6;

public class RemoteRunner {
    public static void main(String[] args) {

        Battery duracellBattery = new Battery("Duracell",100);
        SmartRemote sm = new SmartRemote(duracellBattery);

        duracellBattery.checkBatteryPower();
        sm.power();
        sm.changeChannel(20);
        sm.changeChannel("Sports");
        sm.changeChannel(1200);

    }
}
