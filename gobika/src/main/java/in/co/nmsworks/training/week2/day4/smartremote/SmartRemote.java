package in.co.nmsworks.training.week2.day4.smartremote;

public class SmartRemote extends BasicRemote{

    private int channelNumber;
    private Battery battery;

    public SmartRemote(Battery battery) {
        this.battery = battery;
    }


    @Override
    public void powerButton() {
        System.out.println("Opening Netflix and Home Screen...");
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        if (channelNumber < 0 || channelNumber > 999){
            System.err.println("Reject : Invalid channel number");
        }
        else {
            this.channelNumber = channelNumber;
        }
    }
    public void changeChannel(int channelNumber){
        System.out.println("Switching directly to Channel : "+channelNumber);
    }
    public  void changeChannel(String channelName){
        System.out.println("Searching network guides... Switched to : "+ channelName);
    }
    public void checkPowerLevel(){
        System.out.println("Brand Name : "+ battery.getBrandName());
        System.out.println("Power Level : "+ battery.getPowerLevel());
    }
}
