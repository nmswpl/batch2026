package in.co.nmsworks.training.Week3.Map.Day6.SmartHome;

public class Device {
    private String deviceName;
    private int powerRating;
    private boolean isOn;
    private int cycles;

    public Device(String deviceName, int powerRating) {
        this.deviceName = deviceName;
        this.powerRating = powerRating;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCycles() {
        return cycles;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(deviceName + " is ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            cycles++;
            System.out.println(deviceName + " is OFF");
        }
    }

    public int getPowerUsed() {
        return powerRating * cycles;
    }
}
