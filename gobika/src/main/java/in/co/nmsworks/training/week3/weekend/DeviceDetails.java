package in.co.nmsworks.training.week3.weekend;

public class DeviceDetails {
    private String deviceName;
    private Integer powerRating;
    private boolean isOn;
    private Integer usageCycle = 0;
    private Integer energyConsumed = 0;

    public DeviceDetails() {
    }

    public DeviceDetails(String deviceName, Integer powerRating) {
        this.deviceName = deviceName;
        this.powerRating = powerRating;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(Integer powerRating) {
        this.powerRating = powerRating;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Integer getUsageCycle() {
        return usageCycle;
    }

    public void setUsageCycle(Integer usageCycle) {
        this.usageCycle = usageCycle;
    }

    public Integer getEnergyConsumed() {
        return energyConsumed;
    }

    public void setEnergyConsumed(Integer energyConsumed) {
        this.energyConsumed = energyConsumed;
    }
}
