package in.co.nmsworks.training.week3.weekend;

public abstract class ElectricalDevice {
    private boolean isOn;
    private int powerRating;
    private int cycles;
    private String name;

    protected ElectricalDevice(String name, int powerRating) {
        this.name = name;
        isOn = false;
        this.powerRating = powerRating;
        this.cycles = 0;
    }

    public void turnOff() {
        if (!isOn()) {
            setOn(true);
            System.out.println(getName() + " is turned OFF");
        }
    }

    public void turnOn() {
        if (isOn()) {
            setOn(false);
            setCycles(getCycles() + 1);
            System.out.println(getName() + " is turned ON");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public int getCycles() {
        return cycles;
    }

    private void setCycles(int cycles) {
        this.cycles = cycles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerUsed(){
        return getCycles() * getPowerRating();
    }
}
