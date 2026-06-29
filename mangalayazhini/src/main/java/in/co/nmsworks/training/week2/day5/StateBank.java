package in.co.nmsworks.training.week2.day5;

public class StateBank extends Bank{

    private Double interest;

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public Double getRateOfInterest() {
        return interest;
    }
}
