package in.co.nmsworks.training.week2.day3;

class Bike extends Vehicle {
    private String model;
    Engine engine;

    public Bike(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}