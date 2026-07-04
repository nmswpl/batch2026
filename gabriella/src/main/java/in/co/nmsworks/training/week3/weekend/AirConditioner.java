package in.co.nmsworks.training.week3.weekend;

public class AirConditioner extends Device{

    public AirConditioner(Integer powerRating) {
        this.powerRating = powerRating;
    }



    @Override
    public String deviceOn() {
        deviceOn = true;
        return "Air conditioner is ON";
    }

    @Override
    public String deviceOff() {
        if (!deviceOn) {
            return "Air conditioner is already off";
        } else {
            usageCycles += 1;
            deviceOn = false;
            return "Air conditioner is OFF";
        }

    }
}
