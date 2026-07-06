package in.co.nmsworks.training.week2.day4.smartremote;

public class Runner {
    public static void main(String[] args) {
        SmartRemote smartRemote = new SmartRemote( new Battery("Duracell", 100));
        smartRemote.setChannelNumber(8955);
        smartRemote.changeChannel(smartRemote.getChannelNumber());
        smartRemote.changeChannel("Sports");
        smartRemote.powerButton();
        smartRemote.checkPowerLevel();

    }
}
