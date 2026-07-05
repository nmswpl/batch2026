package in.co.nmsworks.training.week3.day6;

public class HomeAppliance {

    private String name;
    private int watts;
    private int cycles;

    public HomeAppliance() {
    }

    public HomeAppliance(String name, int watts, int cycles) {
        this.name = name;
        this.watts = watts;
        this.cycles = cycles;
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

    public void turnOn(){
        System.out.println(name+" is ON");
    }

    public void turnOff(){
        System.out.println(name+" is OFF");
        cycles++;
    }

    public int getPowerUsed(){
        return watts*cycles;
    }


}
