package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle{
    private int noOfTyres;
    private String model;

    public Bike() {
    }

    public Bike(int noOfTyres, String model) {
        this.noOfTyres = noOfTyres;
        this.model = model;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String colour) {
        this.model = colour;
    }


    @Override
    public String toString() {
        return "Bike{" +
                "noOfTyres=" + noOfTyres +
                ", model='" + model + '\'' +
                ", cc=" + e.getCc() +
                ", fuel type=" + e.getFuleType() +
                '}';
    }
}
