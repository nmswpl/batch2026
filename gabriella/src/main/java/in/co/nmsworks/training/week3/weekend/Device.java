package in.co.nmsworks.training.week3.weekend;

public abstract class Device {
    protected Integer powerRating;
    protected boolean deviceOn;
    protected Integer usageCycles = 0;

    public Integer getPowerRating() {
        return powerRating;
    }

    public abstract String deviceOn();
    public abstract String deviceOff();
    public Integer calculateUsage(){
        return powerRating * usageCycles;
    }


}
