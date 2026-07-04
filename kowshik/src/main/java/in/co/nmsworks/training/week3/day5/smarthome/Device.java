package in.co.nmsworks.training.week3.day5.smarthome;

public class Device {
    private String deviceName;
    private int powerRating;
    private boolean isDeviceOn;
    private int noOfCycles;

    public Device(String deviceName, int powerRating) {
        this.deviceName = deviceName;
        this.powerRating = powerRating;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public boolean isDeviceOn() {
        return isDeviceOn;
    }

    public void setDeviceOn(boolean deviceOn) {
        isDeviceOn = deviceOn;
    }

    public int getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(int noOfCycles) {
        this.noOfCycles = noOfCycles;
    }
}
