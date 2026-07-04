package in.co.nmsworks.training.week3.weekend;

public class Fan extends Device{

    public Fan(Integer powerRating) {
        this.powerRating = powerRating;
    }

    @Override
    public String deviceOn() {
        deviceOn = true;
        return "Fan is ON";
    }

    @Override
    public String deviceOff() {
        if (!deviceOn) {
            return "Fan is already off";
        } else {
            usageCycles += 1;
            deviceOn = false;
            return "Fan is OFF";
        }

    }
}
