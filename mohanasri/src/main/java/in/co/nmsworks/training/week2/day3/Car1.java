package in.co.nmsworks.training.week2.day3;

public class Car1 extends Vehicle{
        private int cc;
        Engine engine;


    public Car1(int cc, Engine engine) {
        this.cc = cc;
        this.engine = engine;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "cc=" + cc +
                ", engine=" + engine +
                '}';
    }
}


