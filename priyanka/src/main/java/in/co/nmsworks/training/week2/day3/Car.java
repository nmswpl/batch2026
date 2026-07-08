package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{
    private int noOfTyres;
    private String model;

    public Car() {
    }

    public Car(int noOfTyres, String model) {
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

    public void setModel(String model) {
        this.model = model;
    }



    @Override
    public String toString() {
        return "Cars{" +
                "noOfTyres=" + noOfTyres +
                ", model='" + model + '\'' +
                ", cc=" + e.getCc() +
                ", fuel type=" + e.getFuleType() +
                '}';
    }
}
