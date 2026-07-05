package in.co.nmsworks.training.week3.day5;

public class Device {

    private String name;
    private int watts;
    private boolean isOn;
    private int cycles;

    public Device(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " is ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            cycles++;
            System.out.println(name + " is OFF");
        }
    }

    public int getPowerUsed() {
        return watts * cycles;
    }

    public String getName() {
        return name;
    }

    public int getWatts() {
        return watts;
    }

    public int getCycles() {
        return cycles;
    }
}
