package in.co.nmsworks.training.week2.day3;

public class Engine {
    private String engineType;
    private int cc;

    public Engine(String engineType, int cc) {
        this.engineType = engineType;
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                ", cc=" + cc +
                '}';
    }
}
