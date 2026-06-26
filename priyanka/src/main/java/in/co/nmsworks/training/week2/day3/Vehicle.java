package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    Engine e;

    public Engine getE() {
        return e;
    }

    public void setE(Engine e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "e=" + e +
                '}';
    }
}


