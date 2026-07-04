package in.co.nmsworks.training.week3.weekend;

public class SmartLight extends Device{

    public SmartLight(Integer powerRating) {
        this.powerRating = powerRating;
    }

    @Override
    public String deviceOn() {
        deviceOn = true;
        return "Smart light is ON";
    }

    @Override
    public String deviceOff() {
        if (!deviceOn) {
            return "Smart light is already off";
        } else {
            usageCycles += 1;
            deviceOn = false;
            return "Smart light is OFF";
        }

    }
}
