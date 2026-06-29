package in.co.nmsworks.training.week2.Day1.Day3.Vehicle;

public class Engine {
    private Integer Power;
    private boolean Has_Engine;

    public Integer getPower() {
        return Power;
    }

    public void setPower(Integer power) {
        Power = power;
    }

    public boolean isHas_Engine() {
        return Has_Engine;
    }

    public void setHas_Engine(boolean has_Engine) {
        Has_Engine = has_Engine;
    }

    public Engine(Integer power, boolean has_Engine) {
        this.Power = power;
        this.Has_Engine = has_Engine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Power=" + Power +
                ", Has_Engine=" + Has_Engine +
                '}';
    }
}
