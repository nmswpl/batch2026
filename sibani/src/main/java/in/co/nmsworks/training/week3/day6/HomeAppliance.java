package in.co.nmsworks.training.week3.day6;

public class HomeAppliance {
    private String name;
    private Integer watts;
    private Integer cycles;

    public HomeAppliance(String name, Integer watts, Integer cycles) {
        this.name = name;
        this.watts = watts;
        this.cycles = cycles;
    }

    public HomeAppliance() {
    }

    public String getName() {
        return name;
    }

    public Integer getWatts() {
        return watts;
    }

    public Integer getCycles() {
        return cycles;
    }

    @Override
    public String toString() {
        return "HomeAppliance{" +
                "name='" + name + '\'' +
                ", watts=" + watts +
                ", cycles=" + cycles +
                '}';
    }
    public void turnOn() {
        System.out.println(name + " is ON");
    }

    public void turnOff() {
        System.out.println(name + " is OFF");
        cycles ++;
    }

    public  Integer powerConsumed() {
        return watts * cycles;
    }
}
