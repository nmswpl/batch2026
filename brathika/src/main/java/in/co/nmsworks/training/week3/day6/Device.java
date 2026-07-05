package in.co.nmsworks.training.week3.day6;

public class Device {
    private String name;
    private Integer watt;
    private boolean isOn;
    private Integer completedCycle = 0;

    public Device() {
    }

    public Device(String name, Integer watt) {
        this.name = name;
        this.watt = watt;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWatt() {
        return watt;
    }

    public void setWatt(Integer watt) {
        this.watt = watt;
    }

    public Integer getCompletedCycle() {
        return completedCycle;
    }

    public void setCompletedCycle(Integer completedCycle) {
        this.completedCycle = completedCycle;
    }
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name+"   is ON");

        }
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(name+" is OFF");
            completedCycle ++;
        }
    }
    public int powerConsumed() {
        return watt * completedCycle;
    }
}
