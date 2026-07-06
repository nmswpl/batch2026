package in.co.nmsworks.training.week3.weekendpractise;

public class ElectronicDevice {
    private String deviceName;
    private String state;
    private Integer powerRating;
    private Integer cycle = 0;

    public ElectronicDevice(String deviceName, String state, Integer powerRating) {
        this.deviceName = deviceName;
        this.state = state;
        this.powerRating = powerRating;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        if("ON".equals(state) && "OFF".equals(newState))
        {
            this.setCycle(this.getCycle()+1);
            this.state = newState;
            System.out.println(getDeviceName()+" is ON");
        }
        else {
            this.state = newState;
            System.out.println(getDeviceName()+" is OFF");
        }

    }

    public Integer getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(Integer powerRating) {
        this.powerRating = powerRating;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    @Override
    public String toString() {
        return "ElectonicDevice{" +
                "deviceName='" + deviceName + '\'' +
                ", state='" + state + '\'' +
                ", powerRating=" + powerRating +
                ", cycle=" + cycle +
                '}';
    }
}
