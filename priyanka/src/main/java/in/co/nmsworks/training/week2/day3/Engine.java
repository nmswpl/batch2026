package in.co.nmsworks.training.week2.day3;

public class Engine {
    private String fuleType;
    private int cc;

    public Engine() {
    }

    public Engine(int cc, String fuleType) {
        this.cc = cc;
        this.fuleType = fuleType;
    }

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuleType='" + fuleType + '\'' +
                ", cc=" + cc +
                '}';
    }
}

