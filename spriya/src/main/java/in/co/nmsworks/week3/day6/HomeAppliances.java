package in.co.nmsworks.week3.day6;

public class HomeAppliances {
    private int watts;
    private int noOfCycles;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HomeAppliances(String name, int watts, int noOfCycles) {
        this.watts = watts;
        this.noOfCycles = noOfCycles;
        this.name = name;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public int getNoOfCycles() {
        return noOfCycles;
    }

    public void setNoOfCycles(int noOfCycles) {
        this.noOfCycles = noOfCycles;
    }
}
