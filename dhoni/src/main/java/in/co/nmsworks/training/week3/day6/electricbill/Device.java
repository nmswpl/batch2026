package in.co.nmsworks.training.week3.day6.electricbill;

public class Device {
    private String name;
    private int watts;
    private int cycles;

    public Device(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

}
