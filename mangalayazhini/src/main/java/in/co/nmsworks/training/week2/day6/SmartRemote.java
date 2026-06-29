package in.co.nmsworks.training.week2.day6;

public class SmartRemote extends BasicRemote {
    private int channelNumber;
    private Battery remoteBattery;

    SmartRemote(Battery remoteBattery){
        this.remoteBattery = remoteBattery;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        if(channelNumber <= 0 || channelNumber >999){
            System.out.println("Invalid channel number!");
        }
        else{
            this.channelNumber = channelNumber;
        }

    }

    public Battery getRemoteBattery() {
        return remoteBattery;
    }

    public void setRemoteBattery(Battery remoteBattery) {
        this.remoteBattery = remoteBattery;
    }

    public void power(){
        System.out.println("Opening Netflix and Home Screen...");
    }

    public void changeChannel(int channel) {
        if(channel <= 0 || channel >999){
            System.out.println("Invalid channel number!");
        }
        else{
            System.out.println("Switching directly to Channel: " + channel);
        }
    }

    public void changeChannel(String network) {
        System.out.println("Searching network guides... Switched to: " + network);
    }

}
