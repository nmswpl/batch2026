package in.co.nmsworks.training.week3practices;



import java.util.ArrayList;
import java.util.List;
class Device {
    private String name;
    private int powerRating; // in Watts
    private int cycles;
    private boolean isOn;

    public Device(String name, int powerRating) {
        this.name = name;
        this.powerRating = powerRating;
        this.cycles = 0;
        this.isOn = false;
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
            cycles++; // One full ON -> OFF operation completes a cycle
            System.out.println(name + " is OFF");
        }
    }

    public int getEnergyConsumed() {
        return powerRating * cycles;
    }

    public String getName() { return name; }
    public int getPowerRating() { return powerRating; }
    public int getCycles() { return cycles; }
}



