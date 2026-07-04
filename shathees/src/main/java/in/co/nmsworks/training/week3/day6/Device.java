package in.co.nmsworks.training.week3.day6;

public abstract class Device {
    private String deviceName;
    boolean isOn;
    int count;
    int wattsPerCycle;

    public Device(String deviceName, boolean isOn, int count, int wattsPerCycle) {
        this.deviceName = deviceName;
        this.isOn = isOn;
        this.count = count;
        this.wattsPerCycle = wattsPerCycle;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWattsPerCycle() {
        return wattsPerCycle;
    }

    public void setWattsPerCycle(int wattsPerCycle) {
        this.wattsPerCycle = wattsPerCycle;
    }

    abstract  void toggleOn();
    abstract  void toggleOff();
    abstract  int countCycle();
    abstract  int powerUsage();
}
