package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private int id;
    private String name;
    Engine engine;

//    public Vehicle(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public Vehicle(int id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
