package in.co.nmsworks.training.week3.day6;

public class Device {
    private String name;
    private Integer powerRating;
    private Integer cycles;
    private boolean isOn;

    public Device() {

    }

    public Device(String name, Integer powerRating) {
        this.name = name;
        this.powerRating = powerRating;
        this.cycles = 0;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(Integer powerRating) {
        this.powerRating = powerRating;
    }

    public Integer getCycles() {
        return cycles;
    }

    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    public void on() {
        if (!isOn){
            isOn=true;
        }
        System.out.println(name + "Turned on");
    }

    public void off() {

        if(isOn){
            isOn=false;
        }
        System.out.println(name + "Turned off");
        cycles++;
    }

}
