package in.co.nmsworks.training.week3.weekendpractice;

public class Device {
    private String deviceName;
    private Integer watts;
    private Integer cycles;

    public Device(String deviceName, Integer watts, Integer cycles) {
        this.deviceName = deviceName;
        this.watts = watts;
        this.cycles = cycles;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getWatts() {
        return watts;
    }

    public void setWatts(Integer watts) {
        this.watts = watts;
    }

    public Integer getCycles() {
        return cycles;
    }

    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", watts=" + watts +
                ", cycles=" + cycles +
                '}';
    }
}
