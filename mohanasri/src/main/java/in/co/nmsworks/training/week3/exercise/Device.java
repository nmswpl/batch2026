package in.co.nmsworks.training.week3.exercise;

public class Device {

    public Integer watts;
    String name;
    Integer cycle = 0;

    public Device() {
    }

    public Integer getWatts() {
        return watts;
    }

    public void setWatts(Integer watts) {
        this.watts = watts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Device(String name, Integer watts) {
        this.name = name;
        this.watts = watts;
    }

    public int calculatePower() {
        return watts * cycle;
    }

    public void turnOn() {
        System.out.println(name + " is ON");

    }

    public void turnOff() {
        System.out.println(name + " is OFF");
        cycle++;
    }

    @Override
    public String toString() {
        return "EnergyCalculator{" +
                "watts=" + watts +
                ", name='" + name ;
    }
}

