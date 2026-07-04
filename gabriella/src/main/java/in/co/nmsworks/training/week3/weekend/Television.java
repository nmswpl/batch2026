package in.co.nmsworks.training.week3.weekend;

public class Television extends Device{

    public Television(Integer powerRating) {
        this.powerRating = powerRating;
    }

    @Override
    public String deviceOn() {
        deviceOn = true;
        return "Television is ON";
    }

    @Override
    public String deviceOff() {
        if (!deviceOn) {
            return "Television is already off";
        } else {
            usageCycles += 1;
            deviceOn = false;
            return "Television is OFF";
        }

    }
}
