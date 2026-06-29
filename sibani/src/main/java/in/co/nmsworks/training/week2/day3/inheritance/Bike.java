package in.co.nmsworks.training.week2.day3.inheritance;

public class Bike extends Vehicle{
    private String colour;
    private Integer noOfTyres;

    public Bike(String colour, Integer noOfTyres) {
        this.colour = colour;
        this.noOfTyres = noOfTyres;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(Integer noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "colour='" + colour + '\'' +
                ", noOfTyres=" + noOfTyres + " " + super.toString() +
                '}';
    }
}
