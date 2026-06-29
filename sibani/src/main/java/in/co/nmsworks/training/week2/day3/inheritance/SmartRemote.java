package in.co.nmsworks.training.week2.day3.inheritance;

public class SmartRemote extends BasicRemote{
    private Integer channelNumber;

    public Integer getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    @Override
    void powerButtonRoutine() {
        System.out.println("Opening Netflix and Home Screen...");
    }
}
