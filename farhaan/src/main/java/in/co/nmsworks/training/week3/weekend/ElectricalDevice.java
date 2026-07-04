package in.co.nmsworks.training.week3.weekend;

public abstract class ElectricalDevice {
    String name;
    int powerRating;
    boolean isOn;
    int cycleCount;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is ON");
        }
        else{
            System.out.println(name + " is Already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            cycleCount++;
            System.out.println(name + " is OFF");
        }
        else {
            System.out.println(name + " is Already OFF");
        }
    }

    public int getPowerUsed(){
        return powerRating * cycleCount;
    }

    public ElectricalDevice(String name, int powerRating) {
        this.name = name;
        this.powerRating = powerRating;
        this.isOn = false;
        this.cycleCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(int cycleCount) {
        this.cycleCount = cycleCount;
    }
}
